package com.hush.ravim.esporteClube.Excecoes;

public class Excecoes extends Exception {

	private static final long serialVersionUID = 1L;

	public Excecoes (String mensagem, Exception e) {
		super(mensagem, e);
		this.print();
		e.printStackTrace();		
	}

	public void print() { 
		System.out.println("Tratando Erro");
		System.out.println(getMessage());
		System.out.println("printStackTrace: ");
	}

}
