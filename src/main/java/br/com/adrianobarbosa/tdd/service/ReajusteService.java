package br.com.adrianobarbosa.tdd.service;

import java.math.BigDecimal;

import br.com.adrianobarbosa.tdd.modelo.Desempenho;
import br.com.adrianobarbosa.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal reajuste = desempenho.percentualReajuste();
		funcionario.reajustarSalario(reajuste);
	}

}
