package com.example.Product_Management.Dto;

public class productDTOMap2 {
     private  long  id;
    private Double price;
   private String category;
    private String name;
    //    public productDTOMap2(double price, String category, String name, String status, String stockQuantity1) {
 
    // }
       private String Status;
   
      public productDTOMap2(Long id,String name2, String category2, double price2, int stockQuantity2, String status2) {
        //TODO Auto-generated constructor stub
        this.id=id;
        this.name=name2;
               this.price = price2;
        this.category = category2;
        this.name = name2;
        this.Status = status2;
        this.stockQuantity = stockQuantity2;
    }
      public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
   
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
      private int stockQuantity;
       

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

    
}
