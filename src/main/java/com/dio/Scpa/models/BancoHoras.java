package com.dio.Scpa.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

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
public class BancoHoras {
	
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class BancoHorasId implements Serializable {
		private Long idBancoHoras;
		private Long idMovimentacao;
		private Long idUsuario;
	}

	@Id
	@EmbeddedId
	private BancoHorasId id;
	
	private LocalDateTime dataTrabalhada;
	private BigDecimal quantidadeHoras;
	private BigDecimal saldoHoras;

}
