package com.example.triptix.controller;

import com.example.triptix.model.VehicleType;
import com.example.triptix.service.VehicleTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle-types")
public class VehicleTypeController {
    private final VehicleTypeService service;

    public VehicleTypeController(VehicleTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<VehicleType> getAll() {
        return service.findAll();
    }

    @PostMapping
    public VehicleType create(@RequestBody VehicleType vehicleType) {
        return service.save(vehicleType);
    }
}
