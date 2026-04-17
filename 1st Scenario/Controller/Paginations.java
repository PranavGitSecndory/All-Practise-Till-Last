package com.example.Product_Management.Controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product_Management.Model.Product;

@RestController
@RequestMapping("/pagination") // <- Base path for all endpoints in this controller
class Paginations{
@Autowired

  public AddProductController apc;
  @Autowired

  public DeletePrdctController dele;
  @Autowired
  public GetAllProducts gpc;

  @Autowired
  public updatePrdct upc;

  @Autowired
  public GetByIdPrdct gbi;

  @GetMapping("/checkApi")
  public String checkApi() {
    System.out.println("chikun api");
    return "checked";
  }
  
  
  //26.  Count approved vs pending products
 @GetMapping("/Products")
public ResponseEntity<List<Product>> getProducts(
        @RequestParam(defaultValue = "0") int startIndex,
        @RequestParam(defaultValue = "4") int pageSize) {

    System.out.println("get Data for the pagination");
 List<Product> allProducts = gpc.getAllProducts(); // fetch all products

    int totalRecords = allProducts.size();
    if (startIndex >= totalRecords) {
        System.out.println("less than COmdition");
        return new ResponseEntity<>(Collections.emptyList(), HttpStatus.OK);
    }
    int toIndex = Math.min(startIndex + pageSize, totalRecords);
    List<Product> pageData = allProducts.subList(startIndex, toIndex);
    return new ResponseEntity<>(pageData, HttpStatus.OK);
}


}