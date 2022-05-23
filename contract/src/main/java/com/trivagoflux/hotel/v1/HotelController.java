package com.trivagoflux.hotel.v1;

import com.trivagoflux.hotel.v1.facade.HotelControllerFacade;
import com.trivagoflux.hotel.v1.model.request.HotelControllerRequest;
import com.trivagoflux.hotel.v1.model.response.HotelControllerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/hotel")
public class HotelController {

    private final HotelControllerFacade hotelControllerFacade;

    @GetMapping("/search/{city}")
    public Flux<HotelControllerResponse> search(@PathVariable String city){
        return hotelControllerFacade.search(HotelControllerRequest.builder().city(city).build());
    }

    @GetMapping("/id")
    public Mono<HotelControllerResponse> findById(@RequestParam String id){
        return hotelControllerFacade.findById(id);
    }

    @GetMapping("/all")
    public Flux<HotelControllerResponse> findAll(){
        return hotelControllerFacade.findAll();
    }
}
