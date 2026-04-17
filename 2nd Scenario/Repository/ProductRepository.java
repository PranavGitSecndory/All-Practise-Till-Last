package com.example.Inventory.Repository;

import com.example.Inventory.Model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.Inventory.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository already provides:
    // Optional<Product> findById(Long id)
    // Product save(Product entity)
}
