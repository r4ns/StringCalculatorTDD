
public class StringCalculator {
	public StringCalculator(){
		
	}
	
	public int add(String numbersStr) throws StringCalculatorException {
		int sum=0;
		if(numbersStr.length() == 0){
			return 0;
		}
		String brojevi[] = numbersStr.split("[\n,]");
		for(String broj:brojevi){
			if(brojevi.length == 1){
				throw new StringCalculatorException("Dati input nije validan...");
			}
			int tmp =  Integer.parseInt(broj);
			if(tmp<=0){
					throw new StringCalculatorException("Dati input nije validan...");
			}
			sum+= tmp;
		}
		return sum;
	}
	
	public int subtract(String numbersStr) throws StringCalculatorException{		
		if(numbersStr.length() == 0){
			return 0;
		}
		String brojevi[] = numbersStr.split("[\n,]");
		if(brojevi.length==1){
			throw new StringCalculatorException();
		}
		int total =  Integer.parseInt(brojevi[0]);
		for(int i=0;i<brojevi.length;i++){
			int broj = Integer.parseInt(brojevi[i]);
			if(broj <= 0 ){
				throw new StringCalculatorException("Dati input nije validan...");
			}
			if(i!=0){
			total-= broj;
			}
		}
		return total;
	}
	public int multiply(String numbersStr) throws StringCalculatorException{		
		if(numbersStr.length() == 0){
			return 0;
		}
		String brojevi[] = numbersStr.split("[\n,]");
		if(brojevi.length==1){
			throw new StringCalculatorException();
		}
		int total =  Integer.parseInt(brojevi[0]);
		for(int i=0;i<brojevi.length;i++){
			int broj = Integer.parseInt(brojevi[i]);
			if(broj <= 0 ){
				throw new StringCalculatorException("Dati input nije validan...");
			}
			if(i!=0){
			total*= broj;
			}
		}
		return total;
	}
}
