
public class StringCalculator {
	public float add(String numbersStr) throws StringCalculatorException{
		return operacija(numbersStr, 1);
	}
	
	public float oduzmi(String numbersStr) throws StringCalculatorException{
		return operacija(numbersStr, 2);
	}
	
	public float mnozi(String numbersStr) throws StringCalculatorException{
		return operacija(numbersStr, 3);
	}
	
	public float deli(String numbersStr) throws StringCalculatorException{
		return operacija(numbersStr, 4);
	}
	
	public float operacija(String numbersStr, int operacija) throws StringCalculatorException{
			// Returns the sum of the numbers given in numbersStr
			//System.out.println("TEST");
			if(numbersStr != ""){
				String brojevi[] = numbersStr.split("," );
				//System.out.println(numbersStr);
				for(int i = 0; i < numbersStr.length() - 1; i++){
					//System.out.println("!:" + numbersStr.substring(i, i+2));
					if(numbersStr.substring(i, i+2).equals(",\n") || numbersStr.substring(i, i+2).equals("\n,")){
						
						throw new StringCalculatorException();
					}
					
				}
				
				
				float rez = 0;
				if(operacija == 3)
					rez = 1;
				boolean prvi = false;
				
				for(String broj : brojevi){
					String brojevi2[] = broj.split("\n");
					
					for(String broj1 : brojevi2){
						if (prvi == false && operacija == 2){
							rez = Float.parseFloat(broj1) * 2;
							prvi = true;
						}
						if (prvi == false && operacija == 4){
							rez = Float.parseFloat(broj1) * Float.parseFloat(broj1);
							prvi = true;
						}
						
						try {
							if(Float.parseFloat(broj1) < 0)
								throw new StringCalculatorException();
							switch(operacija){
							case 1:
								rez += Float.parseFloat(broj1);
								break;
							case 2:
								rez -= Float.parseFloat(broj1);
								break;
							case 3:
								rez *= Float.parseFloat(broj1);
								break;
							case 4:
								rez /= Float.parseFloat(broj1);
								break;
							}
	
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							 throw new StringCalculatorException();
						}
					}
					
				}
				return rez;
			}
			// not yet implemented
			return 0;
	}
}
