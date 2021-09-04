package com.xbrainteste.testebackend.resources;

import com.xbrainteste.testebackend.entities.Sale;
import com.xbrainteste.testebackend.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
