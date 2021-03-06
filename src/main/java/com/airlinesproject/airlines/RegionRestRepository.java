package com.airlinesproject.airlines;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RegionRestRepository extends CrudRepository<Region, Long> {
}
