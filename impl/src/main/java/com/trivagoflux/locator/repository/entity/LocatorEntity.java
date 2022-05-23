package com.trivagoflux.locator.repository.entity;

import com.trivagoflux.hotel.repository.entity.HotelEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import reactor.core.publisher.Flux;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocatorEntity {

    @Id
    private String locatorId;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @Size(min = 11, max = 11)
    private String cpf;

    private Flux<HotelEntity> hotel;
}
