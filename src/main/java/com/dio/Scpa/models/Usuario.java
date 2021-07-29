package com.dio.Scpa.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {

	@Id
	private Long id;
	
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	@ManyToOne
	private Empresa empresa;
	@ManyToOne
	private NivelAcesso nivelAcesso;
	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;
	
	private String nome;
	private BigDecimal tolerancia;
	private LocalDateTime inicioJornada;
	private LocalDateTime finalJornada;

}
