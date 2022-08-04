package com.estonianport.piasoc.model;

import java.time.LocalDate;

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
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nombre;

	@Column
	private String apellido;

	@ManyToOne
	@JoinColumn(name = "sexo_id")
	private Sexo sexo;

	@Column
	private Long cuil;
	
	@Column(name = "fecha_nacimiento")
	private LocalDate fechaNacimiento;

	@Column
	private String empresa;

	@Column
	private String ciudad;

	@Column
	private String provincia;

	@Column
	private int codigoPostal;

	@Column
	private String email;

	@Column
	private int celular;

	@Column
	private String comentarios;

}
