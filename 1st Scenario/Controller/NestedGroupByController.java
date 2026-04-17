package com.example.Product_Management.Controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product_Management.Model.Product;

@RestController
@RequestMapping("/NestedGroupBy") // <- Base path for all endpoints in this controller
public class NestedGroupByController {
    
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

  //29. Category → Brand → Products
//   @GetMapping("/Products")
//   public ResponseEntity<Map<String, Map<String,List<Product>>>>  getMostExpensiveProductPerCategory() {
//   List<Product> products = gpc.getAllProducts();
//   Map<String, Map<String,List<Product>>> grpData = products.stream()
//         .collect(Collectors.groupingBy(
//             Product::getCategory,Collectors.groupingBy(Product::getName)  ));

    
//   return new ResponseEntity<>(grpData, HttpStatus.OK);
//   }


//30. Brand → Category → Products
// @GetMapping("/Products")
//   public ResponseEntity<Map<String, Map<String,List<Product>>>>  getMostExpensiveProductPerCategory() {
//   List<Product> products = gpc.getAllProducts();
//   Map<String, Map<String,List<Product>>> grpData = products.stream()
//         .collect(Collectors.groupingBy(
//             Product::getName,Collectors.groupingBy(Product::getCategory)  ));

    
//   return new ResponseEntity<>(grpData, HttpStatus.OK);
//   }


//32. Brand → Price Range → Products
@GetMapping("/Products")
  public ResponseEntity<Map<String, Map<Double,List<Product>>>>  getMostExpensiveProductPerCategory() {
  List<Product> products = gpc.getAllProducts();
  Map<String,Map<Double,List<Product>>> grpData = products.stream()
        .collect(Collectors.groupingBy(
            Product::getName,Collectors.groupingBy(Product::getPrice)  ));
   
  return new ResponseEntity<>(grpData, HttpStatus.OK);
  }

}
