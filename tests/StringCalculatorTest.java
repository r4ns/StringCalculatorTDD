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
	public void test_CalculatorConstructor() {
		StringCalculator calculator = new StringCalculator();
		assertNotNull(calculator);
	}
	
	@Test (expected = StringCalculatorException.class)
	public void test_StringNullException() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		calculator.add("");
	}
	
	@Test (expected = StringCalculatorException.class) 
	public void test_StringNegativeException() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		calculator.add("-7");
	}
	
	@Test
	public void test_AddZarez() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.add("1,2,3");
		assertEquals(6, result);		
	}
	
	@Test
	public void test_AddNoviRed() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.add("1\n2\n3");
		assertEquals(6, result);
	}
	
	@Test
	public void test_AddNumbersZarezNoviRed() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.add("1,2\n3");
		assertEquals(6, result);
	}
	
	@Test
	public void test_MultiplyZarezNoviRed() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.multiply("1,2\n3");
		assertEquals(6, result);
	}
	
	@Test
	public void test_SubstractZarezNoviRed() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.substract("5,5\n");
		assertEquals(0, result);
	}
	
	@Test
	public void test_DivideZarezNoviRed() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		float result = calculator.divide("8,2\n");
		assertEquals(4, result, 0.1);
	}
	
	@Test (expected = StringCalculatorException.class)
	public void test_AddNegativanBroj() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.add("1,3\n-7");
	}
	
	@Test (expected = StringCalculatorException.class)
	public void test_MultiplyNegativanBroj() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.multiply("1,3\n-7");
	}
	
	@Test (expected = StringCalculatorException.class)
	public void test_SubstractNegativanBroj() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.substract("1,3\n-7");
	}
	
	@Test (expected = StringCalculatorException.class)
	public void test_DivideNegativanBroj() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		float result = calculator.substract("1,3\n-7");
	}

}
