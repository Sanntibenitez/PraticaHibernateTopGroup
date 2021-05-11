package com.tg.practice.model2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class FichajeExtras {

	@Column(length = 75, nullable = false)
	private String detalle;

	@Column(length = 20, nullable = false)
	private String usuario;

	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;

	@Enumerated(EnumType.STRING)
	private MotivoFichajeManual motivoFichaje;

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public MotivoFichajeManual getMotivoFichaje() {
		return motivoFichaje;
	}

	public void setMotivoFichaje(MotivoFichajeManual motivoFichaje) {
		this.motivoFichaje = motivoFichaje;
	}

}
