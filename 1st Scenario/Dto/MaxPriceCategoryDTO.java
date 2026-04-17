package com.example.Product_Management.Dto;

import java.util.List;

import com.example.Product_Management.Model.Product;

public class MaxPriceCategoryDTO {
      private String name;
    private Double price;

    public MaxPriceCategoryDTO(Product product) {
        this.name = product.getName();
        this.price = product.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // getters and setters
   
}
