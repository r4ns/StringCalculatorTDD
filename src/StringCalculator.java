
public class StringCalculator {
	public StringCalculator() {
		
	}
	
	public int add(String numbersStr)throws StringCalculatorException {
		checkValidString(numbersStr);
		String delimiter1 = ",";
		String delimiter2 = "\n";
		
		numbersStr = numbersStr.replaceAll(delimiter1,delimiter2);
		String [] niz1 = numbersStr.split(delimiter2);
		int [] niz = new int[niz1.length];
		
		for(int i=1;i<niz.length;i++){
			niz[i]= Integer.parseInt(niz1[i]);
		}
		
		char znak = niz1[0].charAt(0);
		
		checkNumbers(niz);
		
		int rezultat=0;
		
		if(znak == ' ')
			return Integer.valueOf(rezultat);
			
		if(znak == '+') 
			for(int i=1;i<niz.length;i++)
					rezultat += niz[i];
			
		if(znak =='-')
			for(int i=1;i<niz.length;i++){
				if(i == 1)
					rezultat = niz[i];
				else
					rezultat -= niz[i];
			}
		if(znak == '*')
			for(int i=1;i<niz.length;i++){
				if(i == 1)
					rezultat = niz[i];
				else
					rezultat *= niz[i];
			}
		if(znak == '/')
			for(int i=1;i<niz.length;i++){
				if(niz[i]==0){
					  throw new StringCalculatorException();
				}
				else if(i == 1)
					rezultat =niz[i];
				else
					rezultat /= niz[i];
			}
		return Integer.valueOf(rezultat);
	}
	
	public void checkValidString(String numbersStr)throws StringCalculatorException {
		
		char [] provera = numbersStr.toCharArray();
		char [] karakteri = {'0','1','2','3','4','5','6','7','8','9','+','-','*','/',',',' ','\n'};
		int count=0;
		for(int i=0;i<numbersStr.length();i++){
			
			if(provera[i]==',' && provera[i+1]=='\n')
				throw new StringCalculatorException();
			
			if(provera[i]=='\n' && provera[i+1]==',')
				throw new StringCalculatorException();
			
			if(provera[i]!='+' && provera[i]!='-' && provera[i]!='*' && provera[i]!='/' && provera[i] !=' ' && Integer.valueOf(provera[i])<0)
				throw new StringCalculatorException();
			
			for(int j=0;j<karakteri.length;j++){
				if(Integer.valueOf(provera[i])==karakteri[j])
					count++;
			}
		}
		if(count!=numbersStr.length())
			throw new StringCalculatorException();
	}
	
	public void checkNumbers(int [] niz)throws StringCalculatorException{
		for(int i=0;i<niz.length;i++){
			if(!(niz[i]>=0))
				throw new StringCalculatorException();
		}
	}
	
}
