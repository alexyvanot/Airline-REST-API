package fr.alexyvanot.airlinerestapi.controllers;

import fr.alexyvanot.airlinerestapi.entities.User;
import fr.alexyvanot.airlinerestapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User user(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

}
