import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator sc;
	
	@Test
	public void testAddingNumbersIfEmptyString () throws StringCalculatorException{
		String input = "";
		sc = new StringCalculator();
		assertEquals(0, sc.add(input));
	}
	
	@Test
	public void testAddingNumbersWithComma() throws StringCalculatorException{
		String input = "5,5,5";
		sc = new StringCalculator();
		assertEquals(15, sc.add(input));
	}
	
	@Test
	public void testAddingNumbersWithNewLine() throws StringCalculatorException{
		String input = "5\n5\n5";
		sc = new StringCalculator();
		assertEquals(15, sc.add(input));
	}
	
	@Test
	public void testAddingNumbersWithBothDelimiters () throws StringCalculatorException {
		String input = "5,6\n9";
		sc = new StringCalculator();
		assertEquals(20, sc.add(input));
	}
	
	@Test(expected = StringCalculatorException.class)
	public void testAddingNumbersBothDelimitersError() throws StringCalculatorException {
		String input = "5,\n5\n5";
		sc = new StringCalculator();
		sc.add(input);
	}
	
	@Test
	public void testSubstractNumbersIfEmptyString () throws StringCalculatorException{
		String input = "";
		sc = new StringCalculator();
		assertEquals(0, sc.substract(input));
	}
	
	@Test
	public void testSubstractNumbersWithComma() throws StringCalculatorException{
		String input = "20,5,5";
		sc = new StringCalculator();
		assertEquals(10, sc.substract(input));
	}
	
	@Test
	public void testSubstractNumbersWithNewLine() throws StringCalculatorException{
		String input = "20\n5\n5";
		sc = new StringCalculator();
		assertEquals(10, sc.substract(input));
	}
	
	@Test
	public void testSubstractNumbersWithBothDelimiters () throws StringCalculatorException {
		String input = "20,6\n9";
		sc = new StringCalculator();
		assertEquals(5, sc.substract(input));
	}
	
	@Test(expected = StringCalculatorException.class)
	public void testSubstractNumbersBothDelimitersError() throws StringCalculatorException {
		String input = "20,\n5\n5";
		sc = new StringCalculator();
		sc.substract(input);
	}
	
	@Test
	public void testMultiplyNumbersIfEmptyString () throws StringCalculatorException{
		String input = "";
		sc = new StringCalculator();
		assertEquals(0, sc.multiply(input));
	}
	
	@Test
	public void testMultiplyNumbersWithComma() throws StringCalculatorException{
		String input = "5,5,5";
		sc = new StringCalculator();
		assertEquals(125, sc.multiply(input));
	}
	
	@Test
	public void testMultiplyNumbersWithNewLine() throws StringCalculatorException{
		String input = "5\n5\n5";
		sc = new StringCalculator();
		assertEquals(125, sc.multiply(input));
	}
	
	@Test
	public void testMultiplyNumbersWithBothDelimiters () throws StringCalculatorException {
		String input = "5,5\n5";
		sc = new StringCalculator();
		assertEquals(125, sc.multiply(input));
	}
	
	@Test(expected = StringCalculatorException.class)
	public void testMultiplyNumbersBothDelimitersError() throws StringCalculatorException {
		String input = "5,\n5\n5";
		sc = new StringCalculator();
		sc.multiply(input);
	}
	
	@Test
	public void testDivideNumbersIfEmptyString () throws StringCalculatorException{
		String input = "";
		sc = new StringCalculator();
		assertEquals(0, sc.divide(input));
	}
	
	@Test
	public void testDivideNumbersWithComma() throws StringCalculatorException{
		String input = "125,5,5";
		sc = new StringCalculator();
		assertEquals(5, sc.divide(input));
	}
	
	@Test
	public void testDivideNumbersWithNewLine() throws StringCalculatorException{
		String input = "125\n5\n5";
		sc = new StringCalculator();
		assertEquals(5, sc.divide(input));
	}
	
	@Test
	public void testDivideNumbersWithBothDelimiters () throws StringCalculatorException {
		String input = "125,5\n5";
		sc = new StringCalculator();
		assertEquals(5, sc.divide(input));
	}
	
	@Test(expected = StringCalculatorException.class)
	public void testDivideNumbersBothDelimitersError() throws StringCalculatorException {
		String input = "125,\n5\n5";
		sc = new StringCalculator();
		sc.divide(input);
	}
	


}