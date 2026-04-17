package com.example.Inventory.dto;

import java.time.LocalDate;

public class DetailsOfPurchaseProduct {
    //supplier Details
    private Long Id;
    private  String email;
    private String Supplier_name;

    //product Details

    private String category;
    private String Product_name;
    private Double price;

    //purchase-order
    private LocalDate oderDate;
    private int quantity;
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSupplier_name() {
        return Supplier_name;
    }
    public void setSupplier_name(String supplier_name) {
        Supplier_name = supplier_name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getProduct_name() {
        return Product_name;
    }
    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public LocalDate getOderDate() {
        return oderDate;
    }
    public void setOderDate(LocalDate oderDate) {
        this.oderDate = oderDate;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public DetailsOfPurchaseProduct(Long id, String email, String supplier_name, String category, String product_name,
            Double price, LocalDate oderDate, int quantity) {
        Id = id;
        this.email = email;
        Supplier_name = supplier_name;
        this.category = category;
        Product_name = product_name;
        this.price = price;
        this.oderDate = oderDate;
        this.quantity = quantity;
    }

    


}
