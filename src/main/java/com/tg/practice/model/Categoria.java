package com.tg.practice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
@Entity
public class Categoria extends Familia{
	
	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "familiaid",insertable = false,updatable = false)
	SubFamilia subFamilia;
	
	public Categoria() {
		// no-args constructor
	}
}
