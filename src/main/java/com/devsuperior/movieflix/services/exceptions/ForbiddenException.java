package com.devsuperior.movieflix.services.exceptions;

//	Classe feita para retornar o erro 403 
// 	Quando o usuário esta logado com token válido mas por algum
// 	motivo de regra de negógio ele não pode acessar o recurso daremos o erro 403
public class ForbiddenException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ForbiddenException(String msg) {
		super(msg);
	}
}
