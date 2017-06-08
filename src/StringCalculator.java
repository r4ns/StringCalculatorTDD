import java.util.ArrayList;

public class StringCalculator {
	private ArrayList<String> brojevi = new ArrayList<String>();
	
	public StringCalculator(){
		
	}
	
	public int add(String numbersStr) throws StringCalculatorException {
		
		String[] broj = numbersStr.split(",");
		
		for(int i = 0; i < broj.length; i++)
		{
			//System.out.println("Vrednosti stringa: "+broj[i]);
			if(!isNumeric(broj[i]))
			{
				throw new StringCalculatorException();
			}
			else
				brojevi.add(broj[i]);
		}
		return 0;
	}
	public int sabiranje()
	{
		int rez = 0;
		for(int i = 0; i < brojevi.size(); i++)
		{
			rez += Integer.parseInt(brojevi.get(i));
		}
		return rez;
	}
	
	public int oduzimanje()
	{
		int rez = 0;
		for(int i = 0; i < brojevi.size(); i++)
		{
			rez -= Integer.parseInt(brojevi.get(i));
		}
		return rez;
	}
	
	public int mnozenje()
	{
		int rez = 1;
		for(int i = 0; i < brojevi.size(); i++)
		{
			rez *= Integer.parseInt(brojevi.get(i));
		}
		return rez;
	}
	
	public String deljenje()
	{
		String izlaz = null;
		double rez = Double.parseDouble(brojevi.get(0));;
		for(int i = 1; i < brojevi.size(); i++)
		{
			if(Double.parseDouble(brojevi.get(i)) == 0)
			{
				izlaz = "Deljenje sa 0 nije moguce";
				break;
			}
			else
				rez /= Double.parseDouble(brojevi.get(i));
			izlaz = Double.toString(rez);
		}
		
		return izlaz;
	}
	
	
	
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
}
