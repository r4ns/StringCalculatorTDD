import java.util.ArrayList;
import java.util.Arrays;
//Zadatak radile: Ana Gligoric IT36/2015, Aleksandra Repac IT31/2015, Jovana Savic IT18/2015
public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		// Returns the sum of the numbers given in numbersStr
		//String[] separated = numbersStr.split("\n");
		String delimiter1 = ",";
		String delimiter2 = "\n";
		numbersStr = numbersStr.replaceAll(delimiter2, delimiter1);
		String[] split_string = numbersStr.split(delimiter1);
		
		
		
		if(numbersStr == " ")
			return 0;
		// not yet implemented
		
		else{
				int zbir=0;
				if(split_string.length==1)
				{
					throw new StringCalculatorException();
				}
				for(int i = 0; i<split_string.length;i++){
					if(Integer.parseInt(split_string[i])<0)
						throw new StringCalculatorException();
					zbir+=Integer.parseInt(split_string[i]);
				
			}
			return zbir;
		}
		
		
	}
	public int substract(String numbersStr) throws StringCalculatorException {
		String delimiter1 = ",";
		String delimiter2 = "\n";
		numbersStr = numbersStr.replaceAll(delimiter2, delimiter1);
		String[] split_string = numbersStr.split(delimiter1);
		
		
		
		if(numbersStr == " ")
			return 0;
		else{
			int rezultat=0;
			if(split_string.length==1)
			{
				throw new StringCalculatorException();
			}
			for(int i = 0; i<split_string.length;i++){
				if (i == 0)
					rezultat =Integer.parseInt( split_string[0]);
				if(Integer.parseInt(split_string[i])<0)
					throw new StringCalculatorException();
				if(i>0)
					rezultat-=Integer.parseInt(split_string[i]);
			
		}
		return rezultat;
	}
		
}
	public int product(String numberStr) throws StringCalculatorException{
		String delimiter1 = ",";
		String delimiter2 = "\n";
		 numberStr = numberStr.replaceAll(delimiter2, delimiter1);
		String[] split_string = numberStr.split(delimiter1);
		
		
		
		if(numberStr == " ")
			return 0;
		else{
			int rezultat=1;
			if(split_string.length==1)
			{
				throw new StringCalculatorException();
			}
			for(int i = 0; i<split_string.length;i++){
				if(Integer.parseInt(split_string[i])<0)
					throw new StringCalculatorException();
				rezultat*=Integer.parseInt(split_string[i]);
			
		}
		return rezultat;
	}
}
	public int division(String numbersStr) throws StringCalculatorException{
		String delimiter1 = ",";
		String delimiter2 = "\n";
		 numbersStr = numbersStr.replaceAll(delimiter2, delimiter1);
		String[] split_string = numbersStr.split(delimiter1);
		
		
		
		if(numbersStr == " ")
			return 0;
		else{
			int rezultat=0;
			if(split_string.length==1)
			{
				throw new StringCalculatorException();
			}
			for(int i = 0; i<split_string.length;i++){
				if (i == 0)
					rezultat =Integer.parseInt( split_string[0]);
				if(Integer.parseInt(split_string[i])<0)
					throw new StringCalculatorException();
				if(i>0)
					rezultat/=Integer.parseInt(split_string[i]);
			
		}
		return rezultat;
	}
}
}
