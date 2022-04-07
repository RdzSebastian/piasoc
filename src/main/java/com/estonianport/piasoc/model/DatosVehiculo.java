package com.estonianport.piasoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public boolean isParticular() {
		return particular;
	}

	public void setParticular(boolean particular) {
		this.particular = particular;
	}

	public boolean isAlarma() {
		return alarma;
	}

	public void setAlarma(boolean alarma) {
		this.alarma = alarma;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public boolean isHijos() {
		return hijos;
	}

	public void setHijos(boolean hijos) {
		this.hijos = hijos;
	}

	public IntervaloEdad getIntervaloEdad() {
		return intervaloEdad;
	}

	public void setIntervaloEdad(IntervaloEdad intervaloEdad) {
		this.intervaloEdad = intervaloEdad;
	}

	public IntervaloKilometros getIntervaloKilometros() {
		return intervaloKilometros;
	}

	public void setIntervaloKilometros(IntervaloKilometros intervaloKilometros) {
		this.intervaloKilometros = intervaloKilometros;
	}

}
