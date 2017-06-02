
public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		int sum = 0;
		if(numbersStr == "" ){
			
			return 0;
		} else {
			
			String stringArray[] = numbersStr.split("\\s*,\\s*");
			for(int i=0; i<stringArray.length; i++){
				
				sum = sum + Integer.parseInt(stringArray[i]);
			}
			
			return sum;
			
			
			
			
		}
		
		
		
		
		// not yet implemented
		
	}
}
