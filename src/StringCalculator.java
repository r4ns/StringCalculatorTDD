
public class StringCalculator {
	private String [] numbers;
	
	public int add(String numbersStr) throws StringCalculatorException{
		for (int i = 0; i < numbersStr.length()-1; i++) {
			if(numbersStr.substring(i,i+2).equals(",\n") || numbersStr.substring(i,i+2).equals("\n,")){
				throw new StringCalculatorException();
			}
		}
		if(numbersStr!=""){
			this.numbers = numbersStr.split(",|\\\n");
			int[] numbersInt = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				try{
					numbersInt[i]= Integer.parseInt(numbers[i]);
				}catch(NumberFormatException e){
					throw new StringCalculatorException();
				}
				
			}
			for (int i = 0; i < numbersInt.length; i++) {
				if(numbersInt[i]>9 || numbersInt[i]<0)
					throw new StringCalculatorException();
			}
			int rez=0;
			for (int i = 0; i < numbersInt.length; i++) {
				if(numbersInt[i]<0){
					throw new StringCalculatorException();
				}
				else
					rez+=numbersInt[i];
			}
			return rez;
		}
		else
			throw new StringCalculatorException();	
	}

	public int substract(String numbersStr) throws StringCalculatorException {
		for (int i = 0; i < numbersStr.length()-1; i++) {
			if(numbersStr.substring(i,i+2).equals(",\n") || numbersStr.substring(i,i+2).equals("\n,")){
				throw new StringCalculatorException();
			}
		}
		
		if(numbersStr!=""){
			this.numbers = numbersStr.split(",|\\\n");
			int[] numbersInt = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				try{
					numbersInt[i]= Integer.parseInt(numbers[i]);
				}catch(NumberFormatException e){
					throw new StringCalculatorException();
				}
			}
			int rez=numbersInt[0];
			for (int i = 1; i < numbersInt.length; i++) {
				if(numbersInt[i]<0){
					throw new StringCalculatorException();
				}
				if(numbersInt[0]<0){
					throw new StringCalculatorException();
				}
				else if(numbersInt[i]>numbersInt[i-1]){
					throw new StringCalculatorException();
				}
				else
					rez-=numbersInt[i];
			}
			return rez;
		}
		else
			throw new StringCalculatorException();	
	}

	public int multiply(String numbersStr) throws StringCalculatorException {
		for (int i = 0; i < numbersStr.length()-1; i++) {
			if(numbersStr.substring(i,i+2).equals(",\n") || numbersStr.substring(i,i+2).equals("\n,")){
				throw new StringCalculatorException();
			}
		}
		if(numbersStr!=""){
			this.numbers = numbersStr.split(",|\\\n");
			int[] numbersInt = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				try{
					numbersInt[i]= Integer.parseInt(numbers[i]);
				}catch(NumberFormatException e){
					throw new StringCalculatorException();
				}
			}
			int rez=1;
			for (int i = 0; i < numbersInt.length; i++) {
				if(numbersInt[i]<0){
					throw new StringCalculatorException();
				}
				else
					rez*=numbersInt[i];
			}
			return rez;
		}
		else
			throw new StringCalculatorException();	
	} 

	public double divide(String numbersStr) throws StringCalculatorException {
		for (int i = 0; i < numbersStr.length()-1; i++) {
			if(numbersStr.substring(i,i+2).equals(",\n") || numbersStr.substring(i,i+2).equals("\n,")){
				throw new StringCalculatorException();
			}
		}
		
		if(numbersStr!=""){
			this.numbers = numbersStr.split(",|\\\n");
			int[] numbersInt = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				try{
					numbersInt[i]= Integer.parseInt(numbers[i]);
				}catch(NumberFormatException e){
					throw new StringCalculatorException();
				}
			}
			
			double rez=numbersInt[0];
			for (int i = 1; i < numbersInt.length; i++) {
				if(numbersInt[i]<0){
					throw new StringCalculatorException();
				}
				if(numbersInt[0]<0){
					throw new StringCalculatorException();
				}
				else if(numbersInt[i]>numbersInt[i-1]){
					throw new StringCalculatorException();
				}
				else
					rez/=numbersInt[i];
			}
			return rez;
		}
		else
			throw new StringCalculatorException();
		
	}
	
	
	
	
}
