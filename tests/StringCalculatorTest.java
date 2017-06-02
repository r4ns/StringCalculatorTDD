import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAdd() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 6;
		assertEquals(rezultat,digitron.add("1,2,3"));
	}
	@Test
	public void testCharacter() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 6;
		assertEquals(rezultat,digitron.add("1\n2,3"));
	}

}
