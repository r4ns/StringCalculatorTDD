
public class StringCalculator {
	String input;
	private char[]karakteri = null;
	
	public StringCalculator(){}
	
	public StringCalculator(String input){
		this.input = input;
	}
	
	public int add(String numbersStr) {
		int n = numbersStr.length();
		int broj = 0 ;
		premestanjeStringUcharNiz(numbersStr);
		int[]array = null;
		for(int i = 0;i<karakteri.length;i++){
			if(karakteri[i]!=','|| karakteri[i]!='\n')
				array[i] = (int)karakteri[i];
		}
		for(int j = 0;j<array.length;j++){
			broj+=array[j];
		}

		return broj;
	}
	
	
	public void premestanjeStringUcharNiz(String in){
		int n = in.length();
		if(karakteri == null){
			for(int i =0;i<n;i++){
				karakteri[i] = (char) in.indexOf(i);
			}
		}else{
			karakteri = null;
		}
	}

}
