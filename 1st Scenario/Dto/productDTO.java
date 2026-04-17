package com.example.Product_Management.Dto;

public class productDTO {
    //private String Category;
  
    private  String name;
    private Double price;
   // private String price;
    private String status;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    } 
    
    
    // public String getCategory() {
    //     return Category;
    // }
    // public void setCategory(String category) {
    //     Category = category;
    // }
    
    public productDTO(String name, double price, String status,String category) {
        this.name = name;
        this.price = price;
        this.status = status;
      //  this. Category=category;
    }

   


}
