package com.hush.ravim.esporteClube.beans;

public class Estado {
	
	    private int id;
	    private String nome;
	    private String UF;
	    
	    
	    public Estado(int id, String nome, String UF) {
	        this.id = id;
	        this.nome = nome;
	        this.UF = UF;	        
	    }
	    
	    // Getters
	    public int getId() {
	        return id;
	    }
	    
	    public String getNome() {
	        return nome;
	    }
	    
	    public String getUF() {
	        return UF;
	    }	    
	    
	    // Setters
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    public void setUF(String UF) {
	        this.UF = UF;
	    }

		@Override
		public String toString() {
			return "Estado [id=" + id + ", nome=" + nome + ", UF=" + UF + "]";
		}
	    	
	    
	}


