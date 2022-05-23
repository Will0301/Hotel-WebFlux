package com.trivagoflux.hotel.v1.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class HotelControllerRequest {

    private String city;

}
