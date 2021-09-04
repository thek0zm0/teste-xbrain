package com.xbrainteste.testebackend.resources;

import com.xbrainteste.testebackend.entities.Sale;
import com.xbrainteste.testebackend.repositories.SaleRepository;
import com.xbrainteste.testebackend.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleResource
{
    @Autowired
    private SaleService saleService;

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
}
