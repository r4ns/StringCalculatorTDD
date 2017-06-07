
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		int rezultat=0;
		String  brojevi [] =numbersStr.split(",|\\\n");
		if (numbersStr=="")
		{
			throw new StringCalculatorException("Prazan string");
		}
		
		for(int i=0; i<brojevi.length; i++)
		{
			if (Integer.parseInt(brojevi[i]) < 0)
			{
				throw new StringCalculatorException("Broj je negativan");
			}
			else
			{
				rezultat+=Integer.parseInt(brojevi[i]);
			}
			
			
			
		}
		if(rezultat==Integer.parseInt(brojevi[0]))
		{
			throw new StringCalculatorException("Input nije validan");
		}
		
		
		return rezultat;
		
		
		//return 0;
	}
	public StringCalculator()
	{
		
	}
	
	public int  pomnozi(String numbersStr) throws StringCalculatorException
	{
		int rezultat=1;
		
		String  brojevi [] =numbersStr.split(",|\\\n");
		
		if (numbersStr=="")
		{
			throw new StringCalculatorException("Prazan string");
			
		}
		
		for(int i=0; i<brojevi.length; i++)
		{
			if (Integer.parseInt(brojevi[0]) < 0)
			{
				throw new StringCalculatorException("Negativan broj");
			}
			else
			{
				rezultat*=Integer.parseInt(brojevi[i]);
			}
			
		}
		
		if(Integer.parseInt(brojevi[0])==rezultat)
		{
			throw new StringCalculatorException("Input je nevalidan");
			
		}
		
		
		
		return rezultat;
		
		
	}
	
	public int  oduzimanje(String numbersStr) throws StringCalculatorException
	{
		
		int rezultat=0;
		String  brojevi [] =numbersStr.split(",|\\\n");
		if (numbersStr=="")
		{
			throw new StringCalculatorException("Prazan string");
		}
		
		for(int i=0; i<brojevi.length; i++)
		{
			if (i==0)
			{
				rezultat=Integer.parseInt(brojevi[0]);
			} else
			{
				rezultat-=Integer.parseInt(brojevi[i]);
			}
			
		}
		
		if(rezultat==Integer.parseInt(brojevi[0]))
		{
			throw new StringCalculatorException("Input nije validan");
		}
		
		
		return rezultat;
			
	}
	
	public float  deljenje(String numbersStr) throws StringCalculatorException
	{
		float rezultat=0;
		
		String  brojevi [] =numbersStr.split(",|\\\n");
		
		if (numbersStr=="")
		{
			throw new StringCalculatorException("Prazan string");
		}
		
		for(int i=0; i<brojevi.length; i++)
		{
			
			if (i==0)
			{
				rezultat=Float.parseFloat(brojevi[0]);
			}
			else{
				
				rezultat=rezultat/Float.parseFloat(brojevi[i]);
			}
			
		}
		
		
		if(rezultat==Integer.parseInt(brojevi[0]))
		{
			throw new StringCalculatorException("Input nije validan");
		}
		
		if (numbersStr.contains("0"))
		{
			throw new StringCalculatorException("Deljenje sa 0 nije dozvoljeno");
		}
		
		return rezultat;
		
	}
	
	
	
	/*public String saberi(String str)
	{
		int rezultat=0;
		String brojevi[]=str.split(",");
		//String konacanNiz[];
		
		for(int i=0; i<brojevi.length; i++)
		{
			if (brojevi[i].contains("\n"))
			{
				String br[]=brojevi[i].split("\n");
				
				//i++;
				//rezultat=Integer.parseInt(br[0])+Integer.parseInt(br[1])+Integer.parseInt(brojevi[i]);
				rezultat=Integer.parseInt(brojevi[i]);
			} else
			{
				rezultat+=Integer.parseInt(brojevi[i]);
			}
		}
		
		
		
		String rez= Integer.toString(rezultat);
		return rez;
		
	}*/
}
