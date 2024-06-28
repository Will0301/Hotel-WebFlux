package com.trivagoflux.locator.model.response;

import com.trivagoflux.hotel.repository.entity.HotelEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Flux;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class LocatorServiceResponse {

    private String name;

    private String cpf;

    private Flux<HotelEntity> hotels;
}
