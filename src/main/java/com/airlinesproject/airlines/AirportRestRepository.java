package com.airlinesproject.airlines;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AirportRestRepository extends CrudRepository<Airport, Long> {
}
