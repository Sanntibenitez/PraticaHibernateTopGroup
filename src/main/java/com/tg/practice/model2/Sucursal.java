package com.tg.practice.model2;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Sucursal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50, nullable = false)
	private String nomenclador;

	@Column(nullable = false)
	private Boolean central;

	@Column(length = 100, nullable = false)
	private String descripcion;

	@Column(length = 100, nullable = false)
	private String direccion;

	@ManyToMany(mappedBy = "sucursalesHabilitadas")
	private Set<Empleado> empleados;

	@ManyToOne(fetch = FetchType.LAZY)
	private Localidad localidad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomenclador() {
		return nomenclador;
	}

	public void setNomenclador(String nomenclador) {
		this.nomenclador = nomenclador;
	}

	public Boolean getCentral() {
		return central;
	}

	public void setCentral(Boolean central) {
		this.central = central;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Set<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

}
