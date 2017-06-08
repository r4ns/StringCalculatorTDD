
public class StringCalculator {
	
	String firstDelimiter = ",";
	String secondDelimiter = "\n";
	
	
	public StringCalculator() {
		
	}
	
	public int add(String numbersStr) throws StringCalculatorException{
		int sum = 0;
		if (numbersStr.length() == 0) 
			return 0;
		
		String[] numbers = numbersStr.replaceAll(secondDelimiter, firstDelimiter).split(firstDelimiter);
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers.length == 1) 
				throw new StringCalculatorException("Error! Operation can not be performed with one number.");
			
			int tmp = Integer.parseInt(numbers[i]);
			if(tmp < 0) 
				throw new StringCalculatorException("Error! Operation can not be performed with negative numbers.");
			
			if (numbersStr.contains(",\n") || numbersStr.contains("\n,"))
				throw new StringCalculatorException("Error! Wrong input.");
			
			sum += tmp;
		}
		
		return sum;
	}
	
	public int substract(String numbersStr) throws StringCalculatorException{
		int result=0;
		if (numbersStr.length() == 0) 
			return 0;
		
		String[] numbers = numbersStr.replaceAll(secondDelimiter, firstDelimiter).split(firstDelimiter);
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers.length == 1) 
				throw new StringCalculatorException("Error! Operation can not be performed with one number.");
			
			int tmp = Integer.parseInt(numbers[i]);
			if(tmp < 0) 
				throw new StringCalculatorException("Error! Operation can not be performed with negative numbers.");
			
			if (numbersStr.contains(",\n") || numbersStr.contains("\n,"))
				throw new StringCalculatorException("Error! Wrong input.");
			
			if(i == 0){
				result = tmp;
				continue;
			}
			
			result -= tmp;
		}
		
		return result;
	}
	
	public int multiply(String numbersStr) throws StringCalculatorException{
		int result = 1;
		if (numbersStr.length() == 0) 
			return 0;
		
		String[] numbers = numbersStr.replaceAll(secondDelimiter, firstDelimiter).split(firstDelimiter);
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers.length == 1) 
				throw new StringCalculatorException("Error! Operation can not be performed with one number.");
			
			int tmp = Integer.parseInt(numbers[i]);
			if(tmp < 0) 
				throw new StringCalculatorException("Error! Operation can not be performed with negative numbers.");
			
			if (numbersStr.contains(",\n") || numbersStr.contains("\n,"))
				throw new StringCalculatorException("Error! Wrong input.");
			
			result *= tmp;
		}
		
		return result;
	}
	
	public int divide(String numbersStr) throws StringCalculatorException{
		int result=1;
		if (numbersStr.length() == 0) 
			return 0;
		
		String[] numbers = numbersStr.replaceAll(secondDelimiter, firstDelimiter).split(firstDelimiter);
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers.length == 1) 
				throw new StringCalculatorException("Error! Operation can not be performed with one number.");
			
			int tmp = Integer.parseInt(numbers[i]);
			if(tmp < 1) 
				throw new StringCalculatorException("Error! Operation can not be performed with negative numbers.");
			
			if (numbersStr.contains(",\n") || numbersStr.contains("\n,"))
				throw new StringCalculatorException("Error! Wrong input.");
			
			if(i == 0){
				result = tmp;
				continue;
			}
			
			result /= tmp;
		}
		
		return result;
	}
}
