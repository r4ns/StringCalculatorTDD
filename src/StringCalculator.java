
public class StringCalculator {
	
	public int add(String numbersStr) throws StringCalculatorException {
		// Returns the sum of the numbers given in numbersStr
		int res=0;
		if(numbersStr == "")
			return 0;
		else{
			String[] stringNumbers = numbersStr.split(",|\\\n");
			for(int i=0; i<stringNumbers.length; i++)
			{
				if(Integer.parseInt(stringNumbers[i]) < 0)
					throw new StringCalculatorException();
				else
					res+=Integer.parseInt(stringNumbers[i]);
			}
			return res;
		}
	
	}
	public int subtraction(String numbersStr) throws StringCalculatorException
	{
		int res=0;
		if(numbersStr=="")
			return 0;
		else{
			String[] stringNumbers = numbersStr.split(",|\\\n");
			
			for(int i=0; i<stringNumbers.length; i++)
			{
				if(Integer.parseInt(stringNumbers[i]) < 0)
					throw new StringCalculatorException();
				else
					res-=Integer.parseInt(stringNumbers[i]);
			}
			return res;
		}
	}
	
}
