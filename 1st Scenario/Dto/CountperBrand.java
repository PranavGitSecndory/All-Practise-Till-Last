package com.example.Product_Management.Dto;

import java.util.List;

import com.example.Product_Management.Model.Product;

public class CountperBrand {
    private int count;
    private String name;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private Long id;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getName() {
        return name;
    }
    public CountperBrand(int count, String name, long l) {
        this.count = count;
        this.name = name;
        this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}
