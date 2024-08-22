package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Supplier;
import com.project.service.SupplierService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
	@Autowired
    private SupplierService supplierService;
	
	
	@Operation(description = "Query for Suppliers data",summary = "Api to query the suppliers based on location, nature of business and manufacturing process")
	@PostMapping("/query")
	public ResponseEntity<Page<Supplier>> querySuppliers(
	    @RequestParam @NotEmpty String location,
	    @RequestParam @NotEmpty String natureOfBusiness,
	    @RequestParam @NotEmpty String manufacturingProcesses,
	    @RequestParam(defaultValue = "0") @Min(0) int page,
	    @RequestParam(defaultValue = "10") @Min(1) int size
	){
		Page<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses, page, size);
        return ResponseEntity.ok(suppliers);
	}
	
	
}
