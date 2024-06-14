package com.example.triptix.service;

import com.example.triptix.model.Seat;
import com.example.triptix.repo.SeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    private final SeatRepository repository;

    public SeatService(SeatRepository repository) {
        this.repository = repository;
    }

    public List<Seat> findAll() {
        return repository.findAll();
    }

    public Seat save(Seat seat) {
        return repository.save(seat);
    }
}
