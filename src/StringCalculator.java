
public class StringCalculator {
	int rezultat;
	double rezultat2 = 1;
	
	public StringCalculator(){
		rezultat = 0;
	}
	
	public int add(String numbersStr) throws StringCalculatorException {
		char[] charArray = numbersStr.toCharArray();
		
		for(int i = 0; i < charArray.length; i++){
			if((charArray[i] == ',' || charArray[i]== '\n') && (charArray[i+1] == ',' || charArray[i+1]== '\n'))
				throw new StringCalculatorException("Pogresan zapis");
			if(charArray[i] != ',' && charArray[i] != '\n')
				rezultat += Integer.parseInt(String.valueOf(charArray[i]));
		}
		return rezultat;
	}
	
	public int sub(String numbersStr) throws StringCalculatorException {
		char[] charArray = numbersStr.toCharArray();
		
		for(int i = 0; i < charArray.length; i++){
			if((charArray[i] == ',' || charArray[i]== '\n') && (charArray[i+1] == ',' || charArray[i+1]== '\n'))
				throw new StringCalculatorException("Pogresan zapis");
			if(charArray[i] != ',' && charArray[i] != '\n')
				rezultat -= Integer.parseInt(String.valueOf(charArray[i]));
		}
		return rezultat;
	}
	
	public double mul(String numbersStr) throws StringCalculatorException {
		char[] charArray = numbersStr.toCharArray();
		
		rezultat = 1;
		
		for(int i = 0; i < charArray.length; i++){
			if((charArray[i] == ',' || charArray[i]== '\n') && (charArray[i+1] == ',' || charArray[i+1]== '\n'))
				throw new StringCalculatorException("Pogresan zapis");
			if(charArray[i] != ',' && charArray[i] != '\n')
				rezultat *= Integer.parseInt(String.valueOf(charArray[i]));
		}
		return rezultat;
	}
	
	public double div(String numbersStr) throws StringCalculatorException {
		
		if(numbersStr == ""){
			rezultat = 1;
			return 1;
		}
		
		char[] charArray = numbersStr.toCharArray();
		
		for(int i = 0; i < charArray.length; i++){
			if(charArray[i] == '0')
				throw new StringCalculatorException("Deljenje sa nulom");
			if((charArray[i] == ',' || charArray[i]== '\n') && (charArray[i+1] == ',' || charArray[i+1]== '\n'))
				throw new StringCalculatorException("Pogresan zapis");
			if(charArray[i] != ',' && charArray[i] != '\n')
				rezultat2 /= Double.parseDouble(String.valueOf(charArray[i]));
		}
		return rezultat2;
	}
	
	
	public String getScore(){
		if(rezultat2 != 1)
			return "" + rezultat2;
		return "" + rezultat;
	}
}
