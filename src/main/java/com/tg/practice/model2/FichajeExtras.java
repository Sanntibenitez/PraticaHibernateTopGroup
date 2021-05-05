package com.tg.practice.model2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class FichajeExtras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fichajeextraid")
	private Long id;

	@Column(length = 75)
	private String detalle;

	@Column(length = 20)
	private String usuario;

	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;

	@Enumerated(EnumType.STRING)
	private MotivoFichajeManual motivoFichaje;

	public FichajeExtras() {
	}
}
