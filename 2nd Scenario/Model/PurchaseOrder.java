package com.example.Inventory.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;
    private LocalDate orderDate;

    // Many orders for one product
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    // Many orders from one supplier
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    public PurchaseOrder(Long id, Integer quantity, LocalDate orderDate, Product product, Supplier supplier) {
        this.id = id;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.product = product;
        this.supplier = supplier;
    }

    public PurchaseOrder() {
        //TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    // getters and setters
}