package com.hush.ravim.esporteClube.DAO;

import java.util.ArrayList;
import java.util.List;

import com.hush.ravim.esporteClube.beans.AtletaProfissional;

public class Crud {
	
	List<AtletaProfissional> aP = new ArrayList<AtletaProfissional>();
	
	public String AtletaProfCrud(AtletaProfissional atpc) {
		aP.add(atpc);
		
		for(AtletaProfissional a : aP) {
			System.out.println(a);
		}
		
		return "gravado";
		
		
	}

	
	
	
	
}
