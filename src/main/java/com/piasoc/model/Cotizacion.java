package com.piasoc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cotizacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "datosVehiculo_id")
	private DatosVehiculo datosVehiculo;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public DatosVehiculo getDatosVehiculo() {
		return datosVehiculo;
	}

	public void setDatosVehiculo(DatosVehiculo datosVehiculo) {
		this.datosVehiculo = datosVehiculo;
	}

}
