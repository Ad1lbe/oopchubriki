package com.example.projectoop.services;

import com.example.projectoop.models.Ticket;
import com.example.projectoop.models.User;
import com.example.projectoop.repositories.UserRepositoryInterface;
import com.example.projectoop.services.Interface.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserServiceInterface {

    private final UserRepositoryInterface repo;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public User create(User user) {
        return repo.save(user);
    }

    @Override
    public User getByLogin(String login) {
        return repo.findByLogin(login);
    }

    @Override
    public List<User> getAllSellers(boolean typeofaccount){
        return repo.findAllSellers(typeofaccount);
    }
    @Override
    public List<User> getAllBuyers(boolean typeofaccount){
        return null;
    }

    @Override
    public List<User> getByTicket(Ticket ticket) {
        return null;
    }
}
