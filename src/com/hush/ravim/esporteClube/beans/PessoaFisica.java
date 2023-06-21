package com.hush.ravim.esporteClube.beans;
import java.time.LocalDate;

abstract class PessoaFisica  {
	
	    private String nome;
	    private String sobreNome;
	    private byte idade;
	    private String cpf;
	    private Endereco endereco;
	    private LocalDate dataNascimento;
	    private double altura;
	    private double peso;
	 
	    
	    public PessoaFisica() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		public PessoaFisica(String nome, byte idade, String cPF, Endereco endereco, LocalDate dataNascimento, double altura,
				double peso) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.cpf = cPF;
			this.endereco = endereco;
			this.dataNascimento = dataNascimento;
			this.altura = altura;
			this.peso = peso;
		}
		
		public PessoaFisica(String nome, String sobreNome, byte idade, String cpf, double altura,
				double peso) {
			super();
			this.nome = nome;
			this.sobreNome = sobreNome;
			this.idade = idade;
			this.cpf = cpf;						
			this.altura = altura;
			this.peso = peso;
			
		}
		
		// Getters
	    public String getNome() {
	        return nome;
	    }
	    public String getSobreNome() {
			return sobreNome;
		}
	    
	    public byte getIdade() {
	        return idade;
	    }
	    
	    public String getCPF() {
	        return cpf;
	    }
	    
	    public Endereco getEndereco() {
	        return endereco;
	    }
	    
	    public LocalDate getDataNascimento() {
	        return dataNascimento;
	    }
	    
	    public double getAltura() {
	        return altura;
	    }
	    
	    public double getPeso() {
	        return peso;
	    }
	    
	    // Setters
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    public void setIdade(byte idade) {
	        this.idade = idade;
	    }
	    
	    public void setCPF(String CPF) {
	        this.cpf = CPF;
	    }
	    
	    public void setEndereco(Endereco endereco) {
	        this.endereco = endereco;
	    }
	    
	    public void setDataNascimento(LocalDate dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }
	    
	    public void setAltura(double altura) {
	        this.altura = altura;
	    }
	    
	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}

		
		
		
		
	}

	

