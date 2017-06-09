import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void AddStringIsNullTest() throws StringCalculatorException {
			StringCalculator stringCalculator = new StringCalculator();
				int actual = stringCalculator.add("");
				int expected = 0;
				assertEquals(expected, actual);
		 	}
	

@Test(expected=StringCalculatorException.class)
public void AddStringIsInvalidTest() throws StringCalculatorException {
		StringCalculator stringCalculator = new StringCalculator();
		stringCalculator.add("1,fd");
	}
	
	@Test
	public void AddsCorrectlyTest() throws StringCalculatorException
	{
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.add("1,\n");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	
	/// SUBSTRACT TESTS	
	@Test
	public void SubstractStringIsNullTest() throws StringCalculatorException {
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.substract("");
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void SubstractStringIsInvalidTest() throws StringCalculatorException {
		StringCalculator stringCalculator = new StringCalculator();
		stringCalculator.substract("1,fd");
	}
	
	@Test
	public void SubstractsCorrectlyTest() throws StringCalculatorException
	{
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.substract("10,2,3\n4");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	
	
/// DIVIDE TESTS	
	@Test
	public void DivideStringIsNullTest() throws StringCalculatorException {
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.divide("");
		int expected = 0;
				assertEquals(expected, actual);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void DivideStringIsInvalidTest() throws StringCalculatorException {
		StringCalculator stringCalculator = new StringCalculator();
		stringCalculator.divide("1,fd");
	}
	
	@Test
	public void DividesCorrectlyTest() throws StringCalculatorException {
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.divide("24,2,2\n2");
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	
	
/// MULTIPLY TESTS
@Test
	public void MultiplyStringIsNullTest() throws StringCalculatorException {
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.multiply("");
	int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void MultiplyStringIsInvalidTest() throws StringCalculatorException {
		StringCalculator stringCalculator = new StringCalculator();
		stringCalculator.multiply("5,6,fds");
	}
	
	@Test
	public void MultipliesCorrectlyTest() throws StringCalculatorException {
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.multiply("5,4\n3");
		int expected = 60;
		assertEquals(expected, actual);
	}
	}