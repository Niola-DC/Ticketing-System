package com.example.triptix.service;

import com.example.triptix.model.Ticket;
import com.example.triptix.repo.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public List<Ticket> findAll() {
        return repository.findAll();
    }

    public Ticket save(Ticket ticket) {
        return repository.save(ticket);
    }
}
