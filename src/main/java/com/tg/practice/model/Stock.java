package com.tg.practice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(value = StockPK.class)
public class Stock {

	@EmbeddedId
	private StockPK id;

	@Temporal(TemporalType.DATE)
	private Date fechaStock;

	@Column(nullable = false)
	private Long cantidad;

	@Column(length = 150)
	private String nota;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto")
	private Producto producto;

	public Date getFechaStock() {
		return fechaStock;
	}

	public void setFechaStock(Date fechaStock) {
		this.fechaStock = fechaStock;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
