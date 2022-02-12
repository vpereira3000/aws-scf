package com.solar.planetc;

import com.solar.planetc.request.APIGatewayRequest;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class PlanetcHandler extends SpringBootRequestHandler<APIGatewayRequest,Object> {
}
