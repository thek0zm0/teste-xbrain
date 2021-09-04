package com.xbrainteste.testebackend.config;

import com.xbrainteste.testebackend.entities.Sale;
import com.xbrainteste.testebackend.entities.Seller;
import com.xbrainteste.testebackend.repositories.SaleRepository;
import com.xbrainteste.testebackend.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

// Database seeding (test profile)
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner
{
    // Dependency Injection
    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public void run(String... args) throws Exception
    {
        Seller se1 = new Seller(null, "Aurora Rubina");
        Seller se2 = new Seller(null, "Edgar Rom");
        Seller se3 = new Seller(null, "Clemente Dion");
        Seller se4 = new Seller(null, "Lucia Norberto");
        Seller se5 = new Seller(null, "Olga Rodolfo");

        Sale sa1 = new Sale(null, 14.0, Instant.parse("2020-06-20T07:20:00Z"), se1);
        Sale sa2 = new Sale(null, 19.0, Instant.parse("2020-01-20T09:40:00Z"), se2);
        Sale sa3 = new Sale(null, 55.0, Instant.parse("2020-04-20T14:50:00Z"), se3);
        Sale sa4 = new Sale(null, 10.0, Instant.parse("2020-07-20T17:50:00Z"), se4);
        Sale sa5 = new Sale(null, 67.0, Instant.parse("2020-09-20T11:20:00Z"), se5);
        Sale sa6 = new Sale(null, 98.0, Instant.parse("2020-01-20T12:10:00Z"), se1);
        Sale sa7 = new Sale(null, 42.0, Instant.parse("2020-02-20T15:30:00Z"), se2);
        Sale sa8 = new Sale(null, 66.0, Instant.parse("2020-03-20T12:20:00Z"), se3);
        Sale sa9 = new Sale(null, 81.0, Instant.parse("2020-09-20T10:10:00Z"), se4);

        sellerRepository.saveAll(Arrays.asList(se1,se2,se3,se4,se5));
        saleRepository.saveAll(Arrays.asList(sa1,sa2,sa3,sa4,sa5,sa6,sa7,sa8,sa9));
    }
}
