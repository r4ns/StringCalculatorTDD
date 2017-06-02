
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		String[] niz=numbersStr.split(",|\\\n");
		int[] brojevi=new int[niz.length];
		for(int i=0;i<numbersStr.length()-1;i++){
			if(numbersStr.substring(i, i+2).equals(",\n")||numbersStr.substring(i,i+2).equals("\n,")){
				throw new StringCalculatorException();
			}
		}
			for(int i=0;i<niz.length;i++){
			
			brojevi[i]=Integer.parseInt(niz[i]);
			if(brojevi[i]<0){
				throw new StringCalculatorException();
			}
		}
		int rezultat=0;
		for(int i=0;i<brojevi.length;i++){
			rezultat+=brojevi[i];
		}
		return rezultat;
	}
	
}
