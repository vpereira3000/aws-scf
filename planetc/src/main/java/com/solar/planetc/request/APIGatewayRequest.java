package com.solar.planetc.request;

public class APIGatewayRequest {

    private String httpMethod;
    private PlanetRequest planetRequest;

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public PlanetRequest getPlanetRequest() {
        return planetRequest;
    }

    public void setPlanetRequest(PlanetRequest planetRequest) {
        this.planetRequest = planetRequest;
    }
}
