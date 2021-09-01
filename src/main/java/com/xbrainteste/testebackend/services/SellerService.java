package com.xbrainteste.testebackend.services;

import com.xbrainteste.testebackend.entities.Seller;
import com.xbrainteste.testebackend.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerService
{
    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> findAll()
    {
        return sellerRepository.findAll();
    }

    public Seller findById(Long id)
    {
        Optional<Seller> seller = sellerRepository.findById(id);

        return seller.get();
    }
}
