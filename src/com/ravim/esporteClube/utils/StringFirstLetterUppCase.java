package com.ravim.esporteClube.utils;


public class StringFirstLetterUppCase {

	public String nounStandard(String word) {
		String nomeUL=null;
		String nomeCont[] = word.split("");
		try {			
			nomeUL=nomeCont[0].toUpperCase();		
			for(int i = 1; i < nomeCont.length; i++) {			
				nomeUL += nomeCont[i].substring(1).toLowerCase();
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalido");			
		}				 
		return nomeUL;
	} 

	public String firstLettersUppCase(String word) {
		String palavras[] = word.split(" ");
		String firstWord="", fistWordMod="", compWords="";
		char firstLetterMod, firstLetter; 
		String fistWordModContainer[] = new String[palavras.length];
		for(int i=0; i < palavras.length; i++) {
			firstWord = palavras[i];
			firstLetter = firstWord.charAt(0);
			firstLetterMod = Character.toUpperCase(firstLetter);
			fistWordMod = firstLetterMod + firstWord.substring(1).toLowerCase() + " "; 
			fistWordModContainer[i] = fistWordMod; 
		}
		for(int i=0; i < fistWordModContainer.length; i++) {
			compWords += fistWordModContainer[i]; 
		}
		return compWords.trim();
	}

	public String toUpperCase(String word) {
 
		return word.toUpperCase();
	}



}
