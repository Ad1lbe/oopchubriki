package com.example.projectoop.repositories;
import com.example.projectoop.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public interface UserRepositoryInterface extends JpaRepository<User, Integer> {
    User findByLogin(String login);

}
