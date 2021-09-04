package com.xbrainteste.testebackend.Dto;

import com.xbrainteste.testebackend.entities.Seller;

public class SellerDTO
{
    private Seller seller;

    private Double dailyAverageByDates;

    public SellerDTO(){}

    public SellerDTO(Seller seller, Double dailyAverageByDates)
    {
        this.seller = seller;
        this.dailyAverageByDates = dailyAverageByDates;
    }

    public Seller getSeller()
    {
        return seller;
    }

    public void setSeller(Seller seller)
    {
        this.seller = seller;
    }

    public Double getDailyAverageByDates()
    {
        return dailyAverageByDates;
    }

    public void setDailyAverageByDates(Double dailyAverageByDates)
    {
        this.dailyAverageByDates = dailyAverageByDates;
    }
}
