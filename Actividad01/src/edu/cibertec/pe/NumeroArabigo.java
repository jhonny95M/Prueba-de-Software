package edu.cibertec.pe;

import java.util.LinkedHashMap;

public class NumeroArabigo {

	static LinkedHashMap<String, Integer>NumerosRomanos=new LinkedHashMap<String, Integer>();
	public NumeroArabigo() 
	{
		NumerosRomanos.put("M", 1000);
		NumerosRomanos.put("CM", 900);
		NumerosRomanos.put("D", 500);
		NumerosRomanos.put("CD", 400);
		NumerosRomanos.put("C", 100);
		NumerosRomanos.put("XC", 90);
		NumerosRomanos.put("L", 50);
		NumerosRomanos.put("XL", 40);
	    NumerosRomanos.put("X", 10);
	    NumerosRomanos.put("IX", 9);
	    NumerosRomanos.put("V", 5);
	    NumerosRomanos.put("IV", 4);
	    NumerosRomanos.put("I", 1);
	}
	public String convertirANumeroRomano(int numero) {		
		StringBuilder result=new StringBuilder();		
		for (String i : NumerosRomanos.keySet()) {
	        while (numero >= NumerosRomanos.get(i)) {
	            result.append(i);
	            numero -= NumerosRomanos.get(i);
	        }
	    }
		return result.toString();
	}

}
