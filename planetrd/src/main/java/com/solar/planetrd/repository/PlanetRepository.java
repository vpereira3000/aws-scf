package com.solar.planetrd.repository;

import org.springframework.data.repository.CrudRepository;
import com.solar.planetrd.model.PlanetEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends CrudRepository<PlanetEntity, String> {

}
