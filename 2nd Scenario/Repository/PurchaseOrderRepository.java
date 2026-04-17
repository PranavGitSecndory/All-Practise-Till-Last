package com.example.Inventory.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Inventory.Model.PurchaseOrder;
//import com.example.Inventory.Service.Map;
//import com.example.Inventory.Service.SupplierDetailsDTO;
import com.example.Inventory.dto.DetailsOfPurchaseProduct;
//import com.example.Inventory.dto.SupplierDTO;
import com.example.Inventory.dto.SupplierDetailsDTO;
import com.example.Inventory.dto.SupplierProductDTO;

import java.util.List;
import java.util.Map;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {

    @Query("SELECT po FROM PurchaseOrder po JOIN FETCH po.supplier WHERE po.product.id = :productId")
    List<PurchaseOrder> findByProductIdWithSupplier(Long productId);

    @Query("SELECT po.product.category, po.supplier.name, SUM(po.quantity) " +
           "FROM PurchaseOrder po GROUP BY po.product.category, po.supplier.name")
    List<Object[]> aggregateQuantityPerCategoryPerSupplier();


    @Query("SELECT po.product.name, COUNT(po.id) as orderCount " +
           "FROM PurchaseOrder po WHERE po.supplier.id = :supplierId " +
           "GROUP BY po.product.name ORDER BY orderCount DESC")
    List<Object[]> top5ProductsBySupplier(Long supplierId);

      @Query("SELECT new com.example.Inventory.dto.DetailsOfPurchaseProduct(" +
           "po.id, po.supplier.email, po.supplier.name, " +
           "po.product.category, po.product.name, " +
           "po.product.price, " +
           "po.orderDate, po.quantity) " +
           "FROM PurchaseOrder po " +
           "WHERE po.product.id = :productId")    //:productId = 1L  // if you call findPurchaseOrderDetailsByProductId(1L)
                                                 // SELECT ... 
                                                // FROM PurchaseOrder po
                                               // WHERE po.product.id = 1
    List<DetailsOfPurchaseProduct> findPurchaseOrderDetailsByProductId(Long productId);





      @Query("""
        SELECT new com.example.Inventory.dto.SupplierProductDTO(
            s.name, s.email, p.name, p.price, p.category, po.orderDate
        )
        FROM PurchaseOrder po
        JOIN po.product p
        LEFT JOIN po.supplier s
        WHERE s.id = :supplierId
    """)
    List<SupplierProductDTO> findSupplierDetailsBySupplierIdAndProductDetail(@Param("supplierId") Long supplierId);

}






