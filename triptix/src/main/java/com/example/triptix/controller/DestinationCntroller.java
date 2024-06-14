package com.example.triptix.controller;

import com.example.triptix.model.Destination;
import com.example.triptix.service.DestinationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/journeys")
public class DestinationCntroller {
    private final DestinationService service;

    public DestinationCntroller(DestinationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Destination> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Destination create(@RequestBody Destination destination) {
        return service.save(destination);
    }
}
