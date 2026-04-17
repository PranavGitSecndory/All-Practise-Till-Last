package com.example.Product_Management.Dto;

import java.util.List;

import com.example.Product_Management.Model.Product;

public class AvergaeCategoryDTO {
      private List<Product> products;
    private Double Average;
     private Double price;
    private long count;
    public List<Product> getProducts() {
        return products;
    }
   
    public AvergaeCategoryDTO(List<Product> products, Double average, Double price, long count) {
        this.products = products;
        Average = average;
        this.price = price;
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public Double getAverage() {
        return Average;
    }
    public void setAverage(Double average) {
        Average = average;
    }
    
}
