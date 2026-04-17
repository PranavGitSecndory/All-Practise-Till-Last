package com.example.Product_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;
import com.example.Product_Management.Model.Product;
import com.example.Product_Management.Repository.ProductRepo;

@Controller
public class AddProductController {

    @Autowired
public ProductRepo productRepo;
@CrossOrigin(origins = "http://192.168.18.216:8081") 
@PostMapping("/AddData")
@ResponseBody
public ResponseEntity<List<Product>> addProduct(@RequestBody Product p1) {
    System.out.println(p1.getName() + " " + p1.getPrice() + " " + p1.getStockQuantity() + " " + p1.getCategory());

    List<Product> al1 = new ArrayList<>();
  al1.add(new Product(p1.getName(), p1.getPrice(), p1.getStockQuantity(), p1.getCategory(), null));

   productRepo.save(p1);
   return ResponseEntity.status(HttpStatus.CREATED).body(al1);
   //return "all done ok";
}


    
}
