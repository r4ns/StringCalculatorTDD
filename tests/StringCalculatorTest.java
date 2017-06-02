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
	/*@Test
	public void testSpace() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 0;
		assertEquals(rezultat,digitron.add(""));
	}*/
	@Test
	public void testAddjustOnenumber() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 123;
		assertEquals(rezultat,digitron.add("123"));
	}
	@Test(expected=StringCalculatorException.class)
	public void testAddExceptionMinus() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.add("-1,2,3");
	}
	@Test(expected=StringCalculatorException.class)
	public void testAddExceptionn() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.add("1,\n");
	}
	@Test(expected=StringCalculatorException.class)
	public void testAddExceptionn2() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.add("1\n,");
	}

}
