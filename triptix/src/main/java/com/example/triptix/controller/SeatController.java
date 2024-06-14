package com.example.triptix.controller;

import com.example.triptix.model.Seat;
import com.example.triptix.service.SeatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seats")
public class SeatController {
    private final SeatService service;

    public SeatController(SeatService service) {
        this.service = service;
    }

    @GetMapping
    public List<Seat> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Seat create(@RequestBody Seat seat) {
        return service.save(seat);
    }
}
