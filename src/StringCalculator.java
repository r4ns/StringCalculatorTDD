import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		
		int rezultat = 0;
		
		if (numbersStr == "") {
			throw new StringCalculatorException("Dati input nije validan");	
			
		} else if (numbersStr.contains("-")) {
			throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojevima");
			
		} 
		
		String[] brojevi = numbersStr.split(",|\\\n");
		
		for (int i=0; i < brojevi.length; i++) {
			rezultat = rezultat + Integer.parseInt(brojevi[i]);
		}
		
		if (rezultat == Integer.parseInt(brojevi[0])) {
			throw new StringCalculatorException("Dati input nije validan");
		}
		
		return rezultat;
	}
	
	public int substract(String numbersStr) throws StringCalculatorException {
		 
		int rezultat = 0;
		
		if (numbersStr == "") {
			throw new StringCalculatorException("Dati input nije validan");	
			
		} else if (numbersStr.contains("-")) {
			throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojevima");
			
		} 
		
		String[] brojevi = numbersStr.split(",|\\\n");
		
		for (int i=0; i < brojevi.length; i++) {
			if (i == 0) {
				rezultat = Integer.parseInt(brojevi[i]);				
			} else {
				rezultat = rezultat - Integer.parseInt(brojevi[i]);
			}
		}
		
		if (rezultat == Integer.parseInt(brojevi[0])) {
			throw new StringCalculatorException("Dati input nije validan");
		}
		
		return rezultat;
	}
	
	public int multiply(String numbersStr) throws StringCalculatorException {
		
		int rezultat = 1;
		
		if (numbersStr == "") {
			throw new StringCalculatorException("Dati input nije validan");	
			
		} else if (numbersStr.contains("-")) {
			throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojevima");
			
		} 
		
		String[] brojevi = numbersStr.split(",|\\\n");
		
		for (int i=0; i < brojevi.length; i++) {
			rezultat = rezultat * Integer.parseInt(brojevi[i]);
		}
		
		if (rezultat == Integer.parseInt(brojevi[0])) {
			throw new StringCalculatorException("Dati input nije validan");
		}		
		
		return rezultat;
	}
	
	public float divide(String numbersStr) throws StringCalculatorException {
		 
		float rezultat = 0;
		
		if (numbersStr == "") {
			throw new StringCalculatorException("Dati input nije validan");	
			
		} else if (numbersStr.contains("-")) {
			throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojevima");
			
		} 
		
		String[] brojevi = numbersStr.split(",|\\\n");
		
		for (int i=0; i < brojevi.length; i++) {
			if (i == 0) {
				rezultat = Float.parseFloat(brojevi[i]);				
			} else {
				rezultat = rezultat / Float.parseFloat(brojevi[i]);
			}
		}
		
		if (rezultat == Float.parseFloat(brojevi[0])) {
			throw new StringCalculatorException("Dati input nije validan");
		}
		
		return rezultat;
	}
	
	public StringCalculator() {
	
	}
	
	
	

}
