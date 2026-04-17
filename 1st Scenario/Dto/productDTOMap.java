package com.example.Product_Management.Dto;

public class productDTOMap {
     private  long  id;
    //private Double price;
   // private String price;
    private String name;
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
    public productDTOMap(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
