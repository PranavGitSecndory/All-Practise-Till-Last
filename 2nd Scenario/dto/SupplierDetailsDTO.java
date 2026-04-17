package com.example.Inventory.dto;

import java.util.List;


import com.example.Inventory.Model.Supplier;


public class SupplierDetailsDTO {
    private Long id;
    private String name;

    public SupplierDetailsDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}