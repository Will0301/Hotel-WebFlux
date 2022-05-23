package com.trivagoflux.locator.v1.mapper.response;

import com.trivagoflux.locator.model.response.LocatorServiceResponse;
import com.trivagoflux.locator.v1.model.response.LocatorControllerResponse;

public class LocatorControllerResponseMapper {

    public static LocatorControllerResponse toLocatorController(LocatorServiceResponse locatorServiceResponse){
        return LocatorControllerResponse.builder()
                .cpf(locatorServiceResponse.getCpf())
                .name(locatorServiceResponse.getName())
                .hotels(locatorServiceResponse.getHotels())
                .build();
    }
}
