package com.example.Inventory.Repository;

import com.example.Inventory.Model.Supplier;
import com.example.Inventory.dto.SupplierDetailsDTO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.Inventory.Model.Supplier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    // JpaRepository already provides findById() and save()
@Query("SELECT new com.example.Inventory.dto.SupplierDetailsDTO(s.id, s.name) FROM Supplier s WHERE s.id = :supplierId")
List<SupplierDetailsDTO> findSupplierDetailsBySupplierId(@Param("supplierId") Long supplierId);

void findSupplierDetailsBySupplierIdAndProductDetail(Long supplierId);

}

