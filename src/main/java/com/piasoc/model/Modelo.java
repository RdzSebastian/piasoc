package com.piasoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;
	
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

	public int getAnio_desde() {
		return anio_desde;
	}

	public void setAnio_desde(int anio_desde) {
		this.anio_desde = anio_desde;
	}

	public Integer getAnio_hasta() {
		return anio_hasta;
	}

	public void setAnio_hasta(int anio_hasta) {
		this.anio_hasta = anio_hasta;
	}

}
