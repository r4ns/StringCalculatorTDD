
public class StringCalculator {
	
	public StringCalculator(){
		
		
	}
	public int add(String numbersStr)throws StringCalculatorException {
		
		int rezultat=0;
		if(numbersStr.contains("-")){
			throw new StringCalculatorException("Negativni brojevi ne mogu da se sabiraju!");
		}
		else if(numbersStr==""){
			throw new StringCalculatorException("Input nije validan");
		}
		String[] brojevi=numbersStr.split(",|\\\n");
		
		for(int i=0;i<brojevi.length;i++){
			rezultat=rezultat+Integer.parseInt(brojevi[i]);
		}
		
		if(rezultat==Integer.parseInt(brojevi[0])){
			throw new StringCalculatorException("Input nije validan");
		}
		
		return rezultat;
	}
	public int multiply(String numbersStr)throws StringCalculatorException {
		int rezultat=1;
		if(numbersStr.contains("-")){
			throw new StringCalculatorException("Negativni brojevi ne mogu da se mnoze!");
		}
		else if(numbersStr==""){
			throw new StringCalculatorException("Input nije validan");
		}
		String[] brojevi=numbersStr.split(",|\\\n");
		
		for(int i=0;i<brojevi.length;i++){
			rezultat=rezultat*Integer.parseInt(brojevi[i]);
		}
		if(rezultat==Integer.parseInt(brojevi[0])){
			throw new StringCalculatorException("Input nije validan");
		}
		
		return rezultat;
	}
	public int subtract(String numbersStr)throws StringCalculatorException{
		
		int rezultat=0;
		if(numbersStr.contains("-")){
			throw new StringCalculatorException("Negativni brojevi ne mogu da se mnoze!");
		}
		else if(numbersStr==""){
			throw new StringCalculatorException("Input nije validan");
		}
		String[] brojevi=numbersStr.split(",|\\\n");
		
		for(int i=0;i<brojevi.length;i++){
			if(i==0){
				rezultat=Integer.parseInt(brojevi[0]);
			}else {
			rezultat=rezultat-Integer.parseInt(brojevi[i]);
			}
		}
		if(rezultat==Integer.parseInt(brojevi[0])){
			throw new StringCalculatorException("Input nije validan");
		}
		return rezultat;
		
	}
	public float divide(String numbersStr)throws StringCalculatorException{
		
		float rezultat=0;
		
		if(numbersStr.contains("-")){
			throw new StringCalculatorException("Negativni brojevi ne mogu da se mnoze!");
		}
		else if(numbersStr==""){
			throw new StringCalculatorException("Input nije validan");
		}
		String[] brojevi=numbersStr.split(",|\\\n");
		for(int i=0;i<brojevi.length;i++){
			if(i==0){
				rezultat=Float.parseFloat(brojevi[0]);
			}else {
			rezultat=rezultat/Float.parseFloat(brojevi[i]);
			}
		}
		
		if(rezultat==Integer.parseInt(brojevi[0])){
			throw new StringCalculatorException("Input nije validan");
		}
		return rezultat;
	}

}
