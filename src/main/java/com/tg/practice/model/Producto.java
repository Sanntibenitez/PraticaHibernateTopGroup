package com.tg.practice.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productoid")
	private Long id;
	
	@Column(length=150)
	private String codigo;
	
	@Column(length=150)
	private String descripcion;
	
	@Column
	private Short productosPorPaquete;
	
	@Column
	private Boolean inferior;
	
	@OneToOne
	@JoinColumn(name="familiaid")
	private Medida medida;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="tipodeproductoid")
	private TipoProducto tipoProducto;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="familiaid")
	private Familia familia;
	
	public Producto() {
		// no-args constructor
	}
	
}
