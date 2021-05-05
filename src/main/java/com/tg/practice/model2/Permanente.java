package com.tg.practice.model2;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Permanente extends Empleado {

	@Column
	private Integer cantidadHijos;

	@Column
	private Double porcentajeBono;

	public Permanente() {
	}

}
