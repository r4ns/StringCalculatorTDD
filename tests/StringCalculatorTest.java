import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		
		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.add(""));
	}
	
	@Test
	public void testString(){
		
		StringCalculator calc = new StringCalculator();
		assertEquals(5,calc.add("2,3"));
		
	}
	
	@Test
	public void testString2(){
		
		StringCalculator calc = new StringCalculator();
		assertEquals(10,calc.add("2\n,3,5"));
		
	}
	
	

}
