package com.example.legion.repo;

import com.example.legion.models.Place;
import org.springframework.data.repository.CrudRepository;

public interface PlaceRepository extends CrudRepository<Place, Long> {
}
