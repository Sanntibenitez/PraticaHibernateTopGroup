package com.tg.practice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Pedido implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pedidoid")
	private Long id;
	
	@Column
	private Long nroGuia;
	
	@Column
	private Long cantidad;
	
	@Temporal(TemporalType.DATE)
	private Date fechaEntrega;
	
	@Enumerated(EnumType.STRING)
	private EstadoPedido estadoPedido;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="productoid")
	private Producto producto;
	
	public Pedido() {
		// no-args constructor
	}
}
