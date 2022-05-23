package com.trivagoflux.hotel.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceAddress {

    private String city;

    private String country;

    @JsonAlias("address")
    private String street;
}
