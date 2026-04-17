package com.example.Inventory.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Inventory.Model.Product;
import com.example.Inventory.Model.PurchaseOrder;
import com.example.Inventory.Model.Supplier;
import com.example.Inventory.Service.InventoryService;
import com.example.Inventory.dto.*;

@RestController
@RequestMapping("/api")
public class InventoryController {
 
@Autowired
public InventoryService service;

 @GetMapping("/checkingApi")   
 public String checkApi(){
    return " ok (: Checked";
 }

//q1.Fetch all purchase orders for a given product with supplier details

   @GetMapping("/product/{id}/orders")
    public List<PurchaseOrder> getOrdersByProduct(@PathVariable Long id) {
        return service.getOrdersByProduct(id);
    }


//create   new  data 
@PostMapping("/products")
public Product addProduct(@RequestBody ProductDTO dto) {
    return service.createProduct(dto);
}

@PostMapping("/suppliers")
public Supplier addSupplier(@RequestBody SupplierDTO dto) {
    return service.createSupplier(dto);
}

@PostMapping("/purchase-orders")
public PurchaseOrder addPurchaseOrder(@RequestBody PurchaseOrderDTO dto) {
    return service.createPurchaseOrder(dto);
}

   //extract the product details by particular id 
@GetMapping("/ProductDetails")
public List<DetailsOfPurchaseProduct> getDetailsOfSpecificProduct(@RequestParam Long productId){
    System.out.println("exatrcting the data from the api");
    return service.getDetailOfSpecificProduct(productId);
}
//Specific Supplier Detail
// @GetMapping("/SupplierDetail")
// public Map<String,List<SupplierDetailsDTO>> getSupplierDetail(@RequestParam Long supplierId){


//       return service.getSupplierDetailsService(supplierId);

// }
//query that fetches the supplier’s details and the products they sell, for a supplier with a given name, e.g., "ABC Suppliers".
@GetMapping("/SupplierDetail")
public Map<String,List<SupplierDetailsDTO>> getSupplierDetail(@RequestParam Long supplierId){


      return service.findProductsBySupplierId(supplierId);

}


}
