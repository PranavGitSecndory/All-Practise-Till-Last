package com.example.Product_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Product_Management.Repository.ProductRepo;
@Controller
class DeletePrdctController {


      @Autowired
      ProductRepo productRepo;

   //@DeleteMapping("/DeleteData/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteProduct(Long id) {
        System.out.println("Delete Cid"+id);
        if (productRepo.existsById(id)) 
            {
            productRepo.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Product deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
      
    }
}
