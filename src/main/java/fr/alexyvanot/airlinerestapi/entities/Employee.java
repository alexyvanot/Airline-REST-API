package fr.alexyvanot.airlinerestapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
