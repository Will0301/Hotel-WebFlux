package com.trivagoflux.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class HotelServiceResponse {

    private String name;

    private String shortName;

    private ServiceAddress address;

    @JsonProperty("coordenates")
    private String coordinates;

    private String hotelId;

}
