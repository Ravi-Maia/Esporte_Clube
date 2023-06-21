package com.hush.ravim.esporteClube.beans;

public class Cidade {

	    private int id;
	    private String nome;
	    private String UF;
	    private Estado estado;
	    
	    public Cidade(int id, String nome, String UF) {
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
	    
	    public Estado getEstado() {
	        return estado;
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
	    
	    public void setEstado(Estado estado) {
	        this.estado = estado;
	    }

		@Override
		public String toString() {
			return "Cidade [id=" + id + ", nome=" + nome + ", UF=" + UF + ", estado=" + estado + "]";
		}
	    
	    
}

