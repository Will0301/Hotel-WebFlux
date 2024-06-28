package com.trivagoflux.hotel.service.utils;

import com.trivagoflux.hotel.model.response.HotelServiceResponse;
import com.trivagoflux.hotel.model.response.ServiceAddress;
import com.trivagoflux.hotel.repository.entity.Address;
import com.trivagoflux.hotel.repository.entity.HotelEntity;
import reactor.core.publisher.Flux;

public class HotelServiceMock {

    public static Flux<HotelServiceResponse> hotelServiceResponseFlux(){
        return Flux.just(HotelServiceResponse.builder()
                .hotelId("1234567890")
                .name("PUCRS")
                .shortName("PUC")
                .address(ServiceAddress.builder().build())
                .build());
    }

    public static Flux<HotelEntity> hotelEntityFlux(){
        return Flux.just(HotelEntity.builder()
                .hotelId("1234567890")
                .name("PUCRS")
                .shortName("PUC")
                        .address(Address.builder().build())
                .build());
    }

    private static ServiceAddress serviceAddress(){
        return ServiceAddress.builder()
                .city("Porto alegre")
                .country("Brasil")
                .street("Avenida ipiranga")
                .build();
    }
}
