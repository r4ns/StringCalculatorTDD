import java.util.Arrays;

public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		String[] separated = numbersStr.split("\n");
		String sep= "";
		String[] novi = {};
		for(int i = 0; i<separated.length; i++)
		{
			if(separated[i]==",")
				 novi = sep.split(",");
			sep +=separated[i];
			novi[i]=sep;
		}
		
		
		
		if(numbersStr == " ")
			return 0;
		// not yet implemented
		
		else{
				int zbir=0;
				
				for(int i = 0; i<novi.length;i++){
				
					zbir+=Integer.parseInt(novi[i]);
				
			}
			return zbir;
		}
	}
}
