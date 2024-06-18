package com.example.triptix.config;

import com.example.triptix.model.*;
import com.example.triptix.repo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Collections;

@Component
@RequiredArgsConstructor
public class FakeDataLoader implements CommandLineRunner {

    private final DestinationRepository destinationRepository;

    private final VehicleTypeRepository vehicleTypeRepository;

    private final VehicleRepository vehicleRepository;

    private final TripRepository tripRepository;

    @Override
    public void run(String... args) throws Exception {
//        Destination dest1 = new Destination(null, "City A");
//        Destination dest2 = new Destination(null, "City B");
//        destinationRepository.save(dest1);
//        destinationRepository.save(dest2);

        VehicleType type1 = new VehicleType(null, Collections.singleton(EType.valueOf("CAR")));
        VehicleType type2 = new VehicleType(null, Collections.singleton(EType.MINI_BUS));
        VehicleType type3 = new VehicleType(null, Collections.singleton(EType.REGULAR_BUS));
        VehicleType type4 = new VehicleType(null, Collections.singleton(EType.REGULAR_BUS));
        vehicleTypeRepository.save(type1);
        vehicleTypeRepository.save(type2);
        vehicleTypeRepository.save(type3);
        vehicleTypeRepository.save(type4);

        Vehicle vehicle1 = new Vehicle(null, "ABC123", type1);
        Vehicle vehicle2 = new Vehicle(null, "DEF456", type2);
        Vehicle vehicle3 = new Vehicle(null, "GHI789", type3);
        vehicleRepository.save(vehicle1);
        vehicleRepository.save(vehicle2);
        vehicleRepository.save(vehicle3);

//        Trip trip1 = new Trip(null, dest1, dest2, LocalDateTime.now().plusDays(1), vehicle1);
//        Trip trip2 = new Trip(null, dest1, dest2, LocalDateTime.now().plusDays(1), vehicle2);
//        Trip trip3 = new Trip(null, dest1, dest2, LocalDateTime.now().plusDays(1), vehicle3);
//        tripRepository.save(trip1);
//        tripRepository.save(trip2);
//        tripRepository.save(trip3);
    }
}

