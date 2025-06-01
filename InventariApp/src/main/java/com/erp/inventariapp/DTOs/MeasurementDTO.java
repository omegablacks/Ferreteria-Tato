package com.erp.inventariapp.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MeasurementDTO {
    private Long idmeasurement;

    @NotBlank
    private String name;

    @NotNull
    private Boolean state;

}
