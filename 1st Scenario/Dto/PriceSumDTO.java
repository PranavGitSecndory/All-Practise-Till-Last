package com.example.Product_Management.Dto;

import java.util.List;

import com.example.Product_Management.Model.Product;




public class PriceSumDTO {
    private List<Product> products;
    private Double price;
    //private long count;
    public List<Product> getProducts() {
        return products;
    }
    public PriceSumDTO(List<Product> products, Double price) {
        this.products = products;
        this.price = price;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    
}