package com.trivagoflux.hotel.v1.mapper.response;

import com.trivagoflux.hotel.v1.model.response.ControllerAddress;
import com.trivagoflux.hotel.v1.model.response.HotelControllerResponse;
import com.trivagoflux.hotel.model.response.HotelServiceResponse;

public class HotelControllerResponseMapper {

    public static HotelControllerResponse toHotelController(HotelServiceResponse hotelServiceResponse){
        return HotelControllerResponse.builder()
                .hotelId(hotelServiceResponse.getHotelId())
                .name(hotelServiceResponse.getName())
                .shortName(hotelServiceResponse.getShortName())
                .address(ControllerAddress.builder()
                        .city(hotelServiceResponse.getAddress().getCity())
                        .country(hotelServiceResponse.getAddress().getCountry())
                        .street(hotelServiceResponse.getAddress().getStreet())
                        .build())
                .coordinates(hotelServiceResponse.getCoordinates())
                .build();
    }
}