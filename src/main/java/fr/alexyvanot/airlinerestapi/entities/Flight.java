package fr.alexyvanot.airlinerestapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String departureCity;
    private String arrivalCity;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private String departureAirport;
    private String arrivalAirport;

    private String airplaneId;
    private Integer seats;


}
