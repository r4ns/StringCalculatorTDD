public class StringCalculator {

	public int add(String numbersStr) throws StringCalculatorException{

		int score = 0;

		if(numbersStr == "")
			return 0;
		else {
			String stringArray[] = numbersStr.split("\n|\\,");
			
			if(stringArray.length == 1)
				throw new StringCalculatorException();

			for(int i=0; i<stringArray.length; i++){
				
				int x = Integer.parseInt(stringArray[i]);
				if(x<0)
					throw new StringCalculatorException();
				score += x;
			}
			return score;
		}
	}


	public int subtract(String numbersStr) throws StringCalculatorException{

		int score = 0;

		if(numbersStr == "")
			return 0;
		
		else {
			
			String stringArray[] = numbersStr.split("\n|\\,");

			if(stringArray.length == 1)
				throw new StringCalculatorException();

			for(int i=0; i<stringArray.length; i++){

				if(Integer.parseInt(stringArray[i])<0)
					throw new StringCalculatorException();
			}
			
			score = Integer.parseInt(stringArray[0]);
			for(int i=1; i<stringArray.length; i++)
				score -= Integer.parseInt(stringArray[i]);

			return score;
		}
	}


	public int divide(String numbersStr) throws StringCalculatorException{

		double score;

		if(numbersStr == "")
			return 0;
		
		else {

			String stringArray[] = numbersStr.split("\n|\\,");
			score = Integer.parseInt(stringArray[0]);
			
			if(score < 0)
				throw new StringCalculatorException();
			
			if(stringArray.length == 1)
				throw new StringCalculatorException();
			
			for(int i=1; i<stringArray.length; i++){
				
				double x = Integer.parseInt(stringArray[i]);
				if(x < 0)
					throw new StringCalculatorException();

				score /= x;
			}
			return (int) score;
		}
	}


	public int multiplicate(String numbersStr) throws StringCalculatorException{

		int score = 0;

		if(numbersStr == "")
			return 0;
		else {

			String stringArray[] = numbersStr.split("\n|\\,");
			
			if(stringArray.length == 1)
				throw new StringCalculatorException();
			
			score = Integer.parseInt(stringArray[0]);
			
			if(score < 0)
				throw new StringCalculatorException();
			
			for(int i=1; i<stringArray.length; i++){
				
				int x = Integer.parseInt(stringArray[i]);
				if(x < 0)
					throw new StringCalculatorException();
				
				score *= x;
			}
			return score;
		}
	}
}