package com.trivagoflux.locator.service;

import com.trivagoflux.locator.mapper.request.LocatorServiceRequestMapper;
import com.trivagoflux.locator.mapper.response.LocatorServiceResponseMapper;
import com.trivagoflux.locator.model.request.LocatorServiceRequest;
import com.trivagoflux.locator.model.response.LocatorServiceResponse;
import com.trivagoflux.locator.repository.entity.LocatorEntity;
import com.trivagoflux.locator.repository.repository.LocatorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class LocatorService {

    private LocatorRepository locatorRepository;

    public Mono<LocatorServiceResponse> signIn(LocatorServiceRequest locatorServiceRequest){
        return locatorRepository
                .save(LocatorServiceRequestMapper.toLocatorEntity(locatorServiceRequest))
                .map(LocatorServiceResponseMapper::toLocatorServiceResponse);
    }

    public Mono<LocatorServiceResponse> update(LocatorEntity locator){
        return locatorRepository.save(locator)
                .map(LocatorServiceResponseMapper::toLocatorServiceResponse);
    }

    public Mono<LocatorServiceResponse> findByCpf(String cpf){
        return locatorRepository.findLocatorEntityByCpf(cpf)
                .map(LocatorServiceResponseMapper::toLocatorServiceResponse);
    }

    public void signOut(String cpf){
        locatorRepository.deleteLocatorEntityByCpf(cpf);
    }
}
