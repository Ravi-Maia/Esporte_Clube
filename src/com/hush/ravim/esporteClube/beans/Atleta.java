package com.hush.ravim.esporteClube.beans;

import java.time.LocalDate;

abstract class Atleta extends PessoaFisica {
	
	
	
	public Atleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Atleta(String nome, byte idade, String cPF, Endereco endereco, LocalDate dataNascimento, double altura,
			double peso) {
		super(nome, idade, cPF, endereco, dataNascimento, altura, peso);
		// TODO Auto-generated constructor stub
	}

	public Atleta(String nome, String sobreNome, byte idade, String cPF, double altura,
			double peso) {
		super(nome, sobreNome, idade, cPF, altura, peso);
		// TODO Auto-generated constructor stub
	}

	
}


