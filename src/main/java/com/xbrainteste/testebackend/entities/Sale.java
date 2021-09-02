package com.xbrainteste.testebackend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_sale")
public class Sale implements Serializable
{
    // Serializable
    private static final long serialVersionUID = -4807760851502480079L;
    // Basic Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double value;
    private Instant date;

    // Relationship
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    // Constructors
    public Sale(){}
    public Sale(Long id, Double value, Instant date, Seller seller)
    {
        this.id = id;
        this.value = value;
        this.date = date;
        this.seller = seller;
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

    public Double getValue()
    {
        return value;
    }

    public void setValue(Double value)
    {
        this.value = value;
    }

    public Instant getDate()
    {
        return date;
    }

    public void setDate(Instant date)
    {
        this.date = date;
    }

    public Seller getSeller()
    {
        return seller;
    }

    public void setSeller(Seller seller)
    {
        this.seller = seller;
    }

    // Hash code and equals

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(id, sale.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}