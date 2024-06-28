package com.trivagoflux.hotel.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class HotelServiceRequest {

    private String city;

}
