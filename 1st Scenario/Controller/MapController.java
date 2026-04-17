package com.example.Product_Management.Controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product_Management.Dto.productDTOMap;
import com.example.Product_Management.Dto.productDTOMap2;
import com.example.Product_Management.Model.Product;

import jakarta.persistence.Convert;


@RestController
@RequestMapping("/Map")  // <- Base path for all endpoints in this controller
public class MapController {

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


// //6. Get only product names

//  @GetMapping("/Products")
//  public ResponseEntity<Map<String,List<String>>> getAllProductsData(){
//   System.out.println("inside fetch all products");
//     // Fetch all products
//       List<Product> products = gpc.getAllProducts();
//       // Assume p1 loaded hai
// List<String> test = products.stream().map(Product::getName).collect(Collectors.toList());
// Map<String,List<String>> m1=new HashMap<>();

// String category="products";
// m1.put(category,test);


// System.out.println(test);  // Yeh chalna chahiye
//      return new ResponseEntity<>(m1,HttpStatus.OK);
 
// }   

//7. Get only product prices

//  @GetMapping("/Products")
//  public ResponseEntity<Map<String,List<Double>>> getAllProductsData(){
//   System.out.println("inside fetch all products price");
//     // Fetch all products
//       List<Product> products = gpc.getAllProducts();
//       // Assume p1 loaded hai
// List<Double> test = products.stream().map(Product::getPrice).collect(Collectors.toList());
// Map<String,List<Double>> m1=new HashMap<>();

// String category="products price";
// m1.put(category,test);


// System.out.println(test);  // Yeh chalna chahiye
//      return new ResponseEntity<>(m1,HttpStatus.OK);
 
// }

// 8. Convert products list to productIds list


//  @GetMapping("/Products")
//  public ResponseEntity<Map<String,List<Long>>> getAllProductsData(){
//   System.out.println("inside fetch all products");
//     // Fetch all products
//       List<Product> products = gpc.getAllProducts();
//       // Assume p1 loaded hai
// List<Long> test = products.stream().map(Product::getId).collect(Collectors.toList());
// Map<String,List<Long>> m1=new HashMap<>();

// String category="product Id";
// m1.put(category,test);


// System.out.println(test);  // Yeh chalna chahiye
//      return new ResponseEntity<>(m1,HttpStatus.OK);
 
// }   

//9. Convert products to Map<id, name>
//  @GetMapping("/Products")
//  public ResponseEntity<Map<String,List<productDTOMap>>> getAllProductsData(){
//   System.out.println("inside fetch all products");
//     // Fetch all products
//       List<Product> products = gpc.getAllProducts();
//       // Assume p1 loaded hai
// List<productDTOMap> test = products.stream().map(p->new productDTOMap(p.getId(),p.getName())).collect(Collectors.toList());
// Map<String,List<productDTOMap>> m1=new HashMap<>();

// String category="product Id";
// m1.put(category,test);


// System.out.println(test);  // Yeh chalna chahiye
//      return new ResponseEntity<>(m1,HttpStatus.OK);
 
// }   


//9. Convert products to Map<id, product>
 @GetMapping("/Products")
 public ResponseEntity<Map<Long,List<productDTOMap2>>> getAllProductsData(){
  System.out.println("inside fetch all products");
    // Fetch all products
      List<Product> products = gpc.getAllProducts();
      // Assume p1 loaded hai
//List<productDTOMap2> test = products.stream().map(p->new productDTOMap2(p.getName(),p.getCategory(),p.getPrice(),p.getStockQuantity(),p.getStatus())).collect(Collectors.toList());
Map<Long, List<productDTOMap2>> m1 = products.stream()
    .map(p -> new productDTOMap2(
            p.getId(),
            p.getName(),
            p.getCategory(),
            p.getPrice(),
            p.getStockQuantity(),
            p.getStatus()
    ))
    .collect(Collectors.groupingBy(productDTOMap2::getId)); // group by ID


System.out.println(m1);  // Yeh chalna chahiye
     return new ResponseEntity<>(m1,HttpStatus.OK);
 
}  

}
