package com.example.Product_Management.Dto;

import java.util.List;

import com.example.Product_Management.Model.Product;




public class CategoryInfoDTO {
    private List<Product> products;
    private long count;

    public CategoryInfoDTO(List<Product> products) {
        this.products = products;  // ✅ List stored here
        this.count = products.size();     // ✅ Count calculated here
    }

    public List<Product> getProducts() { return products; }
    public long getCount() { return count; }
}