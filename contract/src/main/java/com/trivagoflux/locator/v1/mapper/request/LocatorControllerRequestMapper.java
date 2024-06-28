package com.trivagoflux.locator.v1.mapper.request;

import com.trivagoflux.locator.model.request.LocatorServiceRequest;
import com.trivagoflux.locator.v1.model.request.LocatorControllerRequest;

public class LocatorControllerRequestMapper {

    public static LocatorServiceRequest toLocatorServiceRequest(LocatorControllerRequest locatorControllerRequest){
        return LocatorServiceRequest.builder()
                .name(locatorControllerRequest.getName())
                .cpf(locatorControllerRequest.getCpf())
                .build();
    }
}
