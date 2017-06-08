public class StringCalculator {
	
	public int add(String numbersStr) throws StringCalculatorException {
		
		String str[]  = numbersStr.split(",|\\\n");
		int rez=0;
		
		if(numbersStr == "")
		{
			throw new StringCalculatorException("Prazan string!");
		}
		
		for (int i=0; i<str.length; i++)
		{
			if(Integer.parseInt(str[i]) > 0)
			{
				rez += Integer.parseInt(str[i]);
			}
			else
			{
				throw new StringCalculatorException("Broj manji od nule!");
			}
		}
		return rez;
			
	}
	
	public int oduzimanje(String numbersStr) throws StringCalculatorException {
		
		String str[]  = numbersStr.split(",|\\\n");
		int rez= 0;
		
		if(numbersStr == "")
		{
			throw new StringCalculatorException("Prazan string!");
		}
		
		for (int i=0; i<str.length; i++)
		{
			
			if(Integer.parseInt(str[i]) > 0)
			{
				rez -= Integer.parseInt(str[i]);
			}
			else
			{
				throw new StringCalculatorException("Broj manji od nule!");
			}
		}
		return rez;
			
	}
	
	
	public int mnozenje(String numbersStr) throws StringCalculatorException {

		String str[]  = numbersStr.split(",|\\\n");
		int rez= 1;

		if(numbersStr == "")
		{
			throw new StringCalculatorException("Prazan string!");
		}

		for (int i=0; i<str.length; i++)
		{

			if(Integer.parseInt(str[i]) > 0)
			{
				rez *= Integer.parseInt(str[i]);
			}
			else
			{
				throw new StringCalculatorException("Broj manji od nule!");
			}
		}
		return rez;

	}
	
	public float deljenje(String numbersStr) throws StringCalculatorException {

		String str[]  = numbersStr.split(",|\\\n");
		float rez= 1;

		if(numbersStr == "")
		{
			throw new StringCalculatorException("Prazan string!");
		}

		for (int i=0; i<str.length; i++)
		{
			if(i==0)
			{
				rez = Float.parseFloat(str[0]);
			}
			if(i>0)
			{
				rez /= Float.parseFloat(str[i]);
			}	
			if(i<0)
			{
				throw new StringCalculatorException("Broj manji od nule!");
			}
			
		}
		return rez;

	}
	

}
