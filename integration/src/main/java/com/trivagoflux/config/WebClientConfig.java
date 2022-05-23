package com.trivagoflux.config;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl("https://booking-com.p.rapidapi.com")
                .defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                .defaultHeader("x-rapidapi-host", "hotel-price-aggregator.p.rapidapi.com")
                .defaultHeader("x-rapidapi-key", "108abdd2f4msh1b627092924ac42p1a4cf1jsn14d423951b26")
                .build();
    }
}
