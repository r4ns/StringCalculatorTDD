
public class StringCalculator {
	
	String numbersStr;
	public StringCalculator(String numbersStr){
		this.numbersStr = numbersStr;
	}
	
	
	
	public int add(String numbersStr) {
		
		String[] unos;
		int[] unosInt = null;
		int rezultat = 0;
		unos = numbersStr.split(",");
		for(int i = 0; i<unos.length; i++){
			rezultat += Integer.parseInt(unos[i]);
			//unosInt[i] = Integer.parseInt(unos[i]);
			
		}
				
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return rezultat;
	}
	
	
	public int substract(String numbersStr) {
		
		String[] unos;
		int[] unosInt = null;
		int rezultat = 0;
		unos = numbersStr.split(",");
		for(int i = 0; i<unos.length; i++){
			rezultat = Integer.parseInt(unos[0]);
			rezultat -= Integer.parseInt(unos[i]);
			//unosInt[i] = Integer.parseInt(unos[i]);
			
		}
				
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return rezultat;
	}
	

	public int multiply(String numbersStr) {
		
		String[] unos;
		int[] unosInt = null;
		int rezultat = 1;
		unos = numbersStr.split(",");
		for(int i = 0; i<unos.length; i++){
			rezultat *= Integer.parseInt(unos[i]);
			//unosInt[i] = Integer.parseInt(unos[i]);
			
		}
				
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return rezultat;
	}
	
}
