
public class StringCalculator {
	public double add(String numbersStr) {
		String s[] = numbersStr.split(",");
		String znak=s[0];
		double suma;
		switch(znak){
			case "+":
				suma=0;
				break;
			case "-":
				suma=Integer.parseInt(s[1]);
				break;
			case "*":
				suma=1;
				break;
			case "/":
				suma=Integer.parseInt(s[1]);
				break;
			default:
				suma=0;
		}
		switch(znak){
		case "+":
			for(int i=1;i<s.length;i++){
				suma+=Double.parseDouble(s[i]);
			}
			break;
		case "-":
			for(int i=2;i<s.length;i++){
				suma-=Double.parseDouble(s[i]);
			}
			break;
		case "/":
			for(int i=2;i<s.length;i++){
				suma/=Double.parseDouble(s[i]);
			}
			break;
		case "*":
			for(int i=1;i<s.length;i++){
				suma*=Double.parseDouble(s[i]);
			}
			break;
		}
		// not yet implemented
		return suma;
	}
}
