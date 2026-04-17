package com.example.Product_Management.Controller;

import java.util.Comparator;
import java.util.HashMap;
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
@RequestMapping("/Sort")  // <- Base path for all endpoints in this controller
public class SortController {
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

 
//    //6. 11. Sort products by price ascending
//  @GetMapping("/Products")
//  public ResponseEntity<List<Product>> getAllProductsData(){
//   System.out.println("inside fetch all products");
//     // Fetch all products
//       List<Product> products = gpc.getAllProducts();
//       List<Product> sort_data=products.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
//      return new ResponseEntity<>(sort_data,HttpStatus.OK);
//  }   

//   // 12. Sort products by price descending

//  @GetMapping("/Products")
//  public ResponseEntity<List<Product>> getAllProductsData(){
//   System.out.println("inside fetch all products");
//     // Fetch all products
//       List<Product> products = gpc.getAllProducts();
//       List<Product> sort_data=products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).collect(Collectors.toList());
//       return new ResponseEntity<>(sort_data,HttpStatus.OK);
//  }  

// 13. Sort by category then price
//  @GetMapping("/Products")
//  public ResponseEntity<List<Product>> getAllProductsData(){
//   System.out.println("inside fetch all products");
//     // Fetch all products
//       List<Product> products = gpc.getAllProducts();
//       List<Product> sort_data=products.stream().sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getCategory)).collect(Collectors.toList());
//       return new ResponseEntity<>(sort_data,HttpStatus.OK);
//  }

// //13. 14. Sort by brand then name
//  @GetMapping("/Products")
//  public ResponseEntity<List<Product>> getAllProductsData(){
//   System.out.println("inside fetch all products");
//     // Fetch all products
//       List<Product> products = gpc.getAllProducts();
//       List<Product> sort_data=products.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Product::getPrice)).collect(Collectors.toList());
//       return new ResponseEntity<>(sort_data,HttpStatus.OK);
//  }

//15. Sort products by quantity

 @GetMapping("/Products")
 public ResponseEntity<List<Product>> getAllProductsData(){
  System.out.println("inside fetch all products");
    // Fetch all products
      List<Product> products = gpc.getAllProducts();
      List<Product> sort_data=products.stream().sorted(Comparator.comparing(Product::getStockQuantity).reversed()).collect(Collectors.toList());
      return new ResponseEntity<>(sort_data,HttpStatus.OK);
 }
}
