package fr.alexyvanot.airlinerestapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer numPassport;

    public Customer() {}

    public Integer getId() {
        return id;
    }

    public Integer getNumPassport() {
        return numPassport;
    }

    public void setNumPassport(Integer numPassport) {
        this.numPassport = numPassport;
    }
}
