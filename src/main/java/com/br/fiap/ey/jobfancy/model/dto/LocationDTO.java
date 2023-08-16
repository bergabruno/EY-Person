package com.br.fiap.ey.jobfancy.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LocationDTO {

    @NotBlank
    private String city;
    @NotBlank
    private String country;
    @NotBlank
    private String state;
    @NotBlank
    private String address;
}
