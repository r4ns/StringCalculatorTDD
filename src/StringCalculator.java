
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		String[] niz=numbersStr.split(",|\\\n");
		int[] brojevi=new int[niz.length];
		for(int i=0;i<numbersStr.length()-1;i++){
			if(numbersStr.substring(i, i+2).equals(",\n")||numbersStr.substring(i,i+2).equals("\n,")){
				throw new StringCalculatorException();
			}
		}
		return 0;
	}
}
