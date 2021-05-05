package com.tg.practice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Stock {

	@Id
	private Long condigoInterno;

	@Id
	private Long token;

	// En este caso no me queda claro como armar el Id

	@Temporal(TemporalType.DATE)
	private Date fechaStock;

	@Column
	private Long cantidad;

	@Column(length = 150)
	private String nota;

	@OneToOne
	@JoinColumn(name = "productoid")
	private Producto producto;

	public Stock() {
		// no-args constructor
	}
}
