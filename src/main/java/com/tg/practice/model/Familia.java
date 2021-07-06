package com.tg.practice.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@DiscriminatorColumn(name = "tipo")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Familia {

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 150)
	private String clave;

	@Column(length = 150)
	private String descripcion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract Boolean isSubFamilia();
	
	public abstract Boolean isCategoria();

}
