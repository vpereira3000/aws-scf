package com.solar.planetc.functions;

import com.solar.planetc.model.PlanetEntity;
import com.solar.planetc.repository.PlanetRepository;
import com.solar.planetc.request.APIGatewayRequest;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.UUID;
import java.util.function.Function;
@Component
public class CreatePlanetFunction implements Function<APIGatewayRequest,PlanetEntity> {
    @Autowired
    private PlanetRepository planetRepository;
    @Override
    public PlanetEntity apply(APIGatewayRequest planetRequest) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        PlanetEntity planetEntity = modelMapper.map(planetRequest.getPlanetRequest(), PlanetEntity.class);
        planetEntity.setId(UUID.randomUUID().toString());
        planetRepository.save(planetEntity);
        return planetEntity;
    }
}