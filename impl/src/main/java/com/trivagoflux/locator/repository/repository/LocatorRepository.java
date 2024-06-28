package com.trivagoflux.locator.repository.repository;

import com.trivagoflux.locator.repository.entity.LocatorEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface LocatorRepository extends ReactiveMongoRepository<LocatorEntity, String> {

    Mono<LocatorEntity> findLocatorEntityByCpf(String cpf);

    void deleteLocatorEntityByCpf(String cpf);
}
