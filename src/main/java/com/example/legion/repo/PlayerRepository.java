package com.example.legion.repo;

import com.example.legion.models.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
