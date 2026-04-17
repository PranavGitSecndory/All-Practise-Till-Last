package com.example.Product_Management.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Locale.Category;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product_Management.Controller.updatePrdct;
import com.example.Product_Management.Dto.productDTO;
import com.example.Product_Management.Model.Product;
import com.example.Product_Management.Repository.ProductRepo;

@RestController
@RequestMapping("/List")
public class MainController {
    
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

@RequestMapping("/checkAPI")
public String Chechink()
{
    System.out.println("checking.......");
    return "checkingg......";
}
@CrossOrigin(origins = "http://192.168.18.216:8081")  // Allow CORS for this method
@RequestMapping("/")
public String dashboard(@RequestBody Product p)
{
    System.out.println("in main product");
   apc.addProduct(p);
    return "checking.";
}


    // New method to call delete from AddProductController
     @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        System.out.println("Main Controller"+id);
         return dele.deleteProduct(id); // Delegate the delete request
    }

//  @CrossOrigin(origins = "http://192.168.18.216:8081")  // Allow CORS for this method
//   @GetMapping("/products")
// public ResponseEntity<List<Product>> getAllProducts() {
//     System.out.println("gettubg all product from main");
//     List<Product> products = gpc.getAllProducts();
//     if (products.isEmpty()) {
//         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//     }
//     return ResponseEntity.ok(products);
// }

//using set
//  @CrossOrigin(origins = "http://192.168.18.216:8081")  // Allow CORS for this method
//   @GetMapping("/products")
// public ResponseEntity<Map<String, List<Product>>> getAllProducts() {
//     System.out.println("gettubg all product from main");
//     List<Product> products = gpc.getAllProducts();


//     //Set<Product> setprdct=new LinkedHashSet<>(products);
//       // Group products by category using Streams and Collectors
//     // Group products by category, ignoring case sensitivity
//     Map<String, List<Product>> groupedByCategory = products.stream()
//         .collect(Collectors.groupingBy(product -> product.getCategory().toLowerCase()));
    
//     if (products.isEmpty()) {
//         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//     }
//     return ResponseEntity.ok(groupedByCategory);
// }


// @CrossOrigin(origins = "http://192.168.18.216:8081")  // Allow CORS for this method
//   @GetMapping("/products")
// public ResponseEntity<Map<String, Long>> getAllProducts() {
//     System.out.println("get the count and down  all product from main");
//     List<Product> products = gpc.getAllProducts();
//    // Group products by category, ignoring case sensitivity
//     // Group products by category (ignoring case) and count the number of products per category
//     Map<String, Long> categoryCounts = products.stream()
//         .collect(Collectors.groupingBy(
//             product -> product.getCategory().toLowerCase(), 
//             Collectors.counting()));
    
//     if (products.isEmpty()) {
//         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//     }
//     return ResponseEntity.ok(categoryCounts);
// }


// @CrossOrigin(origins = "http://192.168.18.216:8081")  // Allow CORS for this method
//   @GetMapping("/products")
// public ResponseEntity<Map<String, Object>> getAllProducts() {
//     System.out.println("get the count and down  all product from main");
//     List<Product> products = gpc.getAllProducts();
//    // Group products by category (case-insensitive) and count the number of products per category
//     Map<String, List<Product>> groupedByCategory = products.stream()
//         .collect(Collectors.groupingBy(
//             product -> product.getCategory().toLowerCase()));

//     // Group products by category (case-insensitive) and count the number of products in each category
//     Map<String, Long> categoryCounts = products.stream()
//         .collect(Collectors.groupingBy( 
//             product -> product.getCategory().toLowerCase(), 
//             Collectors.counting()));

//     // Prepare the result map with both the grouped products and category counts
//     Map<String, Object> result = new HashMap<>();
//     result.put("groupedByCategory", groupedByCategory);
//     result.put("categoryCounts", categoryCounts); 
//     if (products.isEmpty()) {
//         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//     }
//     return ResponseEntity.ok(result);
// }


// @CrossOrigin(origins = "http://192.168.18.216:8081")  // Allow CORS for this method
//   @GetMapping("/products")
// public ResponseEntity<Map<String, Map<String, Object>>> getAllProducts() {
//     System.out.println("get the count and down  all product from main");
//      List<Product> products = gpc.getAllProducts();
//     // Use TreeMap for alphabetical ordering of categories

//     Map<String, Map<String, Object>> result = new TreeMap<>();

//     // Group products by category (case-insensitive)
//     Map<String, List<Product>> groupedByCategory = products.stream()
//         .collect(Collectors.groupingBy(
//             product -> product.getCategory().toLowerCase()));

//     // Process each category
//     for (Map.Entry<String, List<Product>> entry : groupedByCategory.entrySet()) {
//         String category = entry.getKey();
//         List<Product> productList = entry.getValue();

//         // Sort products by price in ascending order
//         productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

//         // Calculate total price for this category
//         double totalPrice = 0;
//         for (Product p : productList) {
//             totalPrice += p.getPrice();
//         }

//         // Create a map to hold products and total price
//         Map<String, Object> categoryInfo = new HashMap<>();
//         categoryInfo.put("products", productList);
//         categoryInfo.put("totalPrice", totalPrice);

//         // Add to the result TreeMap
//         result.put(category, categoryInfo);
//     if (result.isEmpty()) {
//         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//     }
// }
//     return ResponseEntity.ok(result);

// }



@GetMapping("/products")
public ResponseEntity<List<Product>> getAllProductsSorted(
        @RequestParam(required = false, defaultValue = "name") String sortBy) {

    // Fetch all products
    List<Product> products = gpc.getAllProducts();

    // Sort based on query parameter
    if ("price".equalsIgnoreCase(sortBy)) {
        // Sort by price ascending
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
    } else {
        // Default sort by name alphabetically
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        });
    }

    // Return the sorted list
    if (products.isEmpty()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
    return ResponseEntity.ok(products);
}


  // Update product by ID
    @PutMapping("/updatePrdct/{id}")
    @ResponseBody
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        System.out.println(id+","+updatedProduct.toString());
// Check if product exists in the database
        Product existingProduct = gbi.getProductById(id);
        if (existingProduct == null) {
             System.out.println(id+","+updatedProduct.toString());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Update the product details
        existingProduct.setCategory(updatedProduct.getCategory());
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setStockQuantity(updatedProduct.getStockQuantity());

        // Save the updated product in the database
        upc.updateProduct1(existingProduct);

        // Return the updated product as response
        return new ResponseEntity<>(existingProduct, HttpStatus.OK);
    }


//      // Update product by ID
//     @GetMapping("/GetPrdtById/{id}")
//     @ResponseBody
//     public ResponseEntity<Product> getPrdctById(@PathVariable Long id) {
//         System.out.println(id);
// // Check if product exists in the database
//         Product existingProduct = gbi.getProductById(id);
//         if (existingProduct == null) {
//      //        System.out.println(id+","+updatedProduct.toString());
//             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//         }

//         // Return the updated product as response
//         return new ResponseEntity<>(existingProduct, HttpStatus.OK);
//     }


//   2. Get all products with quantity < 10

//     @GetMapping("/GetPrdtById/{id}")
//     @ResponseBody
//     public ResponseEntity<List<Product>> getPrdctById(@PathVariable Long id) {
//     System.out.println("get prdct by ID");
//   //  List<Product> p1=new ArrayList<>();
//        List<Product> p1 = gbi.getProductByIdList(id);
         

//  // Filter for price < 25000
//         List<Product> filter_data = p1.stream().filter(i->i.getPrice()<9000).collect(Collectors.toList());
//       for (Product product : filter_data) {
//         System.out.println(product);
//       }
//     return new ResponseEntity<>(filter_data,HttpStatus.OK);
//     }


 // 3. Get all products with status = "AVAILABLE"
    // @GetMapping("/GetPrdtById/{id}")
    // @ResponseBody
    // public ResponseEntity<List<Product>> getPrdctById(@PathVariable Long id) {
    // System.out.println("get prdct by ID");
    // //List<Product> p1=new ArrayList<>();
    // List<Product>  p1 = gbi.getProductByIdList(id);      
    // List<Product> filterData=p1.stream().filter(i->i.getStatus().equalsIgnoreCase("appRoved")).collect(Collectors.toList());
    // p1.forEach(p->System.out.println(p.getCategory()));
    // return new ResponseEntity<>(filterData,HttpStatus.OK);
    //}

//   //4. Get all products of category "Electronics"
//   @GetMapping("/GetPrdtById/{id}")
//     @ResponseBody
//     public ResponseEntity<Map<String,List<Product>>> getPrdctById(@PathVariable Long id) {
//     System.out.println("get prdct by ID");
//     //List<Product> p1=new ArrayList<>();
//     List<Product>  p1 = gbi.getProductByIdList(id);
//    List<Product> p2=p1.stream().filter(i->i.getCategory().equals("Clothing")).collect(Collectors.toList());       
//    Map<String,List<Product>> m1=new HashMap<>();
//    p2.forEach(p->{
//       String category=p.getCategory();
//       m1.put(category,p2);
//    });
     

//     return new ResponseEntity<>(m1,HttpStatus.OK);
//     }
  
//5. Get all products of category "Electronics" and limited feilds only show
//   @GetMapping("/GetPrdtById/{id}")
//     @ResponseBody
//     public ResponseEntity<Map<String,List<productDTO>>> getPrdctById(@PathVariable Long id) {
//     System.out.println("get prdct by ID");
//     //List<Product> p1=new ArrayList<>();
//     List<Product>  p1 = gbi.getProductByIdList(id);
//    List<Product> p2=p1.stream().filter(i->i.getCategory().equals("Clothing")).collect(Collectors.toList()); 
   
//    List<productDTO> p3=p2.stream().map(p->new productDTO(p.getName(),p.getPrice(),p.getStatus(), p.getCategory())).collect(Collectors.toList());
   
//    Map<String,List<productDTO>> m1=new HashMap<>();
//    p3.forEach(p->{
//       String category=p2.get(0).getCategory();
//       m1.put(category, p3);
//    });
//     return new ResponseEntity<>(m1,HttpStatus.OK);
//     }


//5. Get products with price between 2000 and 10000

  @GetMapping("/GetPrdtById/{id}")
    @ResponseBody
    public ResponseEntity<Map<String,List<productDTO>>> getPrdctById(@PathVariable Long id) {
    System.out.println("get prdct by ID");
    //List<Product> p1=new ArrayList<>();
    List<Product>  p1 = gbi.getProductByIdList(id);
   List<Product> p2=p1.stream().filter(i->i.getPrice()>1000 && i.getPrice()<2000).collect(Collectors.toList()); 
   
   List<productDTO> p3=p2.stream().map(p->new productDTO(p.getName(),p.getPrice(),p.getStatus(), p.getCategory())).collect(Collectors.toList());
   
   Map<String,List<productDTO>> m1=new HashMap<>();
   p3.forEach(p->{
      String category=p2.get(0).getCategory();
      m1.put(category, p3);
   });
    return new ResponseEntity<>(m1,HttpStatus.OK);
    }
     
}
