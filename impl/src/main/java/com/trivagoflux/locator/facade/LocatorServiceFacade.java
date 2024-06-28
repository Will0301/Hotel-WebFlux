package com.trivagoflux.locator.facade;

import com.trivagoflux.hotel.facade.HotelServiceFacade;
import com.trivagoflux.locator.model.request.LocatorServiceRequest;
import com.trivagoflux.locator.model.response.LocatorServiceResponse;
import com.trivagoflux.locator.service.LocatorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class LocatorServiceFacade {

    private HotelServiceFacade hotelServiceFacade;

    private LocatorService locatorService;

    public Mono<LocatorServiceResponse> signIn(LocatorServiceRequest locatorServiceRequest){
        return locatorService.signIn(locatorServiceRequest);
    }

//    public Mono<LocatorServiceResponse> rentHotel(String cpf, String id){
//         return locatorService.update();
//    }

    public Mono<LocatorServiceResponse> findByCpf(String cpf){
        return locatorService.findByCpf(cpf);
    }

    public void signOut(String cpf){
        locatorService.signOut(cpf);
    }

}
