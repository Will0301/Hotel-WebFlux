package com.trivagoflux.locator.v1.facade;

import com.trivagoflux.locator.facade.LocatorServiceFacade;
import com.trivagoflux.locator.v1.mapper.response.LocatorControllerResponseMapper;
import com.trivagoflux.locator.v1.model.request.LocatorControllerRequest;
import com.trivagoflux.locator.v1.model.response.LocatorControllerResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import static com.trivagoflux.locator.v1.mapper.request.LocatorControllerRequestMapper.toLocatorServiceRequest;

@Service
@AllArgsConstructor
public class LocatorFacadeController {

    private LocatorServiceFacade locatorServiceFacade;

    public Mono<LocatorControllerResponse> signIn(LocatorControllerRequest locatorControllerRequest){
        return locatorServiceFacade.signIn(toLocatorServiceRequest(locatorControllerRequest))
                .map(LocatorControllerResponseMapper::toLocatorController);
    }

//    public Mono<LocatorServiceResponse> rentHotel(String cpf, String id){
//         return locatorService.update();
//    }

    public Mono<LocatorControllerResponse> findByCpf(String cpf){
        return locatorServiceFacade.findByCpf(cpf)
                .map(LocatorControllerResponseMapper::toLocatorController);
    }

    public void signOut(String cpf){
        locatorServiceFacade.signOut(cpf);
    }

}
