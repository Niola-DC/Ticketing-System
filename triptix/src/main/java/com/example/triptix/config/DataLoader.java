package com.example.triptix.config;

import com.example.triptix.model.*;
import com.example.triptix.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private DestinationRepository destinationRepository;

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private TripRepository tripRepository;

    @Override
    public void run(String... args) throws Exception {
        Destination dest1 = new Destination(null, "City A");
        Destination dest2 = new Destination(null, "City B");
        destinationRepository.save(dest1);
        destinationRepository.save(dest2);

        VehicleType type1 = new VehicleType(null, "Private Car");
        VehicleType type2 = new VehicleType(null, "Bus Car");
        VehicleType type3 = new VehicleType(null, "Regular Bus");
        vehicleTypeRepository.save(type1);
        vehicleTypeRepository.save(type2);
        vehicleTypeRepository.save(type3);

        Vehicle vehicle1 = new Vehicle(null, "ABC123", type1);
        Vehicle vehicle2 = new Vehicle(null, "DEF456", type2);
        Vehicle vehicle3 = new Vehicle(null, "GHI789", type3);
        vehicleRepository.save(vehicle1);
        vehicleRepository.save(vehicle2);
        vehicleRepository.save(vehicle3);

        Trip trip1 = new Trip(null, dest1, dest2, LocalDateTime.now().plusDays(1), vehicle1);
        Trip trip2 = new Trip(null, dest1, dest2, LocalDateTime.now().plusDays(1), vehicle2);
        Trip trip3 = new Trip(null, dest1, dest2, LocalDateTime.now().plusDays(1), vehicle3);
        tripRepository.save(trip1);
        tripRepository.save(trip2);
        tripRepository.save(trip3);
    }
}

