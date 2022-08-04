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
public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "tipo_vehiculo_id")
	private TipoVehiculo tipoVehiculo;

	@ManyToOne
	@JoinColumn(name = "marca_id")
	private Marca marca;

	@Column
	private int anio_desde;

	@Column(nullable=true, name="anio_hasta")
	private Integer anio_hasta;

}