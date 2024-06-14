package com.example.triptix.service;

import com.example.triptix.model.VehicleType;
import com.example.triptix.repo.VehicleTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleTypeService {
    private final VehicleTypeRepository repository;

    public VehicleTypeService(VehicleTypeRepository repository) {
        this.repository = repository;
    }

    public List<VehicleType> findAll() {
        return repository.findAll();
    }

    public VehicleType save(VehicleType vehicleType) {
        return repository.save(vehicleType);
    }
}
