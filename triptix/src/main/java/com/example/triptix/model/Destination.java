package com.example.triptix.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data
public class Destination {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String startLocation;
        private String endLocation;
        private LocalDateTime departureTime;
        private LocalDateTime arrivalTime;
    }

