
public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		String[] separated = numbersStr.split(", || \n");
		if(numbersStr == " ")
			return 0;
		// not yet implemented
		int zbir=0;
		for(int i = 0; i<separated.length;i++){
			zbir+=Integer.parseInt(separated[i]);
		
		}
		return zbir;
	}
}
