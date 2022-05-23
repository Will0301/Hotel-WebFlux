package com.trivagoflux.integration;

import com.trivagoflux.model.request.HotelIntegrationRequest;
import com.trivagoflux.model.response.HotelIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Service
public class HotelIntegration {

    private WebClient webClient;

    public Flux<HotelIntegrationResponse> search(HotelIntegrationRequest hotelRequest) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/search")
                        .queryParam("q", hotelRequest.getCity())
                        .build())
                .retrieve()
                .bodyToFlux(HotelIntegrationResponse.class);
    }

}
