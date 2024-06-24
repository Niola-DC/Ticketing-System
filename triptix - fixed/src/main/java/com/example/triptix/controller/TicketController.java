package com.example.triptix.controller;

import com.example.triptix.exception.ApiException;
import com.example.triptix.model.*;
import com.example.triptix.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketingService;


    @GetMapping("/destinations")
    public List<Destination> getAllDestinations() {
        try{
            return ticketingService.getAllDestinations();
        }
        catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }

    @GetMapping("/vehicle-types")
    public List<VehicleType> getAllVehicleTypes() {
        return ticketingService.getAllVehicleTypes();
    }

    @GetMapping("/trips")
    public List<Trip> getAvailableTrips() {
        return ticketingService.getAvailableTrips();
    }
    @GetMapping("/seats")
    public List<Seat> getAvailableSeats() {
        return ticketingService.getAvailableSeats();
    }

    @PostMapping
    public Ticket bookTicket(@RequestBody Ticket ticket) {
        return ticketingService.bookTicket(ticket);
    }
    // UPDATE----
}
