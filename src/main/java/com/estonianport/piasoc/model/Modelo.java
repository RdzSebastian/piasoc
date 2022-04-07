package com.estonianport.piasoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getAnio_desde() {
		return anio_desde;
	}

	public void setAnio_desde(int anio_desde) {
		this.anio_desde = anio_desde;
	}

	public Integer getAnio_hasta() {
		return anio_hasta;
	}

	public void setAnio_hasta(Integer anio_hasta) {
		this.anio_hasta = anio_hasta;
	}

}