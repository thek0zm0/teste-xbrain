package com.xbrainteste.testebackend.repositories;

import com.xbrainteste.testebackend.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This class save sellers in the database
@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>
{
}
