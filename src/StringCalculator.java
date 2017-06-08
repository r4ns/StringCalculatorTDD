
public class StringCalculator {
	
		
	public int add(String numbersStr) throws StringCalculatorException{
			 
			 		if(numbersStr==""){
			 			return 0;
			 		}
			 		else{
			 			String  brojevi [] =numbersStr.split(",|\\\n");
			 			int duzina=brojevi.length;
			 			int rezultat=0;
			 			for(int i=0;i<duzina;i++){
			 				int broj=Integer.parseInt(brojevi[i]);
			 				if(broj>0){
			 					rezultat=rezultat+broj;
			 				}
			 				else{
			 					throw new StringCalculatorException();
			 				}
			 
			 			}
			 			if(rezultat==Integer.parseInt(brojevi[0]))
			 			{
			 				throw new StringCalculatorException();
			 			}
			 			else{
			 				return rezultat;
			 			}
			 		}
			 	}
			 	
			 	public int pomnozi(String numbersStr) throws StringCalculatorException{
			 		
			 		if(numbersStr==""){
			 			return 0;
			 		}
			 		else{
			 			String  brojevi [] =numbersStr.split(",|\\\n");
			 			int duzina=brojevi.length;
			 			int rezultat=1;
			 			for(int i=0;i<duzina;i++){
			 				int broj=Integer.parseInt(brojevi[i]);
			 				if(broj>0){
			 					rezultat=rezultat*broj;
			 				}
			 				else{
			 					throw new StringCalculatorException();
			 				}
			 
			 			}
			 		if(rezultat==Integer.parseInt(brojevi[0]))
			 			{
			 				throw new StringCalculatorException();
			 			}
			 			else{
			 				return rezultat;
			 			}
			 		}
			 	}
			 	
			 public int oduzmi(String numbersStr) throws StringCalculatorException{
			 
			 		if(numbersStr==""){
			 			return 0;
			 		}
			 		else{
			 			String  brojevi [] =numbersStr.split(",|\\\n");
			 			int duzina=brojevi.length;
			 			int rezultat=Integer.parseInt(brojevi[0]);
			 			for(int i=1;i<duzina;i++){
			 				int broj=Integer.parseInt(brojevi[i]);
			 				if(broj>0){
			 					rezultat=rezultat-broj;
			 				}
			 				else{
			 					throw new StringCalculatorException();
			 				}
			 
			 			}
			 			if(rezultat==Integer.parseInt(brojevi[0]))
			 			{
			 				throw new StringCalculatorException();
			 			}
			 			else{
			 				return rezultat;
			 			}
			 		}
			 	}
			 	
			 	public int podeli(String numbersStr) throws StringCalculatorException{
			 
			 		if(numbersStr==""){
			 			return 0;
			 		}
			 		else{
			 			String  brojevi [] =numbersStr.split(",|\\\n");
			 			int duzina=brojevi.length;
			 			int rezultat=Integer.parseInt(brojevi[0]);
			 		for(int i=1;i<duzina;i++){
			 				int broj=Integer.parseInt(brojevi[i]);
			 				if(broj>0){
			 					rezultat=rezultat/broj;
			 				}
			 				else{
			 					throw new StringCalculatorException();
			 				}
			 
			 			}
			 			if(rezultat==Integer.parseInt(brojevi[0]))
			 			{
			 				throw new StringCalculatorException();
			 			}
			 			else{
			 				return rezultat;
			 			}
			 		}
		
	}
	
}
