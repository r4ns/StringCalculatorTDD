
public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		return 0;
	}

	public StringCalculator() {
	
		
	}
	
	public String saberi(String s){
		
		int rez=0;
		String nizBrojeva [] = s.split(",");
		for(int i=0;i<nizBrojeva.length;i++)
		{
			if(nizBrojeva[0].contains("\n"))
			{
				String brSa_n [] = nizBrojeva[0].split("\n");
				i++;
				rez = Integer.parseInt(brSa_n[0]) + Integer.parseInt(brSa_n[1]) + Integer.parseInt(nizBrojeva[i]);
			}
			else {
				rez += Integer.parseInt(nizBrojeva[i]);
			}
			
		}
		
		String rezultat = Integer.toString(rez);
		return rezultat;
	}

	
	
	
	
	
	
}
