package com.trivagoflux.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class HotelIntegrationResponse {

    private String name;

    private String shortName;

    private IntegrationAddress address;

    @JsonProperty("coordenates")
    private String coordinates;

    private String hotelId;

}
