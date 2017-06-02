
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		// Returns the sum of the numbers given in numbersStr
		int sum = 0;
		int count = 0;
		if(numbersStr == "" ){
			
			return 0;
		} else {
			
			String stringArray[] = numbersStr.split("\\s*,\\s*");
			for(int i=0; i<stringArray.length; i++){
				
				System.out.println(stringArray[i]);
				
			}
			for(int i=0; i<stringArray.length; i++){
				
				if(stringArray[i] == "\n"){
					
					continue;
				}
				
				sum = sum + Integer.parseInt(stringArray[i]);
				count++;
			}
			
			if(count == 1){
				
				throw new StringCalculatorException();
			}
			
			return sum;
			
			
			
			
		}
		
		
		
		
		// not yet implemented
		
	}
}
