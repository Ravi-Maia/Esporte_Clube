package com.hush.ravim.esporteClube.beans;

import java.time.LocalDate;


abstract class Esporte {

	private String nome;	    
	private byte jogadoresPorEquipe;
	private String tipo;
	private String equipamento;
	private String local;
	private LocalDate fundacao;

	public Esporte() {
		// TODO Auto-generated constructor stub
	}

	public Esporte(String nome, byte jogadoresPorEquipe, String tipo,
			String equipamento, String local, LocalDate fundacao) {
		this.nome = nome;

		this.jogadoresPorEquipe = jogadoresPorEquipe;
		this.tipo = tipo;
		this.equipamento = equipamento;
		this.local = local;
		this.fundacao = fundacao;
	}

	public Esporte(String tipo, String equipamento, String local, LocalDate fundacao) {			

		this.tipo = tipo;
		this.equipamento = equipamento;
		this.local = local;
		this.fundacao = fundacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public byte getJogadoresPorEquipe() {
		return jogadoresPorEquipe;
	}

	public void setJogadoresPorEquipe(byte jogadoresPorEquipe) {
		this.jogadoresPorEquipe = jogadoresPorEquipe;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public LocalDate getFundacao() {
		return fundacao;
	}

	public void setFundacao(LocalDate fundacao) {
		this.fundacao = fundacao;
	}
}

