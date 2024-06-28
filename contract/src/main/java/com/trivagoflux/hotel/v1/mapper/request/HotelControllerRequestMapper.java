package com.trivagoflux.hotel.v1.mapper.request;

import com.trivagoflux.hotel.model.request.HotelServiceRequest;
import com.trivagoflux.hotel.v1.model.request.HotelControllerRequest;

public class HotelControllerRequestMapper {

    public static HotelServiceRequest toServiceRequest(HotelControllerRequest hotelControllerRequest){
        return HotelServiceRequest.builder()
                .city(hotelControllerRequest.getCity())
                .build();
    }
}
