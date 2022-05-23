package com.trivagoflux.hotel.mapper.request;

import com.trivagoflux.hotel.model.request.HotelServiceRequest;
import com.trivagoflux.model.request.HotelIntegrationRequest;

public class HotelServiceRequestMapper {

    public static HotelIntegrationRequest toIntegrationRequest(HotelServiceRequest hotelServiceRequest){
        return HotelIntegrationRequest.builder()
                .city(hotelServiceRequest.getCity())
                .build();
    }
}
