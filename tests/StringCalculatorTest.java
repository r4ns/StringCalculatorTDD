import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void testKonstruktor() throws StringCalculatorException {
		
		StringCalculator calculator = new StringCalculator();
		
		assertNotNull(calculator);
	}
	
	@Test
	public void testSaberiBrojeveSaZarezom() throws StringCalculatorException{
		
		StringCalculator calculator = new StringCalculator();
		String numberStr = "2,3,4";
		int broj = calculator.add(numberStr);
		assertEquals(9, broj);
		
	}
	
	@Test
	public void testSaberiBrojeveSaCrtaN() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "1\n2,3,1,1";
		int broj = calculator.add(numberStr);
		assertEquals(8, broj);
	}
	@Test
	public void testSaberiSaKosaCrtaNNaKraju() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		String numberStr = "1,2,3\n";
		int broj = calculator.add(numberStr);
		assertEquals(6, broj);
	}
	
	@Test (expected=StringCalculatorException.class)
	public void testException() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "1,\n";
		int broj = calculator.add(numberStr);
		
	}
	
	@Test (expected=StringCalculatorException.class)
	public void testExceptionNegativanBroj() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "-1,2";
		int broj = calculator.add(numberStr);
		
	}
	
	@Test (expected=StringCalculatorException.class)
	public void testExceptionPrazanString() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = " ";
		int broj = calculator.add(numberStr);
	}
	
	@Test 
	public void testPomnoziDvaBroja() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "1,3";
		int broj = calculator.pomnozi(numberStr);
		assertEquals(3, broj);
	}
	
	
	@Test (expected=StringCalculatorException.class)
	public void testExceptionMnozenje() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "5,\n";
		int broj = calculator.pomnozi(numberStr);
		
	}
	
	@Test (expected=StringCalculatorException.class)
	public void testExceptionMnozenjeNegativno() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "-5,7";
		int broj = calculator.pomnozi(numberStr);
	}
	
	@Test 
	public void testOduzimanje() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "7,2";
		int broj = calculator.oduzmi(numberStr);
		assertEquals("",5,broj);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testOduzimanjeException() throws StringCalculatorException 
	{
		StringCalculator calculator = new StringCalculator();
		String numberStr = "7,\n";
		int broj = calculator.oduzmi(numberStr);			
				
	}
	
	@Test (expected=StringCalculatorException.class)
	public void testOduzmiexceptionMinus() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "-6,5";
		int broj = calculator.oduzmi(numberStr);
	}
	
	
	@Test
	public void testDeljenje() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "6,3\n";
		float broj = calculator.podeli(numberStr);
		assertEquals(2, broj, 0.9);
	}
	
	
	@Test (expected=StringCalculatorException.class)
	public void testExceptionDeljenje() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "6,\n";
		float broj = calculator.podeli(numberStr);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testDeljenjeException() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		String numberStr = "-4, 2";
		float broj = calculator.podeli(numberStr);
		
	}
	
	
	
	
	
	
	
}
