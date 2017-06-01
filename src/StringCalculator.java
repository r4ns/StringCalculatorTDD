import java.util.Arrays;

public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		String[] separated = numbersStr.split(",\n");
		String sep= "";
		
		/*for(int i = 0; i<separated.length; i++)
		{
			
			sep +=separated[i];
		}
		*/
		//String[] novi = sep.split("\n");
		
		if(numbersStr == " ")
			return 0;
		// not yet implemented
		
		else{
				int zbir=0;
				
				for(int i = 0; i<separated.length;i++){
				
					zbir+=Integer.parseInt(separated[i]);
				
			}
			return zbir;
		}
	}
}
