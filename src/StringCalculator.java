
public class StringCalculator {
	
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		if(numbersStr == ""){
			return 0;
		}
		String [] niz = numbersStr.split(",|\\\n");
		
		int result = 0;
		for (int i = 0; i < niz.length; i++) {
			result += Integer.parseInt(niz[i]);
		}
		return result;
	}
	
	public int oduzimanje(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		if(numbersStr == ""){
			return 0;
		}
		String [] niz = numbersStr.split(",|\\\n");
		
		int result = Integer.parseInt(niz[0]);
		for (int i = 1; i < niz.length; i++) {
			result -= Integer.parseInt(niz[i]);
		}
		return result;
	}
	
	public int mnozenje(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		if(numbersStr == ""){
			return 0;
		}
		String [] niz = numbersStr.split(",|\\\n");
		
		int result = 1;
		for (int i = 0; i < niz.length; i++) {
			result *= Integer.parseInt(niz[i]);
		}
		return result;
	}
	
	public int deljenje(String numbersStr){
		// Returns the sum of the numbers given in numbersStr
		
		// not yet implemented
		if(numbersStr == ""){
			return 0;
		}
		
		
		String [] niz = numbersStr.split(",|\\\n");
		
		for (int i = 0; i < niz.length; i++) {
			if(Integer.parseInt(niz[i]) < 0){
			}
		}
		
		int result = Integer.parseInt(niz[0]);
		for (int i = 1; i < niz.length; i++) {
			result /= Integer.parseInt(niz[i]);
		}
		return result;
	}
	
	
	
	
}
