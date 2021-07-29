package com.dio.Scpa.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Movimentacao {
	
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class MovimentacaoId implements Serializable {
		private Long idMovimentacao;
		private Long idUsuario;
	}
	
	@Id
	@EmbeddedId
	private MovimentacaoId id;
	
	@ManyToOne
	private Ocorrencia ocorrencia;
	@ManyToOne
	private Calendario calendario;
	
	private LocalDateTime dataEntrada;
	private LocalDateTime dataSaida;
	private BigDecimal periodo;


}
