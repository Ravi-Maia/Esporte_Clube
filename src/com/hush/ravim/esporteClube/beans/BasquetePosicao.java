package com.hush.ravim.esporteClube.beans;

public class BasquetePosicao {
		 
	public String basquetePosicaoAtleta(byte num) {
		
		switch(num) { 
		case 1 :
			return "Armardor";
		case 2 :
			return "Ala-armardor";
		case 3 :
			return "Ala";
		case 4 :
			return "Ala-de-forçao";
		case 5 :
			return "Pivô";
			
		}
		return null;
	} 
	
}


