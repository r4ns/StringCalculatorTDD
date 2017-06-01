
public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return 0;
	}
	public StringCalculator()
	{
		
	}
	
	
	public String saberi(String str)
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
		
	}
}
