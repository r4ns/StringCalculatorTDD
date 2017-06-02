
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		String[] niz=numbersStr.split(",|\\\n");
		int[] numbers=new int[niz.length];
		
		for(int i=0;i<numbersStr.length()-1;i++)
		{
			
			if(numbersStr.substring(i, i+2).equals(",\n")||numbersStr.substring(i,i+2).equals("\n,"))
			{
				throw new StringCalculatorException();
			}
			if(niz.length==0)
			{
				return 0;
			}
		}
			for(int i=0;i<niz.length;i++){
			
			numbers[i]=Integer.parseInt(niz[i]);
			if(numbers[i]<0){
				throw new StringCalculatorException();
			}
		}
		int rezultat=0;
		for(int i=0;i<numbers.length;i++){
			rezultat+=numbers[i];
		}
		return rezultat;
	}
	
}
