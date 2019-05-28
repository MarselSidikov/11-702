package ru.itis.springbootapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.itis.springbootapp.forms.UserForm;
import ru.itis.springbootapp.models.User;
import ru.itis.springbootapp.repositories.UsersRepository;

import java.util.List;
import java.util.Optional;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public String getUsersPage() {
        return "users";
    }

    @GetMapping("/users.json")
    @ResponseBody
    public ResponseEntity<List<User>> getUsersAsJson() {
        return ResponseEntity.ok(usersRepository.findAll());
    }

    @PostMapping("/users/{user-id}")
    @ResponseBody
    public ResponseEntity<Object> updateUser(@PathVariable("user-id") Long userId, UserForm userForm) {
        Optional<User> userCandidate = usersRepository.findById(userId);
        if (userCandidate.isPresent()) {
            User user = userCandidate.get();
            user.setFirstName(userForm.getFirstName());
            user.setLastName(userForm.getFirstName());
            usersRepository.save(user);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/users")
    @ResponseBody
    public ResponseEntity<Object> addUser(@RequestBody UserForm userForm) {
        User user = User.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .build();
        usersRepository.save(user);
        return ResponseEntity.status(201).build();
    }
}
