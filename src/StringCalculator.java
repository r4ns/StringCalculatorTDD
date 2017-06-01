import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		// Returns the sum of the numbers given in numbersStr
		//String[] separated = numbersStr.split("\n");
		String delimiter1 = ",";
		String delimiter2 = "\n";
		numbersStr = numbersStr.replaceAll(delimiter2, delimiter1);
		String[] split_string = numbersStr.split(delimiter1);
		
		
		
		if(numbersStr == " ")
			return 0;
		// not yet implemented
		
		else{
				int zbir=0;
				if(split_string.length==1)
				{
					throw new StringCalculatorException();
				}
				for(int i = 0; i<split_string.length;i++){
					if(Integer.parseInt(split_string[i])<0)
						throw new StringCalculatorException();
					zbir+=Integer.parseInt(split_string[i]);
				
			}
			return zbir;
		}
	}
}
