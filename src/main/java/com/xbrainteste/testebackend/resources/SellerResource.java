package com.xbrainteste.testebackend.resources;

import com.xbrainteste.testebackend.entities.Seller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
public class SellerResource
{
    @GetMapping
    public ResponseEntity<Seller> findAll()
    {
        Seller seller = new Seller(1L, "Mike");
        return ResponseEntity.ok().body(seller);
    }
}
