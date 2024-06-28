package com.trivagoflux.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class HotelIntegrationRequest {

    private String city;
}
