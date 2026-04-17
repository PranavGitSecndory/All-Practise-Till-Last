package com.example.Product_Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "Product")  
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate primary key
    private long id;
    private String name;
    private Double price;
    private int stockQuantity;
    private String Category;
    private String Status;

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
    @Version
    private Integer version; // version field for optimistic locking
     // Default constructor required by JPA
    public Product() {
        // No-argument constructor
    }

    public Product( String name, double price, int stockQuantity, String category,String Status) {
      //  this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.Category = category;
        this.Status= Status;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }


    

}
