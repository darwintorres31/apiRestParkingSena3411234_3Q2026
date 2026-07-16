package com.sena.parqueadero.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table(name = "Registros")

public class Registro {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idRegistro;
@Column(nullable = false)
private LocalDateTime fechaHoraIngreso;
private LocalDateTime fechaHoraSalida;
private Double valorPagado;
@Column( nullable = false)
private Boolean activo = true;

@ManyToOne
@JoinColumn(name = "idVehiculo",nullable = false)
private Vehiculo vehiculo;
}
