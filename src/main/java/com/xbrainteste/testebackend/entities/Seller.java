package com.xbrainteste.testebackend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_seller")
public class Seller implements Serializable
{
    // Serializable
    private static final long serialVersionUID = -3631374094216017714L;
    // Basic Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Relationship
    @OneToMany(mappedBy = "seller")
    private List<Sale> sales = new ArrayList<>();

    // Constructors
    public Seller(){}
    public Seller(Long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Sale> getSales()
    {
        return sales;
    }

    // Hashcode and Equals
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
