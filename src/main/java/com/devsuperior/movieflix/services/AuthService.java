package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.UserRepository;
import com.devsuperior.movieflix.services.exceptions.ForbiddenException;
import com.devsuperior.movieflix.services.exceptions.UnauthorizeException;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;

	// Método para retornar usuário logado
	@Transactional(readOnly = true)
	public User authenticated() {

		try {
			// Pega o nome do usuário
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);

		} catch (Exception e) {
			throw new UnauthorizeException("Invalid User");
		}

	}

	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) {// nao for admin)
			throw new ForbiddenException("Acess denied");
		}
	}
}
