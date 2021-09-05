package com.xbrainteste.testebackend.resources;

import com.xbrainteste.testebackend.entities.Seller;
import com.xbrainteste.testebackend.repositories.SellerRepository;
import com.xbrainteste.testebackend.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerResource
{
    @Autowired
    private SellerService sellerService;

    // Find all sellers
    @GetMapping
    public ResponseEntity<List<Seller>> findAll()
    {
        List<Seller> list = sellerService.findAll();

        return ResponseEntity.ok().body(list);
    }

    // Find seller by id Endpoint
    @GetMapping(value = "/{id}")
    public ResponseEntity<Seller> finById(@PathVariable Long id)
    {
        Seller seller = sellerService.findById(id);
        return ResponseEntity.ok().body(seller);
    }
}
