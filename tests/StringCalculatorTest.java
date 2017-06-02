import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAdd() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 6;
		assertEquals(rezultat,digitron.add("1,2,3"));
	}

}
