
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		
		// Returns the sum of the numbers given in numbersStr
		if (numbersStr.equals(""))
			return 0;
	
		int result = 0;
		String buffer = "";
		for (int i = 0; i < numbersStr.length(); i++){
			if (numbersStr.charAt(i) != ',' && numbersStr.charAt(i) != '\n'){
				buffer += numbersStr.charAt(i);
			} 
			else {
				if (i < numbersStr.length() - 1){
					if (numbersStr.charAt(i) == ',' && numbersStr.charAt(i + 1)=='\n'){
						throw new StringCalculatorException("Invalid input");
						
					}
					else if (numbersStr.charAt(i) == '\n' && numbersStr.charAt(i + 1)==','){
						throw new StringCalculatorException("Invalid input");
						
					}
				}
				result += Integer.parseInt(buffer);
				buffer ="";
			}
		}
		if (!buffer.equals(""))
			result += Integer.parseInt(buffer);
		
		return result;
	}

	public int substract(String numbersStr) throws StringCalculatorException {
		if (numbersStr.equals(""))
			return 0;
		int result = 0;
		boolean isFirst = true;
		String buffer = "";
		for (int i = 0; i < numbersStr.length(); i++){
			if (numbersStr.charAt(i) != ',' && numbersStr.charAt(i) != '\n'){
				buffer += numbersStr.charAt(i);
			}
			else {
				if (i < numbersStr.length() - 1){
					if (numbersStr.charAt(i) == ',' && numbersStr.charAt(i + 1)=='\n'){
						throw new StringCalculatorException("Invalid input");
						
					}
					else if (numbersStr.charAt(i) == '\n' && numbersStr.charAt(i + 1)==','){
						throw new StringCalculatorException("Invalid input");
						
					}
				}
				if (isFirst){
					result += Integer.parseInt(buffer);
					isFirst = false;
				} else {
					result -= Integer.parseInt(buffer);
				}
				buffer ="";
			}
		}
		if (!buffer.equals(""))
			result -= Integer.parseInt(buffer);
		
		return result;
	}

	public int multiply(String numbersStr) throws StringCalculatorException {
		if (numbersStr.equals(""))
			return 0;
		int result = 1;
		String buffer = "";
		for (int i = 0; i < numbersStr.length(); i++){
			if (numbersStr.charAt(i) != ',' && numbersStr.charAt(i) != '\n'){
				buffer += numbersStr.charAt(i);
			}
			else {
				if (i < numbersStr.length() - 1){
					if (numbersStr.charAt(i) == ',' && numbersStr.charAt(i + 1)=='\n'){
						throw new StringCalculatorException("Invalid input");
						
					}
					else if (numbersStr.charAt(i) == '\n' && numbersStr.charAt(i + 1)==','){
						throw new StringCalculatorException("Invalid input");
						
					}
				}
				result *= Integer.parseInt(buffer);
				buffer ="";
			}
		}
		if (!buffer.equals(""))
			result *= Integer.parseInt(buffer);
		
		return result;
	}

	public float divide(String numbersStr) throws StringCalculatorException {
		boolean isFirst = true;
		if (numbersStr.equals(""))
			return 0;
		float result = 1;
		String buffer = "";
		for (int i = 0; i < numbersStr.length(); i++){
			if (numbersStr.charAt(i) != ',' && numbersStr.charAt(i) != '\n'){
				buffer += numbersStr.charAt(i);
			}
			else {
				if (i < numbersStr.length() - 1){
					if (numbersStr.charAt(i) == ',' && numbersStr.charAt(i + 1)=='\n'){
						throw new StringCalculatorException("Invalid input");
						
					}
					else if (numbersStr.charAt(i) == '\n' && numbersStr.charAt(i + 1)==','){
						throw new StringCalculatorException("Invalid input");
						
					}
				}
				
				if (isFirst){
					result += Float.parseFloat(buffer);
					isFirst = false;
				}else {
					result /=  Float.parseFloat(buffer);
				}
				buffer ="";
			}
		}
		if (!buffer.equals(""))
			result /= Float.parseFloat(buffer);
		
		return result;
	}
}
