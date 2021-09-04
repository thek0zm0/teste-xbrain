package com.xbrainteste.testebackend.repositories;

import com.xbrainteste.testebackend.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.time.Instant;
import java.time.LocalDate;
import java.util.List;


// This class save sellers in the database
@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>
{
    List<Sale> findAllByDateBetween(Instant startDate, Instant endDate);
}
