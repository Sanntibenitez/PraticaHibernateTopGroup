package com.tg.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "medidaid")
	private Long id;

	@Column
	private double largo;
	
	@Column
	private Double ancho;
	
	@Column
	private Double altura;
	
	public Medida() {
		// no-args constructor
	}

}
