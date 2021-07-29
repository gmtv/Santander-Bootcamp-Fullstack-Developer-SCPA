package com.dio.Scpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.Scpa.models.JornadaTrabalho;
import com.dio.Scpa.repositories.JornadaTrabalhoRepository;

@Service
public class CalendarioService {
	
	
	JornadaTrabalhoRepository jornadaTrabalhoRepository;
	
	@Autowired
	public CalendarioService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
		this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
	}
	
	public JornadaTrabalho saveJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoRepository.save(jornadaTrabalho);
	}

}
