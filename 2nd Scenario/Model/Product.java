package com.example.Inventory.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;

    // One product can have many purchase orders
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<PurchaseOrder> purchaseOrders;

    public Product(Long id, String name, String category, Double price, List<PurchaseOrder> purchaseOrders) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.purchaseOrders = purchaseOrders;
    }

    public Product() {
        //TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    // getters and setters
}