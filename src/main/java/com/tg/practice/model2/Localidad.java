package com.tg.practice.model2;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Localidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private Long codigoPostal;

	@Column(length = 30)
	private String nombre;

	@OneToMany(mappedBy = "localidad")
	Set<Sucursal> sucursales;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Long codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(Set<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

}
