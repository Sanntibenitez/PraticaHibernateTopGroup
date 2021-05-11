package com.tg.practice.model2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contratado extends Empleado {

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Column(nullable = false)
	private Boolean paseAPlanta;

	@Enumerated(EnumType.STRING)
	private TipoContrato tipoContrato;

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Boolean getPaseAPlanta() {
		return paseAPlanta;
	}

	public void setPaseAPlanta(Boolean paseAPlanta) {
		this.paseAPlanta = paseAPlanta;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}
