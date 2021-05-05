package com.tg.practice.model2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Puesto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "puestoid")
	private Long id;

	@Column(length = 50)
	private String nombre;

	@Column(length = 75)
	private String descripcion;

	public Puesto() {
	}
}
