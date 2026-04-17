package com.example.Product_Management.Service;

import com.example.Product_Management.Model.Product;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class ExcelExportService {

    public byte[] generateProductExcel(List<Product> products) throws Exception {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Products");

        // Header row
        Row header = sheet.createRow(0);
        String[] columns = {"ID", "Name", "Category", "Brand", "Price", "Quantity", "Status"};
        for (int i = 0; i < columns.length; i++) {
            Cell cell = header.createCell(i);
            cell.setCellValue(columns[i]);
        }

        // Data rows
        int rowNum = 1;
        for (Product p : products) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(p.getId());
            row.createCell(1).setCellValue(p.getName());
            row.createCell(2).setCellValue(p.getCategory());
        // row.createCell(3).setCellValue(p.getBrand()); // add getBrand() if missing
            row.createCell(4).setCellValue(p.getPrice());
            row.createCell(5).setCellValue(p.getStockQuantity());
            row.createCell(6).setCellValue(p.getStatus());
        }

        // Auto-size columns
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }
        // Write to byte array
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        workbook.write(out);
        workbook.close();
        return out.toByteArray();
    }
}
