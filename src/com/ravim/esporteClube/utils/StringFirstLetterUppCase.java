package com.ravim.esporteClube.utils;


public class StringFirstLetterUppCase {
	
	
	public static String firstLettersUppCase(String word) {
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

	public static String toUpperCase(String word) {
 
		return word.toUpperCase();
	}
 
}
