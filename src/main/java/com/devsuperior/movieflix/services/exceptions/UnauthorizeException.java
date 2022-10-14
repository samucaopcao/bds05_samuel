package com.devsuperior.movieflix.services.exceptions;

// 	Classe feita para retornar o erro 401 
//	Quanto tento acessar algum recurso com token inválido
// 	então daremos o erro 401
public class UnauthorizeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UnauthorizeException(String msg) {
		super(msg);
	}
}
