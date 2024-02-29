package com.example.projectoop.services.Interface;
import com.example.projectoop.models.Ticket;
import com.example.projectoop.models.User;
import java.util.List;

public interface TicketServiceInterface {

    List<Ticket> getAll();
    Ticket getById(int id);
    Ticket create(Ticket ticket);
    Ticket getByName(String name);
    Ticket getByOwner(int owner);


}
