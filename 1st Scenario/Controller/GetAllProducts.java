package com.example.Product_Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Product_Management.Model.Product;
import com.example.Product_Management.Repository.ProductRepo;

@Controller
public class GetAllProducts {
  
      @Autowired
      ProductRepo productRepo;
 // Get all products from the database
    public List<Product> getAllProducts() {
        return productRepo.findAll();  // Retrieve all products from the database
    } 
}