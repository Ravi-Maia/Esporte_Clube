package com.hush.ravim.esporteClube.beans;

import com.hush.ravim.esporteClube.Interface.Pagavel;

public class AtletaProfissional extends Atleta implements Pagavel {

	private char federado;
	private String posicaoAtl;
	private Basquete basquete;
	private Volei volei;
	private double salario;
	private double bonus;

	public AtletaProfissional() {
		// TODO Auto-generated constructor stub
	}

	public AtletaProfissional(String nome, String sobreNome, byte idade, String cPF, double altura, double peso,char federado, double salario, double bonus) {
		super(nome, sobreNome, idade, cPF, altura, peso);
		this.federado = federado;
		this.salario = salario;
		this.bonus = bonus;
		this.setBasquete(basquete);
	}

	//GETTRS
	public char getFederado() {
		return federado;
	}
	public String getPosicaoAtl() {
		return posicaoAtl;
	}
	public Basquete getBasquete() {
		return basquete;
	}
	public Volei getVolei() {
		return volei;
	}
	public double getSalario() {
		return salario;
	}
	public double getBonus() {
		return bonus;
	}
	//SETTRS
	public void setFederado(char federado) {
		this.federado = federado;
	}		
	public void setBasquete(Basquete basquete) {
		this.basquete = basquete;
	}		
	public void setVolei(Volei volei) {
		this.volei = volei;
	}	
	public void setPosicaoAtl(String posicaoAtl) {
		this.posicaoAtl = posicaoAtl;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	//Interface
	@Override
	public void salariado(double sal) {		
		salario = sal;		
	}
	@Override
	public void bonus(double bon) {		
		bonus = bon;
	}

	@Override
	public String toString() {
		return "AtletaProfissional [federado=" + federado + ", posicaoAtl=" + posicaoAtl + ", salario=" + salario + ", bonus=" + bonus + ", getNome()=" + getNome()
		+ ", getSobreNome()=" + getSobreNome() + ", getIdade()=" + getIdade() + ", getCPF()=" + getCPF()
		+ ", getEndereco()=" + getEndereco() + ", getDataNascimento()=" + getDataNascimento() + ", getAltura()="
		+ getAltura() + ", getPeso()=" + getPeso() + "]";
	}













}
