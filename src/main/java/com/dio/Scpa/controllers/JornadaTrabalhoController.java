package com.dio.Scpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.Scpa.models.JornadaTrabalho;
import com.dio.Scpa.services.JornadaTrabalhoService;

@RestController
@RequestMapping("/jornadaTrabalho")
public class JornadaTrabalhoController {

	@Autowired
	private JornadaTrabalhoService jornadaTrabalhoService;
	
	@PostMapping
	public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoService.saveJornadaTrabalho(jornadaTrabalho);
	}
	
	@GetMapping
	public List<JornadaTrabalho> getAllJornadaTrabalho(){
		return jornadaTrabalhoService.findAll();
	}
	
	@GetMapping("/{idJornadaTrabalho}")
	public ResponseEntity<JornadaTrabalho> getJornadaTrabalhoById(@PathVariable Long idJornadaTrabalho){
		JornadaTrabalho jornadaTrabalho = jornadaTrabalhoService.findById(idJornadaTrabalho);
		return ResponseEntity.ok().body(jornadaTrabalho);
	}
	
	@PutMapping
	public JornadaTrabalho updateJornadaTrabalho(@RequestBody JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoService.updateJornadaTrabalho(jornadaTrabalho);
	}
	
	@DeleteMapping("/{idJornadaTrabalho}")
	public void deleteJornadaTrabalhoById(@PathVariable Long idJornadaTrabalho){
		jornadaTrabalhoService.deleteById(idJornadaTrabalho);
	}
	
}
