
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

	public int substract(String numbersStr) throws StringCalculatorException {
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
			if(Integer.parseInt(brojevi[i]) < Integer.parseInt(brojevi[i+1])){
				throw new StringCalculatorException();
			}
			int pomocna = Integer.parseInt(brojevi[i]);
			if(pomocna <= 0){
				throw new StringCalculatorException();
			}
			rez -= pomocna;
		}
		return rez;
	}
}

