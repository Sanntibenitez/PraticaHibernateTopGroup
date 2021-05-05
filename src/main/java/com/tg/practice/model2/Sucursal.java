package com.tg.practice.model2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sucursal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sucursalid")
	private Long id;

	@Column(length = 50)
	private String nomenclador;

	@Column
	private Boolean central;

	@Column(length = 100)
	private String descripcion;

	@Column(length = 100)
	private String direccion;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "empleadoshab_sucursaleshab", joinColumns = @JoinColumn(name = "empleadoid"), inverseJoinColumns = @JoinColumn(name = "sucursalid"))
	private Set<Empleado> empleados;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "localidadid")
	private Localidad localidad;

	@OneToMany(mappedBy = "sucursalFichaje")
	private Set<Fichaje> fichajesSucursal;

	public Sucursal() {
	}
}
