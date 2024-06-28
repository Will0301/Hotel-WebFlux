package com.trivagoflux.hotel.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("hotels")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelEntity {

    private String name;

    private String shortName;

    private Address address;

    private String coordenates;

    @Id
    private String hotelId;
}
