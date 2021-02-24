package com.airlinesproject.airlines;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CountryRestRepository extends CrudRepository<Country, String> {
}
