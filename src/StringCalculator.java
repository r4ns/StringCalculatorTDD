
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		if(numbersStr==""){
			return 0;
		}
		String[] niz=numbersStr.split(",|\\\n");
		int[] numbers=new int[niz.length];
		
		for(int i=0;i<numbersStr.length()-1;i++)
		{
			
			if(numbersStr.substring(i, i+2).equals(",\n")||numbersStr.substring(i,i+2).equals("\n,"))
			{
				throw new StringCalculatorException("Greska!");
			}
			
			
		}
			for(int i=0;i<niz.length;i++){
			
			numbers[i]=Integer.parseInt(niz[i]);
			if(numbers[i]<0){
				throw new StringCalculatorException("Nije moguce vrsiti  datu operaciju sa negativnim brojevima");
			}
			
			
		}
		int rezultat=0;
		for(int i=0;i<numbers.length;i++){
			rezultat+=numbers[i];
		}
		return rezultat;
	}
	public int subtraction(String numbersStr) throws StringCalculatorException {
		if(numbersStr==""){
			return 0;
		}
		for(int i=0;i<numbersStr.length()-1;i++){
			if(numbersStr.substring(i, i+2).equals(",\n")||numbersStr.substring(i,i+2).equals("\n,")){
				throw new StringCalculatorException("Greska");
			}
		}
		String[] niz=numbersStr.split(",|\\\n");
		int[] brojevi=new int[niz.length];
			
			for(int i=0;i<niz.length;i++){
				
				brojevi[i]=Integer.parseInt(niz[i]);
				if(brojevi[i]<0){
					throw new StringCalculatorException("Negativan broj");
				}
			}
			int rezultat=brojevi[0];
			for(int i=1;i<brojevi.length;i++){
				rezultat-=brojevi[i];
			}
			if(rezultat<0){
				throw new StringCalculatorException("Rezultat je negativan");
			}
			return rezultat;
		
	}
	public int multiplication(String numbersStr) throws StringCalculatorException {
		if(numbersStr==""){
			return 0;
		}
		for(int i=0;i<numbersStr.length()-1;i++){
			if(numbersStr.substring(i, i+2).equals(",\n")||numbersStr.substring(i,i+2).equals("\n,")){
				throw new StringCalculatorException("Greska");
			}
		}
		String[] niz=numbersStr.split(",|\\\n");
		int[] brojevi=new int[niz.length];
		
			for(int i=0;i<niz.length;i++){
				
				brojevi[i]=Integer.parseInt(niz[i]);
				if(brojevi[i]<0){
					throw new StringCalculatorException("Broj je negativan");
				}
			}
			int rezultat=1;
			for(int i=1;i<brojevi.length;i++){
				rezultat*=brojevi[i];
			}
			return rezultat;
		
		
	}
	public double devide (String numbersStr) throws StringCalculatorException {
		if(numbersStr==""){
			return 0;
		}
		String[] niz=numbersStr.split(",|\\\n");
		int[] numbers=new int[niz.length];
		
		for(int i=0;i<numbersStr.length()-1;i++)
		{
			
			if(numbersStr.substring(i, i+2).equals(",\n")||numbersStr.substring(i,i+2).equals("\n,"))
			{
				throw new StringCalculatorException("Greska!");
			}
		}
		for(int i=0;i<niz.length;i++){
			
			numbers[i]=Integer.parseInt(niz[i]);
			if(numbers[i]<0){
				throw new StringCalculatorException("Nije moguce vrsiti  datu operaciju sa negativnim brojevima");
			}
			
			
		}
		float rezultat=1;
		for(int i=0;i<numbers.length;i++){
			rezultat/=numbers[i];
		}
		return rezultat;
	}
}
