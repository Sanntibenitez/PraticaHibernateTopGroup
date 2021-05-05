package com.tg.practice.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Stock {
	
	@Id
	private Long condigoInterno;
	
	@Id
	private Long token;
	
	//En este caso no me queda claro como armar el Id 
	
	@Column
	private LocalDate fechaStock;
	
	@Column
	private Long cantidad;
	
	@Column(length = 150)
	private String nota;
	
	@OneToOne
	@JoinColumn(name="productoid")
	private Producto producto;
	
	public Stock() {
		// no-args constructor
	}
}
