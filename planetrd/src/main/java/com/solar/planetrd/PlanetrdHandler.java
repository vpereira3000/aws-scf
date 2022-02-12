package com.solar.planetrd;

import com.solar.planetrd.request.APIGatewayRequest;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class PlanetrdHandler extends SpringBootRequestHandler<APIGatewayRequest,Object> {
}
