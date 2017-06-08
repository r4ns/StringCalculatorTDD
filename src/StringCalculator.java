
public class StringCalculator {
	
	// Returns the sum of the numbers given in numbersStr
	public int add(String numbersStr) throws StringCalculatorException {
		
		// Check to see if the string is empty
		if (numbersStr.isEmpty())
		{
			return 0;
		}
		
		// Separating the string by the given delimiter
		String[] stringArray = numbersStr.split(",|\\\n");
		
		// Initializing the number array
		int[] numbersArray = parsingTheArray(stringArray);
		
		// Actual sum of the numbers
		int sum = 0;
		
		// Adding all the numbers from the numbersArray
		for (int i = 0; i < numbersArray.length; i++) {
			sum += numbersArray[i];
		}
		
		// Returning the actual sum
		return sum;
	}
	
	
	// Returns the difference of the numbers given in numbersStr
	public int substract(String numbersStr) throws StringCalculatorException {

		// Check to see if the string is empty
		if (numbersStr.isEmpty()) {
			return 0;
		}

		// Separating the string by the given delimiter
		String[] stringArray = numbersStr.split(",|\\\n");

		// Initializing the number array
		int[] numbersArray = parsingTheArray(stringArray);

		// Actual difference of the numbers
		int difference = numbersArray[0];

		// Adding all the numbers from the numbersArray
		for (int i = 1; i < numbersArray.length; i++) {
			difference -= numbersArray[i];
		}

		// Returning the actual difference
		return difference;
	}
	
	
	// Returns the quotient of the numbers given in numbersStr
	public int divide(String numbersStr) throws StringCalculatorException {

		// Check to see if the string is empty
		if (numbersStr.isEmpty()) {
			return 0;
		}

		// Separating the string by the given delimiter
		String[] stringArray = numbersStr.split(",|\\\n");

		// Initializing the number array
		int[] numbersArray = parsingTheArray(stringArray);

		// Actual quotient of the numbers
		int quotient = numbersArray[0];

		// Adding all the numbers from the numbersArray
		for (int i = 1; i < numbersArray.length; i++) {
			quotient /= numbersArray[i];
		}

		// Returning the actual quotient
		return quotient;
	}
	
	
	// Returns the sum of the numbers given in numbersStr
	public int multiply(String numbersStr) throws StringCalculatorException {
		
		// Check to see if the string is empty
		if (numbersStr.isEmpty())
		{
			return 0;
		}
		
		// Separating the string by the given delimiter
		String[] stringArray = numbersStr.split(",|\\\n");
		
		// Initializing the number array
		int[] numbersArray = parsingTheArray(stringArray);
		
		// Actual product of the numbers
		int product = 1;
		
		// Adding all the numbers from the numbersArray
		for (int i = 0; i < numbersArray.length; i++) {
			product *= numbersArray[i];
		}
		
		// Returning the actual product
		return product;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/////// HELPER METHODS /////////
	
	
	public int[] parsingTheArray(String[] stringArray) throws StringCalculatorException {
		int[] intArray = new int[stringArray.length];

		// Iterating through the String array and parsing those string into
		// integers
		try {
			for (int i = 0; i < stringArray.length; i++) {
				
				// If there is an integer which is negative, throw new StringCalculatorException (according to the instructions)
				if (Integer.parseInt(stringArray[i]) < 0)
				{
					throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojevima");
				}
				
				// If not, parse the strings into integers
				else
					intArray[i] = Integer.parseInt(stringArray[i]);
			}
			
			// If the program catches the NumberFormatException throw new StringCalculatorException (according to the instructions)
		} catch (NumberFormatException nfe) {
			throw new StringCalculatorException("Dati input nije validan");
		}
		
		// Returning an integer array
		return intArray;
	}
}
