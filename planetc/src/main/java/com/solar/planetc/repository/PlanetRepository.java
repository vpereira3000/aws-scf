package com.solar.planetc.repository;

import org.springframework.data.repository.CrudRepository;
import com.solar.planetc.model.PlanetEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends CrudRepository<PlanetEntity, String> {

}
