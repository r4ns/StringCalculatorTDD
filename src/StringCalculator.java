
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		int sum=0;
		String[]helpers = numbersStr.split(",|\\\n");
		if(helpers.length>1){
			for(int i=0; i<helpers.length; i++){
				if(isNumeric(helpers[i])){
					if(Integer.parseInt(helpers[i])>=0)
					sum+=Integer.parseInt(helpers[i]);
					else throw new StringCalculatorException();
				}
				else throw new StringCalculatorException();
			}
		} else throw new StringCalculatorException();
		return sum;
	}
	public int subtract(String numbersStr) throws StringCalculatorException{
		int firstNum=0;
		String [] helpers = numbersStr.split(",|\\\n");
		//Checking if the first char is number so we can subtract
		if(isNumeric(helpers[0])){
			firstNum=Integer.parseInt(helpers[0]);
		} else throw new StringCalculatorException();
		if(helpers.length>1){
		for(int i=1; i<helpers.length; i++){
			if(isNumeric(helpers[i]) && Integer.parseInt(helpers[i])>=0 && firstNum>Integer.parseInt(helpers[i])){
					firstNum-=Integer.parseInt(helpers[i]);
			} else throw new StringCalculatorException();
		}
		} else throw new StringCalculatorException();
		return firstNum;
	}
	public int division(String numbersStr) throws StringCalculatorException{
		int firstNum=0;
		String [] helpers = numbersStr.split(",|\\\n");
		//Checking if the first char is number, so  we can do the division
		if(isNumeric(helpers[0])){
			firstNum=Integer.parseInt(helpers[0]);
		} else throw new StringCalculatorException();
		if(helpers.length>1){
		for(int i=1; i<helpers.length; i++){
			if(isNumeric(helpers[i]) && Integer.parseInt(helpers[i])>0){
				firstNum/=Integer.parseInt(helpers[i]);
			} else throw new StringCalculatorException();
		}
		} else throw new StringCalculatorException();
		return firstNum;
	}
	public int multiplication(String numbersStr) throws StringCalculatorException{
		int result=1;
		String [] helpers = numbersStr.split(",|\\\n");
		if(helpers.length>1){
		for(int i=0; i<helpers.length; i++){
			if(isNumeric(helpers[i]) && Integer.parseInt(helpers[i])>=0)
				result*=Integer.parseInt(helpers[i]);
			else throw new StringCalculatorException();
		}
		} else throw new StringCalculatorException();
		return result;
	}
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    Integer.parseInt(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
}
