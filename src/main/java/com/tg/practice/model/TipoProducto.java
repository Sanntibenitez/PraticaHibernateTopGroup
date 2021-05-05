package com.tg.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoProducto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tipoProductoId")
	private Long id;
	
	@Column(length = 150)
	private String descripcion;
	
	public TipoProducto() {
		
	}
}
