import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() throws StringCalculatorException {
		
		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.add(""));
	}
	
	@Test
	public void testString() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		assertEquals(5,calc.add("2,3"));
		
	}
	
	@Test
	public void testString2() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		assertEquals(10,calc.add("2\n,3,5"));
		
	}
	
	
	
	@Test(expected=StringCalculatorException.class)
	public void testString3() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.add("1\n");
		
		
		
	}
	
	
	

}
