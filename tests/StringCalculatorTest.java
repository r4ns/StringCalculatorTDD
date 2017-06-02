import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() throws StringCalculatorException {
		
		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.add(""));
	}
	
	@Test
	public void test2() throws StringCalculatorException {
		
		StringCalculator calc = new StringCalculator();
		assertEquals(10,calc.add("5,5"));
	}
	@Test
	public void test3() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(10, calc.add("1\n5,4"));
		
	}
	
	@Test(expected=StringCalculatorException.class)
	public void test4() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.add("-5,1");
		
	}
	
	@Test
	public void test5() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		assertEquals(1, calc.add("1"));
		
	}
	
	@Test
	public void test6() throws StringCalculatorException
	{
		StringCalculator calc = new StringCalculator();
		assertEquals(10, calc.subtraction("20,10"));
	}

}
