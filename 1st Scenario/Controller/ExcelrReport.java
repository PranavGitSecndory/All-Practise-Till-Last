package com.example.Product_Management.Controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product_Management.Components.ExcelReport;
import com.example.Product_Management.Model.Product;
import com.example.Product_Management.Service.ExcelExportService;

@RestController
@RequestMapping("excelReport")
public class ExcelrReport {
  @Autowired

  public AddProductController apc;
  @Autowired

  public DeletePrdctController dele;
  @Autowired
  public GetAllProducts gpc;

  @Autowired
  public updatePrdct upc;

  @Autowired
  public GetByIdPrdct gbi;


  @Autowired
private ExcelReport excelrReport;

  @GetMapping("/checkApi")
  public String checkApi() {
    System.out.println("chikun api");
    return "checked";
  }
  
   private final ExcelExportService excelExportService;
   // private final GetAllProducts gpc;

    public ExcelrReport(ExcelExportService excelExportService, GetAllProducts gpc) {
        this.excelExportService = excelExportService;
        this.gpc = gpc;
    }
  
    @CrossOrigin(origins = "http://192.168.18.216:8081") 
    @GetMapping("/products")
    public ResponseEntity<byte[]> exportProducts() throws Exception {
      System.out.println("inside the creating the excel");
        List<Product> products = gpc.getAllProducts();

        byte[] bytes = excelExportService.generateProductExcel(products);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=products.xlsx")
                .contentType(MediaType.parseMediaType(
                        "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
                .body(bytes);
    }
}