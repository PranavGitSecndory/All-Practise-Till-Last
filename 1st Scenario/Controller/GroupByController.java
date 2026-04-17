package com.example.Product_Management.Controller;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product_Management.Dto.AvergaeCategoryDTO;
import com.example.Product_Management.Dto.CategoryInfoDTO;
import com.example.Product_Management.Dto.CountperBrand;
import com.example.Product_Management.Dto.MaxPriceCategoryDTO;
import com.example.Product_Management.Dto.PriceSumDTO;
import com.example.Product_Management.Dto.StatusCount;
import com.example.Product_Management.Model.Product;

@RestController
@RequestMapping("/GroupBy") // <- Base path for all endpoints in this controller
public class GroupByController {

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

  // 16. Group products by category
  // @GetMapping("/Products")
  // public ResponseEntity<Map<String,List<Product>>> getAllProductsData(){
  // System.out.println("inside fetch all products");
  // // Fetch all products
  // List<Product> products = gpc.getAllProducts();
  // Map<String,List<Product>>
  // sort_data=products.stream().collect(Collectors.groupingBy(Product::getCategory));
  // return new ResponseEntity<>(sort_data,HttpStatus.OK);
  // }

  // 17. Count products per category
  // @GetMapping("/Products")
  // public ResponseEntity<Map<String,CategoryInfoDTO>> getAllProductsData(){
  // System.out.println("inside fetch all products");
  // // Fetch all products
  // List<Product> products = gpc.getAllProducts();
  // //Map<String,List<CategoryInfoDTO>>
  // sort_data=products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));
  // Map<String, CategoryInfoDTO> sort_data = products.stream()
  // .collect(Collectors.groupingBy(Product::getCategory,Collectors.collectingAndThen(Collectors.toList(),
  // CategoryInfoDTO::new)
  // ));
  // return new ResponseEntity<>(sort_data,HttpStatus.OK);
  // }

  // 18. Sum price per category
  // @GetMapping("/Products")
  // public ResponseEntity<Map<String, PriceSumDTO>> getAllProductsData() {
  // List<Product> products = gpc.getAllProducts();
  // Map<String, PriceSumDTO> sumData = products.stream()
  // .collect(Collectors.groupingBy(
  // Product::getCategory, // group by category
  // Collectors.collectingAndThen(
  // Collectors.toList(), // list of products per category
  // list -> {
  // double totalPrice = list.stream()
  // .mapToDouble(Product::getPrice)
  // .sum(); // sum prices in this category
  // return new PriceSumDTO(list, totalPrice);
  // }
  // )
  // ));
  // return new ResponseEntity<>(sumData, HttpStatus.OK);
  // }

  // 19. Find average price per category
  // @GetMapping("/Products")
  // public ResponseEntity<Map<String, AvergaeCategoryDTO>>
  // getAveragePricePerCategory() {
  // List<Product> products = gpc.getAllProducts();

  // Map<String, AvergaeCategoryDTO> avgData = products.stream()
  // .collect(Collectors.groupingBy(
  // Product::getCategory, // 1️⃣ group by category
  // Collectors.collectingAndThen(
  // Collectors.toList(), // 2️⃣ collect list of products per category
  // list -> {
  // long count = list.size(); // 3️⃣ count
  // double totalPrice = list.stream()
  // .mapToDouble(Product::getPrice)
  // .sum(); // 4️⃣ sum
  // double average = count == 0 ? 0 : totalPrice / count; // 5️⃣ average
  // return new AvergaeCategoryDTO(list, average, totalPrice, count);
  // }
  // )
  // ));

  // return new ResponseEntity<>(avgData, HttpStatus.OK);
  // }

  // 20. Find most expensive product per category
  // @GetMapping("/Products")
  // public ResponseEntity<Map<String, MaxPriceCategoryDTO>>
  // getMostExpensiveProductPerCategory() {
  // List<Product> products = gpc.getAllProducts();
  // Map<String, MaxPriceCategoryDTO> maxPriceData = products.stream()
  // .collect(Collectors.groupingBy(
  // Product::getCategory, // group by category
  // Collectors.collectingAndThen(
  // Collectors.maxBy(Comparator.comparingDouble(Product::getPrice)), // find max
  // price product
  // optionalProduct -> optionalProduct
  // .map(MaxPriceCategoryDTO::new) // convert Product → MaxPriceCategoryDTO
  // .orElse(null) // handle empty category
  // )
  // ));

  // return new ResponseEntity<>(maxPriceData, HttpStatus.OK);
  // }

  // 21. Group products by brand
  // @GetMapping("/Products")
  // public ResponseEntity<Map<String, List<Product>>>
  // getMostExpensiveProductPerCategory() {
  // List<Product> products = gpc.getAllProducts();
  // Map<String,List<Product>>
  // grpData=products.stream().collect(Collectors.groupingBy(Product::getCategory));

  // return new ResponseEntity<>(grpData, HttpStatus.OK);
  // }

  // 22. Count products per brand
  // @GetMapping("/Products")
  // public ResponseEntity<Map<String, CountperBrand>>
  // getMostExpensiveProductPerCategory() {
  // List<Product> products = gpc.getAllProducts();
  // Map<String, CountperBrand> grpData = products.stream()
  // .collect(Collectors.groupingBy(
  // Product::getName, // key = product name
  // Collectors.collectingAndThen(
  // Collectors.toList(), // first collect all products with same name
  // list -> new CountperBrand(list.size(),
  // list.get(0).getName(),list.get(1).getId()) // then wrap in DTO
  // )
  // ));
  // return new ResponseEntity<>(grpData, HttpStatus.OK);
  // }

  // 23. Find cheapest product per brand
  // @GetMapping("/Products")
  // public ResponseEntity<Product> getMostExpensiveProductPerCategory() {
  // List<Product> products = gpc.getAllProducts();
  // Product minPriceProduct = products.stream()
  // .min(Comparator.comparingDouble(Product::getPrice)) // find min by price
  // .orElse(null);
  // return new ResponseEntity<>(minPriceProduct, HttpStatus.OK);
  // }

  // 23. Find Expensive product per brand
  // @GetMapping("/Products")
  // public ResponseEntity<Product> getMostExpensiveProductPerCategory() {
  // List<Product> products = gpc.getAllProducts();
  // Product minPriceProduct = products.stream()
  // .max(Comparator.comparingDouble(Product::getPrice)) // find min by price
  // .orElse(null);
  // return new ResponseEntity<>(minPriceProduct, HttpStatus.OK);
  // }

  // //26. Group products by status

  // @GetMapping("/Products")
  // public ResponseEntity<Map<String, List<Product>>>
  // getMostExpensiveProductPerCategory() {
  // List<Product> products = gpc.getAllProducts();
  // Map<String, List<Product>> grpData =
  // products.stream().filter(i->i.getStatus().equals("approved"))
  // .collect(Collectors.groupingBy(
  // Product::getStatus
  // ));
  // return new ResponseEntity<>(grpData, HttpStatus.OK);
  // }


  //26.  Count approved vs pending products
  @GetMapping("/Products")
  public ResponseEntity<Map<String, Long>>  getMostExpensiveProductPerCategory() {
  List<Product> products = gpc.getAllProducts();
  Map<String, Long> grpData = products.stream()
        .collect(Collectors.groupingBy(
            Product::getStatus,   // group by status (Approved, Pending)
            Collectors.counting() // count number of products in each group
        ));
  
  return new ResponseEntity<>(grpData, HttpStatus.OK);
  }

}
