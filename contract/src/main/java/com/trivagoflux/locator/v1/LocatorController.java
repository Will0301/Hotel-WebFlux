package com.trivagoflux.locator.v1;

import com.trivagoflux.locator.v1.facade.LocatorFacadeController;
import com.trivagoflux.locator.v1.model.request.LocatorControllerRequest;
import com.trivagoflux.locator.v1.model.response.LocatorControllerResponse;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/locator")
public class LocatorController {

    private LocatorFacadeController locatorFacadeController;

    @PostMapping("/sign")
    public Mono<LocatorControllerResponse> signIn(@RequestBody LocatorControllerRequest locatorControllerRequest){
        return locatorFacadeController.signIn(locatorControllerRequest);
    }

//    public Mono<LocatorServiceResponse> rentHotel(String cpf, String id){
//         return locatorService.update();
//    }

    @GetMapping("/find")
    public Mono<LocatorControllerResponse> findByCpf(@RequestParam String cpf){
        return locatorFacadeController.findByCpf(cpf);
    }

    @DeleteMapping("/exit")
    public void signOut(@RequestParam String cpf){
        locatorFacadeController.signOut(cpf);
    }
}
