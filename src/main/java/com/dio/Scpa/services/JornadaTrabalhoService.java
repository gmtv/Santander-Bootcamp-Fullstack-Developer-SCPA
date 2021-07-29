package com.dio.Scpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.Scpa.models.JornadaTrabalho;
import com.dio.Scpa.repositories.JornadaTrabalhoRepository;

@Service
public class JornadaTrabalhoService {
	
	
	JornadaTrabalhoRepository jornadaTrabalhoRepository;
	
	@Autowired
	public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
		this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
	}
	
	public JornadaTrabalho saveJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoRepository.save(jornadaTrabalho);
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaTrabalhoRepository.findAll();
	}

	public JornadaTrabalho findById(Long idJornadaTrabalho) {
		return jornadaTrabalhoRepository.findById(idJornadaTrabalho).get();
	}

	public void deleteById(Long idJornadaTrabalho) {
		jornadaTrabalhoRepository.deleteById(idJornadaTrabalho);
	}

	public JornadaTrabalho updateJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoRepository.save(jornadaTrabalho);
	}

}
