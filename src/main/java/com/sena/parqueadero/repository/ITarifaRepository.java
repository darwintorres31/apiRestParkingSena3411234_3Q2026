package com.sena.parqueadero.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.parqueadero.model.Tarifa;
import com.sena.parqueadero.model.TipoVehiculo;

public interface ITarifaRepository extends JpaRepository<Tarifa, Long> {

	Optional<Tarifa>finByTipoVehiculo(TipoVehiculo tipoVehiculo)

}
