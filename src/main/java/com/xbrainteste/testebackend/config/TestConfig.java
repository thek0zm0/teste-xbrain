package com.xbrainteste.testebackend.config;

import com.xbrainteste.testebackend.entities.Seller;
import com.xbrainteste.testebackend.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

// Database seeding (test profile)
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner
{
    // Dependency Injection
    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public void run(String... args) throws Exception
    {
        Seller se1 = new Seller(null, "Aurora Rubina");
        Seller se2 = new Seller(null, "Edgar Rom");
        Seller se3 = new Seller(null, "Clemente Dion");
        Seller se4 = new Seller(null, "Lucia Norberto");
        Seller se5 = new Seller(null, "Olga Rodolfo");

        sellerRepository.saveAll(Arrays.asList(se1,se2,se3,se4,se5));
    }
}
