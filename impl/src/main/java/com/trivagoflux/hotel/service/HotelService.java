package com.trivagoflux.hotel.service;

import com.trivagoflux.hotel.mapper.response.HotelServiceResponseMapper;
import com.trivagoflux.hotel.model.request.HotelServiceRequest;
import com.trivagoflux.hotel.model.response.HotelServiceResponse;
import com.trivagoflux.hotel.repository.HotelRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
@Data
@Builder
public class HotelService {

    private HotelRepository hotelRepository;

    public Flux<HotelServiceResponse> search(HotelServiceRequest hotelServiceRequest){
        return hotelRepository.findAllByAddressCityContainingIgnoreCase(hotelServiceRequest.getCity())
                .map(HotelServiceResponseMapper::toHotelServiceResponse);
    }

    public Flux<HotelServiceResponse> saveAll(Flux<HotelServiceResponse> hotels){
        return hotelRepository.saveAll(hotels);
    }

    public Mono<HotelServiceResponse> findById(String id){
        return hotelRepository.findById(id)
                .map(HotelServiceResponseMapper::toHotelServiceResponse);
    }

    public Flux<HotelServiceResponse> findAll(){
        return hotelRepository.findAll()
                .map(HotelServiceResponseMapper::toHotelServiceResponse);
    }
}
