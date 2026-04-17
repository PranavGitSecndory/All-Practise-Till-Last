package com.example.Product_Management.Controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.Product_Management.Model.Product;
import com.example.Product_Management.Repository.ProductRepo;
@Controller
public class GetByIdPrdct {

    
    @Autowired
    public ProductRepo pr;
      // Get product by ID
    public Product getProductById(Long id) {
        return pr.findById(id).orElse(null);  // Return null if product not found
    }
    public List<Product> getProductByIdList(Long id) {
       
        List<Product> optionalProduct = pr.findAll();
    return optionalProduct;
    }
}
