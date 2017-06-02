import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		
		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.add(""));
		
	}

}
