
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		if(numbersStr == ""){
			return 0;
		}else {
			int rezultat=0;
			String nizBrojeva[]=numbersStr.split("[\n,]");
			int brojevi[]=new int[nizBrojeva.length];
			for(int i=0;i<nizBrojeva.length;i++){
				brojevi[i]=Integer.parseInt(nizBrojeva[i]);
				if(brojevi[i]>=0){
					rezultat+=brojevi[i];
				}else
					throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojem");
			}
	
			return rezultat;
		}
	}
	
	public int subtraction(String numbersStr) throws StringCalculatorException{
		if(numbersStr.length()==0){
			return 0;
		}else{
			String nizBrojeva[]=numbersStr.split("[\n,]");
			int brojevi[]=new int[nizBrojeva.length];
			for(int i=0;i<nizBrojeva.length;i++){
				brojevi[i]=Integer.parseInt(nizBrojeva[i]);
				if(brojevi[i]<0)
					throw new StringCalculatorException("Nije moguce vrsiti datu operaciju sa negativnim brojem");
			}
			int rezultat=brojevi[0];
			for(int i=1;i<nizBrojeva.length;i++){
				if(brojevi[i]>=0){
					rezultat-=brojevi[i];
				}
			}
			return rezultat;
		}
	}
}
