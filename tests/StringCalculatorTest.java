import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	
	@Test
	public void test_multipication_with_0() throws StringCalculatorException {

		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.multiplicate(""));
	
	}
	
	@Test
	public void test_simple_multiplication() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(16,calc.multiplicate("8,2"));

	}
	
	@Test 
	public void test_multiplication_with_complex_input() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		assertEquals(64,calc.multiplicate("8\n4,2"));
	}
	
	
	@Test (expected=StringCalculatorException.class)
	public void test_multiplication_for_invalid_input() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.multiplicate("1,\n");
	
	}
	
	@Test (expected=StringCalculatorException.class)
	public void test_exception_for_negative_number_as_input() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("-1,2");
	}
	
	@Test
	public void test_division_with_0() throws StringCalculatorException {

		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.divide(""));
	}
	
	@Test
	public void test_simple_division() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(4,calc.divide("8,2"));

	}
	
	@Test 
	public void test_division_with_complex_input() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		assertEquals(1,calc.divide("8\n4,2"));
	}
	
	
	@Test
	public void test_subtraction_with_0() throws StringCalculatorException {

		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.subtract(""));
	}
	
	@Test
	public void test_simple_subtraction() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(1,calc.subtract("3,2"));

	}
	
	@Test
	public void test_subtraction_with_complex_input() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(-3,calc.subtract("10,5,8"));

	}
	
	
	@Test 
	public void test_subtraction_with_more_complex_input() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		assertEquals(-25,calc.subtract("1\n23,3"));

	}
	
	@Test (expected=StringCalculatorException.class)
	public void test_exception_for_invalid_input() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.subtract("1,\n");
	
	}
	

	@Test
	public void test_addition_with_0() throws StringCalculatorException {

		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.add(""));
	}

	@Test
	public void test_simple_addition() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(3,calc.add("1,2"));

	}

	@Test
	public void test_complex_addition() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(6,calc.add("1,2,3"));

	}

	@Test 
	public void test_more_complex_addition() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		assertEquals(27,calc.add("1\n23,3"));
	}
}