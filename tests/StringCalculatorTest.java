import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void saberi2Broja_zarez() throws StringCalculatorException{
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="2,3,4";
		int broj=kalkulator.add(numbersStr);
		assertEquals(9, broj);
		
	}
	@Test
	public void saberi2Broja_noviRed()throws StringCalculatorException{
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="2\n3\n4";
		int broj=kalkulator.add(numbersStr);
		assertEquals(9, broj);
		
	}
	@Test
	public void saberi2Broja_noviRed_zarez()throws StringCalculatorException{
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="2,3\n4";
		int broj=kalkulator.add(numbersStr);
		assertEquals(9, broj);
		
	}
	@Test(expected=StringCalculatorException.class)
	public void saberi2Broja_zarez_noviRed_jednoZaDrugim() throws StringCalculatorException {
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="2,\n";
		int broj=kalkulator.add(numbersStr);
		
	}
	@Test(expected=StringCalculatorException.class)
	public void saberi2Broja_negativanBroj() throws StringCalculatorException {
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="2,7,-9,\n";
		int broj=kalkulator.add(numbersStr);
		
	}
	@Test(expected=StringCalculatorException.class)
	public void saberi2Broja_prosledjenPrazanString() throws StringCalculatorException {
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="";
		int broj=kalkulator.add(numbersStr);
		
	}
	
	@Test
	public void pomnozi2Broja_noviRed_zarez()throws StringCalculatorException{
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="2,3\n1";
		int broj=kalkulator.multiply(numbersStr);
		assertEquals(6, broj);
		
	}
	@Test(expected=StringCalculatorException.class)
	public void pomnozi2Broja_zarez_noviRed_jednoZaDrugim() throws StringCalculatorException {
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="2,\n";
		int broj=kalkulator.multiply(numbersStr);
		
	}
	@Test
	public void oduzmi2Broja_noviRed_zarez()throws StringCalculatorException{
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="2,2\n";
		int broj=kalkulator.subtract(numbersStr);
		assertEquals(0, broj);
		
	}
	@Test(expected=StringCalculatorException.class)
	public void oduzmi2Broja_zarez_noviRed_jednoZaDrugim() throws StringCalculatorException {
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="2,\n";
		int broj=kalkulator.subtract(numbersStr);
		
	}
	@Test
	public void podeli2Broja_noviRed_zarez()throws StringCalculatorException{
		
		StringCalculator kalkulator=new StringCalculator();
		String numbersStr="6,3\n";
		float broj=kalkulator.divide(numbersStr);
		assertEquals(2, broj, 0.9);
				
	}
	
}
