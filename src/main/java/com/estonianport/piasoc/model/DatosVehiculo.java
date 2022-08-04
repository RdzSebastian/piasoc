package com.estonianport.piasoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DatosVehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "modelo_id")
	private Modelo modelo;

	@Column
	private boolean particular;

	@Column
	private boolean alarma;

	@Column
	private boolean garage;

	@Column
	private boolean hijos;

	@ManyToOne
	@JoinColumn(name = "intervalo_edad")
	private IntervaloEdad intervaloEdad;

	@ManyToOne
	@JoinColumn(name = "intervalo_kilometros")
	private IntervaloKilometros intervaloKilometros;

}
