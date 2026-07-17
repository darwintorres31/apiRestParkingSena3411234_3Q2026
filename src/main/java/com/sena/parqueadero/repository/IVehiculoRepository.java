package com.sena.parqueadero.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import com.sena.parqueadero.model.Vehiculo;

import jakarta.persistence.LockModeType;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {

	Optional<Vehiculo> findByPlacaOptional(String placa);

	boolean existByPlaca(String placa);

	@Lock(LockModeType.PESSIMISTIC_WRITE)
	@Query("SELECT v FROM vehiculo v WHERE v.placa = : placa")
	Optional<Vehiculo> findByPlacaForUpdate(String placa);

}
