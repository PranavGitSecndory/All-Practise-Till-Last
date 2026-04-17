package com.example.Inventory.dto;

import java.time.LocalDate;

public class SupplierProductDTO {

    private String supplierName;
    private String supplierEmail;
    private String productName;
    private Double productPrice;
    private String productCategory;
    private LocalDate orderDate;

    public SupplierProductDTO(String supplierName, String supplierEmail,
                              String productName, Double productPrice,
                              String productCategory, LocalDate orderDate) {
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.orderDate = orderDate;
    }

    // getters & setters
    public String getSupplierName() { return supplierName; }
    public String getSupplierEmail() { return supplierEmail; }
    public String getProductName() { return productName; }
    public Double getProductPrice() { return productPrice; }
    public String getProductCategory() { return productCategory; }
    public LocalDate getOrderDate() { return orderDate; }
}