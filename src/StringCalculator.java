
public class StringCalculator {

	public int add(String numbersStr) throws StringCalculatorException{

		int sum=0;


		if(numbersStr == ""){

			return 0;
		} else {

			//String stringArray[] = numbersStr.split("\\s*,\\s*");

			String stringArray[] = numbersStr.split("\n|\\,");
			if(stringArray.length == 1){

				throw new StringCalculatorException();
			}

			for(int i=0; i<stringArray.length; i++){


				int x = Integer.parseInt(stringArray[i]);
				if(x<0){

					throw new StringCalculatorException();
				}
				sum = sum + x;

			}

			return sum;
		}

	}


	public int minus(String numbersStr) throws StringCalculatorException{

		int result = 0;

		if(numbersStr == ""){

			return 0;


		} else {



			String stringArray[] = numbersStr.split("\n|\\,");

			if(stringArray.length == 1){

				throw new StringCalculatorException();
			}

			for(int i=0; i<stringArray.length; i++){

				if(Integer.parseInt(stringArray[i])<0){

					throw new StringCalculatorException();
				}


			}
			result = Integer.parseInt(stringArray[0]);
			for(int i=1; i<stringArray.length; i++){

				result = result - Integer.parseInt(stringArray[i]);


			}

			return result; 


		}



	}


	public int divide(String numbersStr) throws StringCalculatorException{

		double result;

		if(numbersStr == ""){

			return 0;

		} else {

			String stringArray[] = numbersStr.split("\n|\\,");
			result = Integer.parseInt(stringArray[0]);
			if(result<0){
				
				throw new StringCalculatorException();
			}
			if(stringArray.length == 1){

				throw new StringCalculatorException();
			}
			for(int i=1; i<stringArray.length; i++){



				double x = Integer.parseInt(stringArray[i]);
				if(x<0){

					throw new StringCalculatorException();
				}

				result = result/x;
			}

			return (int) result;


		}






	}


	public int mnozi(String numbersStr) throws StringCalculatorException{

		int result = 0;

		if(numbersStr == ""){

			return 0;

		} else {

			String stringArray[] = numbersStr.split("\n|\\,");
			
			if(stringArray.length == 1){
				
				throw new StringCalculatorException();
			}
			result = Integer.parseInt(stringArray[0]);
			
			if(result < 0){
				
				throw new StringCalculatorException();
			}
			for(int i=1; i<stringArray.length; i++){
				
				

				int x = Integer.parseInt(stringArray[i]);
				if(x<0){
					
					throw new StringCalculatorException();
				}
				result = result*x;
				
			}
			
			return result;

		}

		




	}










	// not yet implemented

}


