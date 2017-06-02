
public class StringCalculator {
	public StringCalculator() {
		
	}
	
	public int add(String numbersStr)throws StringCalculatorException {
		String [] niz = numbersStr.split(",");
		String znak = niz[0];
		int rezultat=0;
		//int razlika=0;
		switch(znak){
		case "+": 
			for(int i=1;i<niz.length;i++){
				rezultat += Integer.parseInt(niz[i]);
			}
			break;
		
		case "-":
			for(int i=1;i<niz.length;i++){
				if(i == 1)
					rezultat = Integer.parseInt(niz[i]);
				else
					rezultat -= Integer.parseInt(niz[i]);
			}
			break;
			
		case "*":
			for(int i=1;i<niz.length;i++){
				if(i == 1)
					rezultat = Integer.parseInt(niz[i]);
				else
					rezultat *= Integer.parseInt(niz[i]);
			}
			break;
		
		
		case "/":
			for(int i=1;i<niz.length;i++){
				if(Integer.parseInt(niz[i])==0){
					  throw new StringCalculatorException();
				}
				else if(i == 1)
					rezultat = Integer.parseInt(niz[i]);
				else
					rezultat /= Integer.parseInt(niz[i]);
			}
			break;
	
		}
		return Integer.valueOf(rezultat);
	}
}
