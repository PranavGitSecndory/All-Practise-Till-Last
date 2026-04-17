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
@RequestMapping("/Agreegation") // <- Base path for all endpoints in this controller
public class AggregationController {
    
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
//   //26.  Count approved vs pending products
//   @GetMapping("/Products")
//   public ResponseEntity<Double> getMostExpensiveProductPerCategory() {
//   List<Product> products = gpc.getAllProducts();
// double sum = products.stream()
//                      .mapToDouble(Product::getPrice).sum();    
//     return new ResponseEntity<>(sum, HttpStatus.OK);
//   }


//   //26.  Count approved vs pending products
//   @GetMapping("/Products")
//   public ResponseEntity<Double> getMostExpensiveProductPerCategory() {
//   List<Product> products = gpc.getAllProducts();
// double sum = products.stream()
//                      .mapToDouble(Product::getPrice).sum();    
//     return new ResponseEntity<>(sum, HttpStatus.OK);
//   }

//35. Total quantity of all products
  //26.  Count approved vs pending products
//   @GetMapping("/Products")
//   public ResponseEntity<Double> getMostExpensiveProductPerCategory() {
//   List<Product> products = gpc.getAllProducts();
// double sum = products.stream().count();   
//     return new ResponseEntity<>(sum, HttpStatus.OK);
//   }

  //36. Average price of all products
// @GetMapping("/Products")
//   public ResponseEntity<Double> getMostExpensiveProductPerCategory() {
//   List<Product> products = gpc.getAllProducts();
// double averagePrice = products.stream()
//                               .mapToDouble(Product::getPrice) // extract price as double
//                               .average()                      // calculate average
//                               .orElse(0.0);                   // handle empty list

//                               return new ResponseEntity<>(averagePrice, HttpStatus.OK);
//   }

  //38. Lowest price product
@GetMapping("/Products")
  public ResponseEntity<Double> getMostExpensiveProductPerCategory() {
  List<Product> products = gpc.getAllProducts();
double averagePrice = products.stream()
                              .mapToDouble(Product::getPrice) // extract price as double
                             .min()                
                              .orElse(0.0);                   // handle empty list
                              return new ResponseEntity<>(averagePrice, HttpStatus.OK);
  }



}
