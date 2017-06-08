
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		int suma = 0;
		if(numbersStr.length() == 0){
			return 0;
		}
		String brojevi[] = numbersStr.split("[\n,]");
		int duzina = brojevi.length;
		for(int i = 0; i < duzina;i++){
			if(duzina == 1){
				throw new StringCalculatorException();
			}
			int pomocna = Integer.parseInt(brojevi[i]);
			if(pomocna <= 0){
				throw new StringCalculatorException();
			}
			suma += pomocna;
		}
		return suma;
	}

	public int subtract(String numbersStr) throws StringCalculatorException {
		int rez = 0;
		if(numbersStr.length() == 0){
			return 0;
		}
		String brojevi[] = numbersStr.split("[\n,]");
		int duzina = brojevi.length;

		for(int i = 0; i < duzina;i++){
			if(duzina == 1){
				throw new StringCalculatorException();
			}
			if(i<duzina-1){
			if(Integer.parseInt(brojevi[i]) < Integer.parseInt(brojevi[i+1])){
				throw new StringCalculatorException();
			}
			}
			int pomocna = Integer.parseInt(brojevi[i]);
			if(pomocna <= 0){
				throw new StringCalculatorException();
			}
			if(i==0){
				rez=pomocna;
			}
			else{
			rez -= pomocna;}
		}
		return rez;
	}
	public int multi(String numbersStr) throws StringCalculatorException {
		int rez = 1;
		if(numbersStr.length() == 0){
			return 0;
		}
		String brojevi[] = numbersStr.split("[\n,]");
		int duzina = brojevi.length;
		for(int i = 0; i < duzina;i++){
			if(duzina == 1){
				throw new StringCalculatorException();
			}
			int pomocna = Integer.parseInt(brojevi[i]);
			if(pomocna <= 0){
				throw new StringCalculatorException();
			}
			rez *= pomocna;
		}
		return rez;
	}
	
}

