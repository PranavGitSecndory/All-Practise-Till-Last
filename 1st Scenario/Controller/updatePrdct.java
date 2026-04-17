package com.example.Product_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.Product_Management.Model.Product;
import com.example.Product_Management.Repository.ProductRepo;
@Controller
public class updatePrdct {

     @Autowired
    public ProductRepo pr;
    // Update product in the database
    public Product updateProduct1(Product product) {
        return pr.save(product);  // Save updated product
    }
}
