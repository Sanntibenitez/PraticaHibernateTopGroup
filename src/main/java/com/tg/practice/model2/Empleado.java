package com.tg.practice.model2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empleadoid")
	private Long id;

	@Column(length = 50)
	private String apellido;

	@Column(length = 50)
	private String nombre;

	@Column
	private LocalDate fechaNacimiento;

	@Column
	private Integer nLegajo;

	@Column
	private Integer dni;

	@Column(length = 20)
	private Integer cuil;

	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;

	@Column(length = 50)
	private String mail;

	@Column
	private Double sueldo;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "puestoid")
	private Puesto puesto;

	@ManyToMany(mappedBy = "empleadosHabilitados")
	private Set<Sucursal> sucursalesHabilitadas;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "sucursalid")
	private Sucursal sucursalPrincipal;

	public Empleado() {
	}
}
