package com.sena.parqueadero.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegistroEntradaDTO {

	@NotBlank(message = "la placa es obligatoria")
	private String placa;

}
