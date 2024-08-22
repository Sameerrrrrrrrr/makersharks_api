package com.project.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Supplier;
@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Long>{
	
	Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
												        String location,
												        String natureOfBusiness,
												        String manufacturingProcesses,
												        Pageable pageable
														);
}
