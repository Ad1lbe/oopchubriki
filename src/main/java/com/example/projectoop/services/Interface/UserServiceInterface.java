package com.example.projectoop.services.Interface;
import com.example.projectoop.models.Ticket;
import com.example.projectoop.models.User;
import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    User getByLogin(String login);
    List<User> getByTicket(Ticket ticket);
}
