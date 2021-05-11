package com.tg.practice.model2;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Fichaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date egreso;

	@Temporal(TemporalType.DATE)
	private Date ingreso;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private Empleado empleado;

	@Embedded
	private FichajeExtras extrasFichaje;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private Sucursal sucursalFichaje;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getEgreso() {
		return egreso;
	}

	public void setEgreso(Date egreso) {
		this.egreso = egreso;
	}

	public Date getIngreso() {
		return ingreso;
	}

	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public FichajeExtras getExtrasFichaje() {
		return extrasFichaje;
	}

	public void setExtrasFichaje(FichajeExtras extrasFichaje) {
		this.extrasFichaje = extrasFichaje;
	}

	public Sucursal getSucursalFichaje() {
		return sucursalFichaje;
	}

	public void setSucursalFichaje(Sucursal sucursalFichaje) {
		this.sucursalFichaje = sucursalFichaje;
	}

}
