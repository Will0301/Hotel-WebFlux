package com.trivagoflux.locator.mapper.request;

import com.trivagoflux.locator.model.request.LocatorServiceRequest;
import com.trivagoflux.locator.repository.entity.LocatorEntity;

public class LocatorServiceRequestMapper {

    public static LocatorEntity toLocatorEntity(LocatorServiceRequest locatorServiceRequest){
        return LocatorEntity.builder()
                .name(locatorServiceRequest.getName())
                .cpf(locatorServiceRequest.getCpf())
                .build();
    }
}
