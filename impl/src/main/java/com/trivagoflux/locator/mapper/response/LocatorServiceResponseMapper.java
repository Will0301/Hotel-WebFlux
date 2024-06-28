package com.trivagoflux.locator.mapper.response;

import com.trivagoflux.locator.model.response.LocatorServiceResponse;
import com.trivagoflux.locator.repository.entity.LocatorEntity;

public class LocatorServiceResponseMapper {

    public static LocatorServiceResponse toLocatorServiceResponse(LocatorEntity locator){
        return LocatorServiceResponse.builder()
                .name(locator.getName())
                .cpf(locator.getCpf())
                .hotels(locator.getHotel())
                .build();
    }

    public static LocatorEntity toLocatorEntity(LocatorServiceResponse locatorServiceResponse){
        return LocatorEntity.builder()
                .cpf(locatorServiceResponse.getCpf())
                .name(locatorServiceResponse.getName())
                .build();
    }
}
