import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		String[] separated = numbersStr.split("\n");
		ArrayList<String> lista = new ArrayList<String>();
		
		for(int i = 0; i<separated.length; i++)
		{
			if(separated[i]!="," && separated[i]!="\n")
				lista.add(separated[i]);
			//sep +=separated[i];
			
		}
		
		
		
		if(numbersStr == " ")
			return 0;
		// not yet implemented
		
		else{
				int zbir=0;
				
				for(int i = 0; i<lista.size();i++){
				
					zbir+=Integer.parseInt(lista.get(i));
				
			}
			return zbir;
		}
	}
}
