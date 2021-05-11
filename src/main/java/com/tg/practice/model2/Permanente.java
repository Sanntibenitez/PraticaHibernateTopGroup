package com.tg.practice.model2;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Permanente extends Empleado {

	@Column
	private Integer cantidadHijos;

	@Column(nullable = false)
	private Double porcentajeBono;

	public Integer getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(Integer cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public Double getPorcentajeBono() {
		return porcentajeBono;
	}

	public void setPorcentajeBono(Double porcentajeBono) {
		this.porcentajeBono = porcentajeBono;
	}

}
