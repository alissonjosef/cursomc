package com.alissonsilva.cursomc.domain;

import javax.persistence.Entity;

import com.alissonsilva.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento{
	
	private static final long serialVersionUID = 1L;

	private Integer NumeroDeParcela;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer NumeroDeParcela) {
		super(id, estado, pedido);
		this.NumeroDeParcela = NumeroDeParcela;
	}

	public Integer getNumeroDeParcela() {
		return NumeroDeParcela;
	}

	public void setNumeroDeParcela(Integer numeroDeParcela) {
		NumeroDeParcela = numeroDeParcela;
	}
}
