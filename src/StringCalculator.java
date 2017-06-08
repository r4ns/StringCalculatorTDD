
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		// Returns the sum of the numbers given in numbersStr
		if(numbersStr=="")
			return 0;
		else{
		String[] nizBrojeva = numbersStr.split("[\n,]");
		int[] brojevi= new int[nizBrojeva.length];
		int rezultat = 0;
		for(int i=0; i<nizBrojeva.length;i++){
			brojevi[i]=Integer.parseInt(nizBrojeva[i]);
			if(brojevi[i]>=0){
			rezultat+=brojevi[i];
			}
			else 
				throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojevima");
		}
		return rezultat;
		}
	}
	
	public int substraction(String numbersStr) throws StringCalculatorException{
		if(numbersStr.length()==0){
			return 0;
		}
		else{
			String[] nizBrojeva = numbersStr.split("[\n,]");
			int[] brojevi= new int[nizBrojeva.length];
			for(int i=0; i<brojevi.length; i++){
				brojevi[i]=Integer.parseInt(nizBrojeva[i]);
				if(brojevi[i]<0)
					throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojevima");
			}
			int rezultat = brojevi[0];
			for(int i=1; i<brojevi.length; i++){
				rezultat-=brojevi[i];
				
			}
			return rezultat;
		}
	}
	
	public int divide(String numbersStr) throws StringCalculatorException{
		if(numbersStr.length()==0){
			return 0;
		}
		else{
			String[] nizBrojeva = numbersStr.split("[\n,]");
			int[] brojevi= new int[nizBrojeva.length];
			for(int i=0; i<brojevi.length; i++){
				brojevi[i]=Integer.parseInt(nizBrojeva[i]);
				if(brojevi[i]<0)
					throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojevima");
			}
			int rezultat = brojevi[0];
			for(int i=1; i<brojevi.length; i++){
				rezultat/=brojevi[i];
				
			}
			return rezultat;
		}
	}
	
	public int multiple(String numbersStr) throws StringCalculatorException{
		if(numbersStr.length()==0){
			return 0;
		}
		else{
			String[] nizBrojeva = numbersStr.split("[\n,]");
			int[] brojevi= new int[nizBrojeva.length];
			for(int i=0; i<brojevi.length; i++){
				brojevi[i]=Integer.parseInt(nizBrojeva[i]);
				if(brojevi[i]<0)
					throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojevima");
			}
			int rezultat = brojevi[0];
			for(int i=1; i<brojevi.length; i++){
				rezultat*=brojevi[i];
				
			}
			return rezultat;
		}
	}
	
	
}

