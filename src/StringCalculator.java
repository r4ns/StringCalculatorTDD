
public class StringCalculator {
	
	public StringCalculator(){
		
		
	}
	public int add(String numbersStr) throws StringCalculatorException {
		
		if(numbersStr==""){
			throw new StringCalculatorException("Input nije validan");
		}
		else if(numbersStr.contains("-")){
			throw new StringCalculatorException("Nije moguce vrsiti operacije sa negativnim brojevima");
		} else {
			
			String[] niz=numbersStr.split(",");
			//int[] nizBrojeva=null;
			int rezultat=0;
			for(int i=0;i<niz.length;i++){
				
				//nizBrojeva[i]=Integer.parseInt(niz[i]);
				rezultat=rezultat+Integer.parseInt(niz[i]);
			}
			return rezultat;
		}
	
	
	}
	
	
	

}
