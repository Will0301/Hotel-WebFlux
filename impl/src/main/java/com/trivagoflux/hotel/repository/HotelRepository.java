package com.trivagoflux.hotel.repository;

import com.trivagoflux.hotel.model.response.HotelServiceResponse;
import com.trivagoflux.hotel.repository.entity.HotelEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.util.List;

public interface HotelRepository extends ReactiveMongoRepository<HotelEntity, String> {

    Flux<HotelServiceResponse> saveAll(Flux<HotelServiceResponse> hotels);

    Flux<HotelEntity> findAllByAddressCityContainingIgnoreCase(String city);
}
