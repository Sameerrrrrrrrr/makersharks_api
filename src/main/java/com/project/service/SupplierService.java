package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.project.model.Supplier;
import com.project.repo.SupplierRepo;

@Service
public class SupplierService {
	@Autowired
    private SupplierRepo supplierRepo;

    public Page<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return supplierRepo.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
                        location, natureOfBusiness, manufacturingProcesses, pageable);
    }
    
}
