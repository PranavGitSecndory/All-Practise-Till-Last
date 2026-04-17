package com.example.Inventory.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // One supplier can supply many purchase orders
    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private List<PurchaseOrder> purchaseOrders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Supplier(Long id, String name, String email, List<PurchaseOrder> purchaseOrders) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.purchaseOrders = purchaseOrders;
    }

    public Supplier() {
        //TODO Auto-generated constructor stub
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    // getters and setters
}