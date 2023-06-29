package com.example.legion.repo;

import com.example.legion.models.Tournament;
import org.springframework.data.repository.CrudRepository;

public interface TournamentRepository extends CrudRepository<Tournament, Long> {
}
