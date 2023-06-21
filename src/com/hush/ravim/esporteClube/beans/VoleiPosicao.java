package com.hush.ravim.esporteClube.beans;

public class VoleiPosicao {

public String voleiPosicaoAtleta(byte num) {
		
		switch(num) { 
		case 1 :
			return "Levantador";
		case 2 :
			return "Oposto";
		case 3 :
			return "Ponteiro";
		case 4 :
			return "Central";
		case 5 :
			return "Libero";
			
		}
		return null;
	} 
	
}
