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
}
