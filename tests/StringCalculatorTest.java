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
	public void test_AddNumbersZarez() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.add("1,2,3");
		assertEquals(6, result);		
	}
	
	@Test
	public void testAddNumbersNoviRed() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.add("1\n2\n3");
		assertEquals(6, result);
	}
	
	@Test
	public void testAddNumbersZarezNoviRed() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result = calculator.add("1,2\n3");
		assertEquals(6, result);
	}

}
