
public class StringCalculator {
	public StringCalculator() {
	
		
	}
	public int add(String numbersStr) throws StringCalculatorException {
		// Returns the sum of the numbers given in numbersStr
		int rez = 0;
		String brojevi [] = numbersStr.split(",|\\\n");
		
		if(numbersStr == " ")
		{
			throw new StringCalculatorException("Nije validan unos");
		}
		
		for(int i=0;i<brojevi.length;i++)
		{
			rez+=Integer.parseInt(brojevi[i]);
			
			if(Integer.parseInt(brojevi[i])<0)
			{
				throw new StringCalculatorException("Ne moze negativan broj");
			}
			
			
		}
		
		if(rez == Integer.parseInt(brojevi[0]))
		{
			throw new StringCalculatorException("Input Nije validan");
		}
		
		return rez;
		
	}
	
	public int pomnozi(String numbersStr) throws StringCalculatorException {
		int rez = 1;
		
		String brojevi [] = numbersStr.split(",|\\\n");
		
		
		for(int i=0;i<brojevi.length;i++)
		{
			rez*=Integer.parseInt(brojevi[i]);
			if(Integer.parseInt(brojevi[i])<0)
			{
				throw new StringCalculatorException("Ne moze negativan broj");
			}
			
		}
		
		if(rez == Integer.parseInt(brojevi[0]))
		{
			throw new StringCalculatorException("Input Nije validan");
		}
		
		if(numbersStr == "")
		{
			throw new StringCalculatorException("Nije validan unos");
		}
		
		
		return rez;
		
	}
	
	public int oduzmi(String numbersStr) throws StringCalculatorException {
    int rez = 0;
		
		String brojevi [] = numbersStr.split(",|\\\n");
		
		
		for(int i=0;i<brojevi.length;i++)
		{
			
			if(i==0)
			{
				rez=Integer.parseInt(brojevi[0]);
			}
			else 
			{
				rez-=Integer.parseInt(brojevi[i]);
			}
			
			if(Integer.parseInt(brojevi[i])<0)
			{
				throw new StringCalculatorException("Ne moze negativan broj");
			}
			
		}
		
		if(rez == Integer.parseInt(brojevi[0]))
		{
			throw new StringCalculatorException("Input Nije validan");
		}
		
		if(numbersStr == "")
		{
			throw new StringCalculatorException("Nije validan unos");
		}
		
		return rez;
		
	}
	
	public float podeli(String numbersStr) throws StringCalculatorException {
    float rez = 0;
		
		String brojevi [] = numbersStr.split(",|\\\n");
			
		for(int i=0;i<brojevi.length;i++)
		{
			
			if(i==0)
			{
				rez=Float.parseFloat(brojevi[0]);
			}
			else 
			{
				rez/=Float.parseFloat(brojevi[i]);
			}
			if(Float.parseFloat(brojevi[i])<0)
			{
				throw new StringCalculatorException("Ne moze negativan broj");
			}
			
			
		}
		
		if(rez == Float.parseFloat(brojevi[0]))
		{
			throw new StringCalculatorException("Input Nije validan");
		}
		
		if(numbersStr == "")
		{
			throw new StringCalculatorException("Nije validan unos");
		}
		
		return rez;
		
	}
	
	

	
	
	

	
	
	

	
	
	
	
	
	
}
