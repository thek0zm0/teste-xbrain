package com.xbrainteste.testebackend.services;

import com.xbrainteste.testebackend.entities.Sale;
import com.xbrainteste.testebackend.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SaleService
{
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findAll()
    {
        return saleRepository.findAll();
    }

    public Sale findById(Long id)
    {
        Optional<Sale> Sale = saleRepository.findById(id);

        return Sale.get();
    }

    public Sale insert(Sale sale)
    {
        return saleRepository.save(sale);
    }
}
