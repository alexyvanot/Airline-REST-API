package fr.alexyvanot.airlinerestapi.entities;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String address;
    private String phone;
    @Temporal(TemporalType.DATE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date birthdayDate;
    @Temporal(TemporalType.TIMESTAMP) // out:
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date creationDate;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date modificationDate;

    public User() {}



}
