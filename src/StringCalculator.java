
public class StringCalculator {
	
	public StringCalculator(){
		
		
	}
	public int add(String numbersStr) throws StringCalculatorException {
		
		if(numbersStr==""){
			throw new StringCalculatorException("Input nije validan");
		}
		else if(numbersStr.contains("-")){
			throw new StringCalculatorException("Nije moguce vrsiti operacije sa negativnim brojevima");
		}
		return 0;
	}
	
	
	

}
