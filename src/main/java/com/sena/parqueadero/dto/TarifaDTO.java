package com.sena.parqueadero.dto;

import com.sena.parqueadero.model.TipoVehiculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TarifaDTO {

	private Long idTarifa;
	@NotNull(message = "El tipo de vehiculo es obligatorio")
	private TipoVehiculo tipoVehiculo;
	@NotNull(message = "La tarifa por hora de es obligatoria")
	@Positive(message = "La tarifa por hora debe ser mayor a cero")
	private Double tarifaPorHora;
	@NotNull(message = "La tarifa por dia es obligatoria")
	@Positive(message = "La tarifa por dia debe ser mayor a cero")
	private Double tarifaPorDia;

}
