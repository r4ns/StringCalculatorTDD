
public class StringCalculator {
	
	public StringCalculator(){
		
		
	}
	public int add(String numbersStr) throws StringCalculatorException {
		
		if(numbersStr==""){
			throw new StringCalculatorException();
		}
		else if(numbersStr.contains("-")){
			throw new StringCalculatorException();
		}
		return 0;
	}
	
	
	

}
