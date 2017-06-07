import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_resultWhenSteringIsEmpty() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result= calculator.add(" ");
		assertEquals("Not valid result", 0, result);
	}
	@Test
	public void test_ResultWithComas() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.add("1,2,3");
		assertEquals("Not valid result", 6 , result);
	}
	@Test
	public void test_ResultWithNewLine() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.add("1\n2\n3");
		assertEquals("Not valid result", 6 , result);
	}
	@Test
	public void test_ResultWithNewLineAndComa() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.add("1,2\n3");
		assertEquals("Not valid result", 6 , result);
	}
	@Test (expected=StringCalculatorException.class)
	public void test_exceptionOneNumber() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.add("1,");
		
	}
	@Test (expected=StringCalculatorException.class)
	public void test_exceptionNegativeNumber() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.add("-1,2,3");
		
	}
	@Test
	public void test_resultWhenSteringIsEmpty_substract() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result= calculator.substract(" ");
		assertEquals("Not valid result", 0, result);
	}
	@Test
	public void test_ResultWithComas_substract() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.substract("1,2,3");
		assertEquals("Not valid result", -4 , result);
	}
	@Test
	public void test_ResultWithNewLine_substract() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.substract("1\n2\n3");
		assertEquals("Not valid result", -4 , result);
	}
	@Test
	public void test_ResultWithNewLineAndComa_substract() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.substract("1,2\n3");
		assertEquals("Not valid result", -4 , result);
	}
	@Test (expected=StringCalculatorException.class)
	public void test_exceptionOneNumber_substract() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.substract("1,");
		
	}
	@Test (expected=StringCalculatorException.class)
	public void test_exceptionNegativeNumber_substract() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.substract("-1,2,3");
		
	}
	@Test
	public void test_resultWhenSteringIsEmpty_product() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result= calculator.product(" ");
		assertEquals("Not valid result", 0, result);
	}
	@Test
	public void test_ResultWithComas_product() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.product("1,2,3");
		assertEquals("Not valid result", 6 , result);
	}
	@Test
	public void test_ResultWithNewLine_product() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.product("1\n2\n3");
		assertEquals("Not valid result", 6 , result);
	}
	@Test
	public void test_ResultWithNewLineAndComa_product() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.product("1,2\n3");
		assertEquals("Not valid result", 6 , result);
	}
	@Test (expected=StringCalculatorException.class)
	public void test_exceptionOneNumber_product() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.product("1,");
		
	}
	@Test (expected=StringCalculatorException.class)
	public void test_exceptionNegativeNumber_product() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.product("-1,2,3");
		
	}
	@Test
	public void test_resultWhenSteringIsEmpty_division() throws StringCalculatorException {
		StringCalculator calculator = new StringCalculator();
		int result= calculator.division(" ");
		assertEquals("Not valid result", 0, result);
	}
	@Test
	public void test_ResultWithComas_division() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.division("10,5,2");
		assertEquals("Not valid result", 1 , result);
	}
	@Test
	public void test_ResultWithNewLine_division() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.division("10\n5\n2");
		assertEquals("Not valid result", 1 , result);
	}
	@Test
	public void test_ResultWithNewLineAndComa_division() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.division("10,5\n2");
		assertEquals("Not valid result",1 , result);
	}
	@Test (expected=StringCalculatorException.class)
	public void test_exceptionOneNumber_division() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.division("1,");
		
	}
	@Test (expected=StringCalculatorException.class)
	public void test_exceptionNegativeNumber_division() throws StringCalculatorException{
		StringCalculator calculator = new StringCalculator();
		int result= calculator.division("-1,2,3");
		
	}
	
}
