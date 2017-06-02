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
	public void testAdd2() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 8;
		assertEquals(rezultat,digitron.add("3,2,3"));
	}
	@Test
	public void testChar() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 6;
		assertEquals(rezultat,digitron.add("1\n2,3"));
	}

}
