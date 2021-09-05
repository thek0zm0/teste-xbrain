package com.xbrainteste.testebackend.Dto;

public class SellerDTO
{
    private Long id;
    private String name;
    private Double dailyAverageQty;
    private Double dailyAverageAmount;
    private Double salesQty;


    public SellerDTO(){}

    public SellerDTO(Long id, String name, Double dailyAverageQty, Double dailyAverageAmount, Double salesQty)
    {
        this.id = id;
        this.name = name;
        this.dailyAverageQty = dailyAverageQty;
        this.dailyAverageAmount = dailyAverageAmount;
        this.salesQty = salesQty;
    }

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

    public Double getDailyAverageQty()
    {
        return dailyAverageQty;
    }

    public void setDailyAverageQty(Double dailyAverageQty)
    {
        this.dailyAverageQty = dailyAverageQty;
    }

    public Double getDailyAverageAmount()
    {
        return dailyAverageAmount;
    }

    public void setDailyAverageAmount(Double dailyAverageAmount)
    {
        this.dailyAverageAmount = dailyAverageAmount;
    }

    public Double getSalesQty()
    {
        return salesQty;
    }

    public void setSalesQty(Double salesQty)
    {
        this.salesQty = salesQty;
    }
}
