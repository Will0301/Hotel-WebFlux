package com.trivagoflux.hotel.v1.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelControllerResponse {

    private String name;

    private String shortName;

    private ControllerAddress address;

    @JsonProperty("coordenates")
    private String coordinates;

    private String hotelId;

}
