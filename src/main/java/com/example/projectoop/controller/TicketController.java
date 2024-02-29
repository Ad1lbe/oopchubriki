package com.example.projectoop.controller;

import com.example.projectoop.models.Ticket;
import com.example.projectoop.models.User;
import com.example.projectoop.services.Interface.TicketServiceInterface;
import com.example.projectoop.services.Interface.UserServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tickets")
public class TicketController {
    private final TicketServiceInterface service;

    public TicketController(TicketServiceInterface service) {
        this.service = service;
    }
    @GetMapping
    public String sayNoTicketsYet(){
        return "No tickets yet";
    }
    public List<Ticket> getAll(){
        return service.getAll();
    }

    @PostMapping("/createuser")
    public ResponseEntity<Ticket> create(@RequestBody Ticket ticket){
        Ticket createdticket = service.create(ticket);
        if(createdticket == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(createdticket, HttpStatus.CREATED);
    }
}
