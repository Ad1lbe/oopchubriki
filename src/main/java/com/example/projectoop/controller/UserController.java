package com.example.projectoop.controller;

import com.example.projectoop.models.User;
import com.example.projectoop.services.Interface.UserServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("users")


public class UserController {

    private final UserServiceInterface service;

    public UserController(UserServiceInterface service) {
        this.service = service;
    }


    @GetMapping
    public String sayHello(){
        return "Hello wordl";
    }

    @GetMapping("/")
    public List<User> getAll(){
        return service.getAll();
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<User> getById(@PathVariable("user_id") int id) {
        User user = service.getById(id);
        if(user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/logins/{user_login}")
    public User getByLogin(@PathVariable("user_login") String login){
        return service.getByLogin(login);
    }

    @PostMapping("/createuser")
    public ResponseEntity<User> create(@RequestBody User user){
        User createduser = service.create(user);
        if(createduser == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(createduser, HttpStatus.CREATED);
    }

    @GetMapping("/sellers")
    public ResponseEntity<List<User>> getAllSellers(boolean typeofaccount) {

        List<User> users = service.getAllSellers(typeofaccount);
        if (users == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
