package com.example.projectoop.services;

import com.example.projectoop.models.Ticket;
import com.example.projectoop.repositories.TicketRepositoryInterface;
import com.example.projectoop.services.Interface.TicketServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService implements TicketServiceInterface {
    private final TicketRepositoryInterface repo;

    public TicketService(TicketRepositoryInterface repo) {
        this.repo = repo;
    }


    @Override
    public List<Ticket> getAll() {
        return repo.findAll();
    }

    @Override
    public Ticket getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Ticket create(Ticket ticket) {
        return repo.save(ticket);
    }

    @Override
    public Ticket getByName(String name) {
        return null;
    }

    @Override
    public Ticket getByOwner(int owner) {
        return null;
    }
}
