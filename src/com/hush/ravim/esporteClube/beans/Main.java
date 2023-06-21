package com.hush.ravim.esporteClube.beans;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hush.ravim.esporteClube.DAO.Crud;
import com.ravim.esporteClube.utils.NumberUtil;
import com.ravim.esporteClube.utils.StringUtil;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String nome = null, cpf=null, sobreNome=null, dataNascimento=null, numeroDeAtletas=null,idade=null, altura=null, 
		peso=null, salario=null, bonus=null;
		double alturaNum=0, pesoNum=0, salarioNum=0, bonusNum=0;
		char federado = 0;		
		int numeroDeAtletasNum = 0;
		byte idadeNum=0; 			
		String regex = "-?\\d+(\\.\\d+)?";
		Pattern pattern = Pattern.compile(regex);
		StringUtil strUtl = new StringUtil();	
		NumberUtil numUtl = new NumberUtil();
		Crud crud = new Crud();
		
		System.out.println("Quantos atletas você gostaria de adicionar no sistema?");
		numeroDeAtletas = sc.next();
		
		for(int i =0; i < Integer.parseInt(numeroDeAtletas); i++) {
			try {
				do { 
					numeroDeAtletasNum = Integer.parseInt(numeroDeAtletas);
				} while (numeroDeAtletasNum <= 0);
			} catch (InputMismatchException nfe) {
				System.out.println("Por favor, insira um número");
			} 		
			
			System.out.println("Nome do atleta"); 
			nome = sc.next();		
			Matcher matcher = pattern.matcher(nome);
			if(matcher.find()) {
				System.out.println("Dado incorreto");
				throw new Exception();
			}							
			String nomeUL =  strUtl.nounStandard(nome);	
			   
			System.out.println("Sobrenome do atleta");		
			sobreNome = sc.next();
			String sobreNomeUL =  strUtl.nounStandard(sobreNome);
			 
			System.out.println("Idade do atleta");
			idade = sc.next();
			try {
				idadeNum = Byte.parseByte(idade);
			} catch (InputMismatchException e) {
				
			}
			
			System.out.println("CPF do atleta");
			cpf = sc.next();		 
			try {
				long cpfNum = Long.parseLong(cpf);			
				long cpfR = numUtl.numberOfDigits(cpfNum); 
				System.out.println(cpfR);
				while(cpfR != 12) {
					System.out.println("Número incorreto CPF - total 12 digitos");
					cpf = sc.next(); 
				}
			} catch (InputMismatchException e) {
				e.getMessage();
			}
			/*
			System.out.println("CPF do atleta");
			cpf = sc.next();
			System.out.println(cpf.length());
			while(cpf.length() <= 0 && cpf.length() > 12) {
				System.out.println("Número incorreto CPF");
				cpf = sc.next();
			}*/
			
			System.out.println("Altura do atleta");
			altura = sc.next();
			try {
				alturaNum = Double.parseDouble(altura);
			} catch (InputMismatchException e) {
				
			}
			
			System.out.println("Peso do atleta");
			peso = sc.next();
			try {
				pesoNum = Double.parseDouble(peso);
			} catch (InputMismatchException e) {
				
			}				
			System.out.println("Atleta é federado? [S][N]");
			federado = sc.next().charAt(0);
			while(federado != 'S' && federado != 'N') {
				System.out.println("Escolha [S] ou [N]");
				federado = sc.next().charAt(0);
			}
			
			System.out.println("Salario do atleta");
			salario = sc.next();
			try {
				salarioNum = Double.parseDouble(salario);
			} catch (InputMismatchException e) {
				
			} 
			AtletaProfissional atp1 = new AtletaProfissional(nomeUL, sobreNomeUL, idadeNum, cpf, alturaNum, pesoNum, federado, salarioNum, bonusNum);
			
			System.out.println("Data de nascimento do atleta - EX: 1999-12-12");
			dataNascimento = sc.next();
			sc.nextLine();
			
			atp1.setDataNascimento(LocalDate.parse(dataNascimento));		
			
			String logradouro=null, cidade=null, uf=null, estado=null, numero=null;
			byte numeroNum=0;
			System.out.println("Endereço: ");
			logradouro = sc.nextLine();
			
			System.out.print("Número: ");
			numero = sc.next();	
			try {
				numeroNum = Byte.parseByte(numero);
			} catch (InputMismatchException en) {
				 
			}
			
			Endereco end1 = new Endereco(1, logradouro, numeroNum);
			
			System.out.println("Cidade");
			cidade = sc.next();
			System.out.println("UF");
			uf = sc.next();
			Cidade cidade1 = new Cidade(1, cidade, uf);
			
			atp1.setEndereco(end1);
			end1.setCidade(cidade1);
					
			System.out.println("Estado");//Not consuming full line
			estado = sc.nextLine();
			//sc.next();
			Estado estado1 = new Estado(1, estado, uf);		
			cidade1.setEstado(estado1); 
			
			System.out.println("Escolha o esporte: [1=Basquete], [2=Volei]");
			
			byte escolhaEsporte=sc.nextByte();
			switch(escolhaEsporte) { 
			case 1 :
				System.out.println("Posição do Atleta: [1=Armardor, 2=Ala-armardor, 3=Ala, 4=Ala-de-forçao, 5=Pivô]");
				BasquetePosicao basqPos = new BasquetePosicao();
				byte posicaoN = sc.nextByte();
				atp1.setPosicaoAtl(basqPos.basquetePosicaoAtleta(posicaoN));
				break;
			case 2 : 
				System.out.println("Posição do Atleta: [1=Levantador, 2=Oposto, 3=Ponteiro, 4=Central, 5=Líbero]");
				VoleiPosicao voleiPos = new VoleiPosicao();
				byte posicaoV = sc.nextByte();
				atp1.setPosicaoAtl(voleiPos.voleiPosicaoAtleta(posicaoV));
			}			 
			System.out.println(crud.AtletaProfCrud(atp1));
		}//for numeroDeAtletas
		sc.close();
	}
}
