package com.trivagoflux.locator.v1.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocatorControllerRequest {

    private String name;

    private String cpf;

}