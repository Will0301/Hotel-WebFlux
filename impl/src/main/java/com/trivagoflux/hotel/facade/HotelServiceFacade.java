package com.trivagoflux.hotel.facade;

import com.trivagoflux.hotel.mapper.response.HotelServiceResponseMapper;
import com.trivagoflux.hotel.model.request.HotelServiceRequest;
import com.trivagoflux.hotel.model.response.HotelServiceResponse;
import com.trivagoflux.hotel.service.HotelService;
import com.trivagoflux.integration.HotelIntegration;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.trivagoflux.hotel.mapper.request.HotelServiceRequestMapper.toIntegrationRequest;

@Service
@AllArgsConstructor
public class HotelServiceFacade {

    private final HotelService hotelService;

    private final HotelIntegration hotelIntegration;

    public Flux<HotelServiceResponse> search(HotelServiceRequest hotelServiceRequest){
        return hotelService.saveAll(hotelIntegration.search(toIntegrationRequest(hotelServiceRequest))
                .map(HotelServiceResponseMapper::toHotelServiceResponse));
    }

    public Mono<HotelServiceResponse> findById(String id){
        return hotelService.findById(id);
    }

    public Flux<HotelServiceResponse> findAll(){
        return hotelService.findAll();
    }
}
