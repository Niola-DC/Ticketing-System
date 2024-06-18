package com.example.triptix.service;

import com.example.triptix.exception.ApiException;
import com.example.triptix.model.*;
import com.example.triptix.repo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final DestinationRepository destinationRepository;

    private final VehicleTypeRepository vehicleTypeRepository;

    private final VehicleRepository vehicleRepository;

    private final TripRepository tripRepository;

    private final TicketRepository ticketRepository;

    private final SeatRepository seatRepository;

    public List<Destination> getAllDestinations() {
        var all = destinationRepository.findAll();
        if (all.isEmpty()) {
            throw new ApiException("No Destination");
        }
        return all;
    }

    public List<VehicleType> getAllVehicleTypes() {

        return vehicleTypeRepository.findAll();
    }

    public List<Trip> getAvailableTrips() {
        return tripRepository.findAll();
    }

    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
    public List<Seat> getAvailableSeats() {

        return seatRepository.findAll();
    }
}
