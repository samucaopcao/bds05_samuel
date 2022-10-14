package com.devsuperior.movieflix.resources.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


//Classe responsável por formatar o erro durante o login
public class OAuthCustomError implements Serializable {

	private static final long serialVersionUID = 1L;

	private String error;

	// Anotation para modificar como o campo será visto no response do JSON
	@JsonProperty("error_description")
	private String errorDescription;

	public OAuthCustomError() {
	}

	public OAuthCustomError(String error, String errorDescription) {
		this.error = error;
		this.errorDescription = errorDescription;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

}
