package com.example.projectoop.repositories;

import com.example.projectoop.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TicketRepositoryInterface extends JpaRepository<Ticket, Integer> {

}
