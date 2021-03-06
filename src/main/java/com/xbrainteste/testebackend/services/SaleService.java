package com.xbrainteste.testebackend.services;

import com.xbrainteste.testebackend.entities.Sale;
import com.xbrainteste.testebackend.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class SaleService
{
    @Autowired
    private SaleRepository saleRepository;

    // Find all sales
    public List<Sale> findAll()
    {
        return saleRepository.findAll();
    }

    // Find sale by id
    public Sale findById(Long id)
    {
        Optional<Sale> Sale = saleRepository.findById(id);

        return Sale.get();
    }

    // Create new sale
    public Sale insert(Sale sale)
    {
        return saleRepository.save(sale);
    }
}
