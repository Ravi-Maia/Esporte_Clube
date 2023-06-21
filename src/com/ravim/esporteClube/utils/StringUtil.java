package com.ravim.esporteClube.utils;


public class StringUtil {
	
	public String nounStandard(String word) {
		String nomeUL=null;
		String nomeCont[] = word.split("");
		try {			
			nomeUL=nomeCont[0].toUpperCase();		
			for(int i = 1; i < nomeCont.length; i++) {			
				nomeUL += nomeCont[i].toLowerCase();
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalido");			
		}				 
		return nomeUL;
	}
	
}
