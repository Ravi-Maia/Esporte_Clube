package com.ravim.esporteClube.utils;

public class NumberCountDigits {
	
	public static long numberOfDigits(long num) {
		long digits=0, count=0;
		for(int i = 0; i < num; i++) {			
			num /= 10;							
			digits = ++count;
		}
		return (digits + 1);
	} 	
}
 