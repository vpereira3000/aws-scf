package com.solar.planetrd.functions;

import com.solar.planetrd.model.PlanetEntity;
import com.solar.planetrd.repository.PlanetRepository;
import com.solar.planetrd.request.APIGatewayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.function.Function;
@Component
public class ReadPlanetFunction implements Function<APIGatewayRequest,PlanetEntity> {
    @Autowired
    private PlanetRepository planetRepository;
    @Override
    public PlanetEntity apply(APIGatewayRequest planetRequest) {
        return planetRepository.findById(planetRequest.getPlanetRequest().getId()).get();
    }
}