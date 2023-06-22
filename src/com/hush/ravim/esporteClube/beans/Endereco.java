package com.hush.ravim.esporteClube.beans;

public class Endereco {

		private int id;
	    private String logradouro;
	    private int numero;
	    private Cidade cidade;	    	    
	    
	    public Endereco() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Endereco(int id, String logradouro, int numero) {
	        this.id = id;
	    	this.logradouro = logradouro;
	        this.numero = numero;	        
	    }
	    
	    // Getters
	    public String getLogradouro() {
	        return logradouro;
	    }
	    
	    public int getNumero() {
	        return numero;
	    }
	    
	    public Cidade getCidade() {
	        return cidade;
	    }
	    
	    // Setters
	    public void setLogradouro(String logradouro) {
	        this.logradouro = logradouro;
	    }
	    
	    public void setNumero(int numero) {
	        this.numero = numero;
	    }
	    
	    public void setCidade(Cidade cidade) {
	        this.cidade = cidade;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Endereco [id=" + id + ", logradouro=" + logradouro + ", numero=" + numero + ", cidade=" + cidade
					+ "]";
		}		
		
	}

	

