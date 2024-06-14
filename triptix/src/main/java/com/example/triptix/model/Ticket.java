package com.example.triptix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Destination destination;
    @ManyToOne
    private VehicleType vehicleType;
    @ManyToOne
    private Seat seat;
    private String passengerName;
    private double price;
}
