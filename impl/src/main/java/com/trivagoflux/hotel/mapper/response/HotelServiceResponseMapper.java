package com.trivagoflux.hotel.mapper.response;

import com.trivagoflux.hotel.model.response.HotelServiceResponse;
import com.trivagoflux.hotel.model.response.ServiceAddress;
import com.trivagoflux.hotel.repository.entity.Address;
import com.trivagoflux.hotel.repository.entity.HotelEntity;
import com.trivagoflux.model.response.*;

public class HotelServiceResponseMapper {

    public static HotelServiceResponse toHotelServiceResponse(HotelIntegrationResponse hotelIntegrationResponse){
        return HotelServiceResponse.builder()
                .hotelId(hotelIntegrationResponse.getHotelId())
                .name(hotelIntegrationResponse.getName())
                .shortName(hotelIntegrationResponse.getShortName())
                .address(ServiceAddress.builder()
                        .city(hotelIntegrationResponse.getAddress().getCity())
                        .country(hotelIntegrationResponse.getAddress().getCountry())
                        .street(hotelIntegrationResponse.getAddress().getAddress())
                        .build())
                .coordinates(hotelIntegrationResponse.getCoordinates())
                .build();
    }

    public static HotelServiceResponse toHotelServiceResponse(HotelEntity hotelEntity){
        return HotelServiceResponse.builder()
                .hotelId(hotelEntity.getHotelId())
                .name(hotelEntity.getName())
                .shortName(hotelEntity.getShortName())
                .address(ServiceAddress.builder()
                        .city(hotelEntity.getAddress().getCity())
                        .country(hotelEntity.getAddress().getCountry())
                        .street(hotelEntity.getAddress().getStreet())
                        .build())
                .coordinates(hotelEntity.getCoordenates())
                .build();
    }

    public static HotelEntity toHotelSericeEntitty(HotelServiceResponse hotelServiceResponse){
        return HotelEntity.builder()
                .hotelId(hotelServiceResponse.getHotelId())
                .name(hotelServiceResponse.getName())
                .shortName(hotelServiceResponse.getShortName())
                .address(Address.builder()
                        .city(hotelServiceResponse.getAddress().getCity())
                        .country(hotelServiceResponse.getAddress().getCountry())
                        .street(hotelServiceResponse.getAddress().getStreet())
                        .build())
                .coordenates(hotelServiceResponse.getCoordinates())
                .build();
    }
}
