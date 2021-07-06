package com.tg.practice.model;

import java.io.Serializable;

public class StockPK implements Serializable {

	private static final long serialVersionUID = -121412124512512412L;

	private Long codigoInterno;

	private String token;

	public Long getCodigoInterno() {
		return codigoInterno;
	}

	public void setCodigoInterno(Long codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
