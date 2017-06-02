
public class StringCalculator {
	
	public StringCalculator(){
		
	}
	
	public int add(String numbersStr) throws StringCalculatorException {
		
		int sum=0;
		int brojac=0;
		
		if(numbersStr == "" ){
			
			return 0;
		}
		
		String stringArray[] = numbersStr.split(",|\\\n");
		
		
		for(int i=0;i<stringArray.length;i++)
		{
			if(Integer.parseInt(stringArray[i])<0)
			{
				throw new StringCalculatorException("Nije moguæe vršiti datu operaciju sa negativnim brojevima");
			}
			sum += Integer.parseInt(stringArray[i]);
			brojac++;
		}
		
		if(brojac==1)
		{
			throw new StringCalculatorException("Nije validan unos");
		}
		return sum;
	}

	public int oduzmi(String numbersStr) throws StringCalculatorException {
		int sum = 0;
		int brojac=0;
		
		if(numbersStr == "" ){
			
			return 0;
		}
		
		String stringArray[] = numbersStr.split(",|\\\n");
		
		for(int i=0;i<stringArray.length;i++)
		{
			if(Integer.parseInt(stringArray[i])<0)
			{
				throw new StringCalculatorException("Nije moguæe vršiti datu operaciju sa negativnim brojevima");
			}
			if(i==0)
			{
				sum=Integer.parseInt(stringArray[0]);
				brojac++;
				continue;
			}
			sum -= Integer.parseInt(stringArray[i]);
			brojac++;
			
			if(sum<0){
				throw new StringCalculatorException("Razlika je negativna");
			}
		
		}
		
		if(brojac==1)
		{
			throw new StringCalculatorException("Nije validan unos");
		}
		
		
		return sum;
	}

	public int pomnozi(String numbersStr) throws StringCalculatorException {
		
		int sum = 1;
		int brojac=0;
		
		if(numbersStr=="")
		{
			return 0;
		}
		
		String stringArray[] = numbersStr.split(",|\\\n");
		
		for(int i=0;i<stringArray.length;i++)
		{
			if(Integer.parseInt(stringArray[i])<0)
			{
				throw new StringCalculatorException("Nije moguæe vršiti datu operaciju sa negativnim brojevima");
			}
	
			sum *= Integer.parseInt(stringArray[i]);
			brojac++;
		}
		
		if(brojac==1)
		{
			throw new StringCalculatorException("Nije validan unos");
		}
		
		return sum;
	}

	public double podeli(String numbersStr) throws StringCalculatorException {
		
		double sum=1;
		int brojac=0;
		
		if(numbersStr=="")
		{
			return 0;
		}
		
		String stringArray[] = numbersStr.split(",|\\\n");
		
		for(int i=0;i<stringArray.length;i++)
		{
			if(Double.parseDouble(stringArray[i])<0)
			{
				throw new StringCalculatorException("Nije moguæe vršiti datu operaciju sa negativnim brojevima");
			}
			if(i==0)
			{
				sum=Double.parseDouble(stringArray[i]);
				brojac++;
				continue;
			}
			
			sum = sum / Double.parseDouble(stringArray[i]);
			brojac++;
			
		}
	
		if(brojac==1)
		{
			throw new StringCalculatorException("Nije validan unos");
		}
		
		return sum;
	}
}
