package com.example.triptix.service;

import com.example.triptix.model.Destination;
import com.example.triptix.repo.DestinationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {
    private final DestinationRepository repository;

    public DestinationService(DestinationRepository repository) {
        this.repository = repository;
    }

    public List<Destination> findAll() {
        return repository.findAll();
    }

    public Destination save(Destination journey) {
        return repository.save(journey);
    }
}
