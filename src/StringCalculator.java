
public class StringCalculator {
	private String[] nizBrojeva;
	private double rez = 0;
	
	public double add(String numbersStr) throws StringCalculatorException {
		for (int i = 0; i < numbersStr.length() - 1; i++) {
			if (numbersStr.substring(i, i+2).equals(",\n") || numbersStr.substring(i, i+2).equals("\n,")) {
				throw new StringCalculatorException();
			}
		}
		if (numbersStr != "") {
			this.nizBrojeva = numbersStr.split(",|\\\n");
			int[] niz = new int[nizBrojeva.length];
			for (int i = 0; i < nizBrojeva.length; i++) {
				niz[i] = Integer.parseInt(nizBrojeva[i]);
			}
			for (int i = 0; i < niz.length; i++) {
				if (niz[i] <= 0) {
					throw new StringCalculatorException();
				}
				rez = rez + niz[i];
			}
			return rez;
		}
		else {
			return 0;
		}
	}
	
	public double oduzmi (String numbersStr) throws StringCalculatorException {
		for (int i = 0; i < numbersStr.length() - 1; i++) {
			if (numbersStr.substring(i, i+2).equals(",\n") || numbersStr.substring(i, i+2).equals("\n,")) {
				throw new StringCalculatorException();
			}
		}
		if (numbersStr != "") {
			this.nizBrojeva = numbersStr.split(",|\\\n");
			int[] niz = new int[nizBrojeva.length];
			for (int i = 0; i < nizBrojeva.length; i++) {
				niz[i] = Integer.parseInt(nizBrojeva[i]);
			}
			rez = niz[0];
			for (int i = 1; i < niz.length; i++) {
				if (niz[i] <= 0 || niz[0] <= 0) {
					throw new StringCalculatorException();
				}
				else if (niz[i] > niz[i-1]) {
					throw new StringCalculatorException();
				}
				rez = rez - niz[i];
			}
			return rez;
		}
		else {
			return 0;
		}
	}
	
	public double podeli (String numbersStr) throws StringCalculatorException {
		for (int i = 0; i < numbersStr.length() - 1; i++) {
			if (numbersStr.substring(i, i+2).equals(",\n") || numbersStr.substring(i, i+2).equals("\n,")) {
				throw new StringCalculatorException();
			}
		}
		if (numbersStr != "") {
			this.nizBrojeva = numbersStr.split(",|\\\n");
			int[] niz = new int[nizBrojeva.length];
			for (int i = 0; i < nizBrojeva.length; i++) {
				niz[i] = Integer.parseInt(nizBrojeva[i]);
			}
			rez = niz[0];
			for (int i = 1; i < niz.length; i++) {
				if (niz[i] <= 0 || niz[0] <= 0) {
					throw new StringCalculatorException();
				}
				rez = rez / niz[i];
			}
			return rez;
		}
		else {
			return 0;
		}
	}
	
	public double pomnozi(String numbersStr) throws StringCalculatorException {
		rez = 1;
		for (int i = 0; i < numbersStr.length() - 1; i++) {
			if (numbersStr.substring(i, i+2).equals(",\n") || numbersStr.substring(i, i+2).equals("\n,")) {
				throw new StringCalculatorException();
			}
		}
		if (numbersStr != "") {
			this.nizBrojeva = numbersStr.split(",|\\\n");
			int[] niz = new int[nizBrojeva.length];
			for (int i = 0; i < nizBrojeva.length; i++) {
				niz[i] = Integer.parseInt(nizBrojeva[i]);
			}
			for (int i = 0; i < niz.length; i++) {
				if (niz[i] <= 0) {
					throw new StringCalculatorException();
				}
				rez = rez * niz[i];
			}
			return rez;
		}
		else {
			return 0;
		}
	}
}
