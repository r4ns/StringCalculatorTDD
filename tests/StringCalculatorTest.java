import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_resultWhenSteringIsEmpty() {
		StringCalculator calculator = new StringCalculator();
		int result= calculator.add(" ");
		assertEquals("Not valid result", 0, result);
	}
	@Test
	public void test_ResultWithComas(){
		StringCalculator calculator = new StringCalculator();
		int result= calculator.add("1,2,3");
		assertEquals("Not valid result", 6 , result);
	}
	@Test
	public void test_ResultWithNewLine(){
		StringCalculator calculator = new StringCalculator();
		int result= calculator.add("1\n2\n3");
		assertEquals("Not valid result", 6 , result);
	}
	@Test
	public void test_ResultWithNewLineAndComa(){
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
