package com.trivagoflux.hotel.v1.facade;

import com.trivagoflux.hotel.facade.HotelServiceFacade;
import com.trivagoflux.hotel.v1.mapper.response.HotelControllerResponseMapper;
import com.trivagoflux.hotel.v1.model.request.HotelControllerRequest;
import com.trivagoflux.hotel.v1.model.response.HotelControllerResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.trivagoflux.hotel.v1.mapper.request.HotelControllerRequestMapper.toServiceRequest;

@Service
@AllArgsConstructor
public class HotelControllerFacade {

    private HotelServiceFacade hotelServiceFacade;

    public Flux<HotelControllerResponse> search(HotelControllerRequest hotelControllerRequest){
        return hotelServiceFacade.search(toServiceRequest(hotelControllerRequest))
                .map(HotelControllerResponseMapper::toHotelController);
    }

    public Mono<HotelControllerResponse> findById(String id){
        return hotelServiceFacade.findById(id)
                .map(HotelControllerResponseMapper::toHotelController);
    }

    public Flux<HotelControllerResponse> findAll(){
        return hotelServiceFacade.findAll()
                .map(HotelControllerResponseMapper::toHotelController);
    }
}
