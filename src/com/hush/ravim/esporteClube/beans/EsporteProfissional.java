package com.hush.ravim.esporteClube.beans;

import java.time.LocalDate;

public class EsporteProfissional extends Esporte {
		
		private String posicao;
	    private String estadio;
	    private String tecnicoPrincipal;
	    private String liga;
	    private String site;
	    private String apelido;
	    private String federacaoMaisAlta;		

	    //Inheritance
		public EsporteProfissional(String nome, byte jogadoresPorEquipe, String tipo, String equipamento, String local,
				LocalDate fundacao, String posicao, String estadio, String tecnicoPrincipal, String liga, String site,
				String apelido, String federacaoMaisAlta) {
			super(nome, jogadoresPorEquipe, tipo, equipamento, local, fundacao);
			this.posicao = posicao;
			this.estadio = estadio;
			this.tecnicoPrincipal = tecnicoPrincipal;
			this.liga = liga;
			this.site = site;
			this.apelido = apelido;
			this.federacaoMaisAlta = federacaoMaisAlta;
		}
		
		//Inheritance - From second constructor (Overloading)
		public EsporteProfissional(String tipo, String equipamento, String local,
				LocalDate fundacao, String posicao, String estadio, String tecnicoPrincipal, String liga, String site,
				String apelido, String federacaoMaisAlta) {
			super(tipo, equipamento, local, fundacao);
			this.posicao = posicao;
			this.estadio = estadio;
			this.tecnicoPrincipal = tecnicoPrincipal;
			this.liga = liga;
			this.site = site;
			this.apelido = apelido;
			this.federacaoMaisAlta = federacaoMaisAlta;
		}
		
		//Able to do it, because of empty constructor in parent
		public EsporteProfissional(String posicao, String estadio, String tecnicoPrincipal, String liga, String site,
				String apelido, String federacaoMaisAlta) {
			super();
			this.posicao = posicao;
			this.estadio = estadio;
			this.tecnicoPrincipal = tecnicoPrincipal;
			this.liga = liga;
			this.site = site;
			this.apelido = apelido;
			this.federacaoMaisAlta = federacaoMaisAlta;
		}

		public String getEstadio() {
	        return estadio;
	    }

	    public void setEstadio(String estadio) {
	        this.estadio = estadio;
	    }

	    public String getTecnicoPrincipal() {
	        return tecnicoPrincipal;
	    }

	    public void setTecnicoPrincipal(String tecnicoPrincipal) {
	        this.tecnicoPrincipal = tecnicoPrincipal;
	    }

	    public String getLiga() {
	        return liga;
	    }

	    public void setLiga(String liga) {
	        this.liga = liga;
	    }

	    public String getSite() {
	        return site;
	    }

	    public void setSite(String site) {
	        this.site = site;
	    }

	    public String getApelido() {
	        return apelido;
	    }

	    public void setApelido(String apelido) {
	        this.apelido = apelido;
	    }

		public String getFederacaoMaisAlta() {
			return federacaoMaisAlta;
		}

		public void setFederacaoMaisAlta(String federacaoMaisAlta) {
			this.federacaoMaisAlta = federacaoMaisAlta;
		}

		public String getPosicao() {
			return posicao;
		}

		public void setPosicao(String posicao) {
			this.posicao = posicao;
		}
		
		
	}



