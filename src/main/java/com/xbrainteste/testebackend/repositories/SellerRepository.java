package com.xbrainteste.testebackend.repositories;

import com.xbrainteste.testebackend.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

// This class save sellers in the database
public interface SellerRepository extends JpaRepository<Seller, Long>
{
}
