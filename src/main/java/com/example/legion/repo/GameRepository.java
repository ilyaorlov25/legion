package com.example.legion.repo;

import com.example.legion.models.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {
}
