package com.xbrainteste.testebackend.resources;

import com.xbrainteste.testebackend.Dto.SellerDTO;
import com.xbrainteste.testebackend.entities.Sale;
import com.xbrainteste.testebackend.repositories.SaleRepository;
import com.xbrainteste.testebackend.repositories.SellerRepository;
import com.xbrainteste.testebackend.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/sales")
public class SaleResource
{
    @Autowired
    private SaleService saleService;

    @Autowired
    private SaleRepository saleRepository;

    @GetMapping
    public ResponseEntity<List<Sale>> findAll()
    {
        List<Sale> list = saleService.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Sale> finById(@PathVariable Long id)
    {
        Sale sale = saleService.findById(id);
        return ResponseEntity.ok().body(sale);
    }

    @PostMapping
    public ResponseEntity<Sale> saveSale(@RequestBody Sale sale)
    {
        sale = saleService.insert(sale);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                    path("/{id}").buildAndExpand(sale.getId()).toUri();
        return ResponseEntity.created(uri).body(sale);
    }

    @GetMapping(value = "/between")
    public List<SellerDTO> findBetween(@RequestParam Instant startDate,
                                                    @RequestParam Instant endDate)
    {
        long days = Duration.between(startDate,endDate).toDays();

        return saleRepository.findAllByDateBetween(startDate, endDate).stream()
                .filter( sale -> sale.getDate().isBefore(endDate) && sale.getDate().isAfter(startDate))
                .collect(Collectors.groupingBy(Sale::getSeller))
                .entrySet()
                .stream()
                .map( x->
                {
                    Double total = 0.0;
                    for(Sale sale : x.getValue())
                    {
                        total += sale.getValue();
                    }
                    return new SellerDTO(x.getKey(), total/days);
                }).collect(Collectors.toList());
    }
}
