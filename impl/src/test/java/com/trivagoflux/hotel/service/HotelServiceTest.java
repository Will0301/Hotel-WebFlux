package com.trivagoflux.hotel.service;

import com.trivagoflux.hotel.repository.HotelRepository;
import com.trivagoflux.hotel.service.utils.HotelServiceMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
public class HotelServiceTest {

    @Mock
    HotelRepository hotelRepository;

    @InjectMocks
    HotelService hotelService;

    @Test
    void shouldReturnAllHotels() {
        final var expected = HotelServiceMock.hotelServiceResponseFlux().blockFirst();
        Mockito.when(hotelRepository.findAll()).thenReturn(HotelServiceMock.hotelEntityFlux());
        StepVerifier.create(hotelService.findAll())
                .consumeNextWith(actual -> Assertions.assertEquals(actual, expected))
                .verifyComplete();
    }
}
