package com.example.Inventory.Service;

//import com.example.Inventory.Controller.Map;
//import com.example.Inventory.Controller.SupplierDetailsDTO;
import com.example.Inventory.Model.Product;
import com.example.Inventory.Model.PurchaseOrder;
import com.example.Inventory.Model.Supplier;
import com.example.Inventory.Repository.ProductRepository;
import com.example.Inventory.Repository.PurchaseOrderRepository;
import com.example.Inventory.Repository.SupplierRepository;
import com.example.Inventory.dto.DetailsOfPurchaseProduct;
import com.example.Inventory.dto.ProductDTO;
import com.example.Inventory.dto.PurchaseOrderDTO;
import com.example.Inventory.dto.SupplierDTO;
import com.example.Inventory.dto.SupplierDetailsDTO;
import com.example.Inventory.dto.SupplierProductDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class InventoryService<PurchaseOrderDetailsDTO> {
    @Autowired
    public ProductRepository productRepo;
    @Autowired
    public SupplierRepository supplierRepo;
    @Autowired
    public PurchaseOrderRepository orderRepo;

    public InventoryService(ProductRepository productRepo,
            SupplierRepository supplierRepo,
            PurchaseOrderRepository orderRepo) {
        this.productRepo = productRepo;
        this.supplierRepo = supplierRepo;
        this.orderRepo = orderRepo;
    }

    public List<PurchaseOrder> getOrdersByProduct(Long productId) {
        return orderRepo.findByProductIdWithSupplier(productId);
    }

    public List<Object[]> aggregateQuantityPerCategoryPerSupplier() {
        return orderRepo.aggregateQuantityPerCategoryPerSupplier();
    }

    public List<Object[]> top5ProductsBySupplier(Long supplierId) {
        return orderRepo.top5ProductsBySupplier(supplierId);
    }

    // src/main/java/com/example/inventory/service/InventoryService.java
    public Product createProduct(ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.name);
        product.setCategory(dto.category);
        product.setPrice(dto.price);
        return productRepo.save(product);
    }

    public Supplier createSupplier(SupplierDTO dto) {
        Supplier supplier = new Supplier();
        supplier.setName(dto.name);
        supplier.setEmail(dto.email);
        return supplierRepo.save(supplier);
    }

    public PurchaseOrder createPurchaseOrder(PurchaseOrderDTO dto) {
        PurchaseOrder order = new PurchaseOrder();
        Product product = productRepo.findById(dto.productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        Supplier supplier = supplierRepo.findById(dto.supplierId)
                .orElseThrow(() -> new RuntimeException("Supplier not found"));
        order.setProduct(product);
        order.setSupplier(supplier);
        order.setQuantity(dto.quantity);
        order.setOrderDate(dto.orderDate);
        return orderRepo.save(order);

        // first step
        // chceked the prdt adn supplier id are persent in iteself if all goes right
        // then next step
        // secnd step
        // now set the data values to main entity class of productOrder

    }

    public List<DetailsOfPurchaseProduct> getDetailOfSpecificProduct(Long productId) {
        return orderRepo.findPurchaseOrderDetailsByProductId(productId);
    }

    public java.util.Map<String, List<com.example.Inventory.dto.SupplierDetailsDTO>> getSupplierDetailsService(
            Long supplierId) {

        List<SupplierDetailsDTO> dtoList = supplierRepo.findSupplierDetailsBySupplierId(supplierId);

        // Group by product name
        Map<String, List<SupplierDetailsDTO>> map = dtoList.stream()
                .collect(Collectors.groupingBy(SupplierDetailsDTO::getName));

        return map;
    }


    public Map<String, List<SupplierProductDTO>> findProductsBySupplierId(Long supplierId) {
        List<SupplierProductDTO> list = orderRepo.findSupplierDetailsBySupplierIdAndProductDetail(supplierId);

        Map<String, List<SupplierProductDTO>> map = list.stream()
                .collect(Collectors.groupingBy(SupplierProductDTO::getSupplierName));

        return map;

    }

}
