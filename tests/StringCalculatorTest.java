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
	public void testAddWithnCharacter() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 6;
		assertEquals(rezultat,digitron.add("1\n2,3"));
	}
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
	@Test
	public void testOduzmiPocetak() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 0;
		assertEquals(rezultat,digitron.oduzmi(""));
	}
	@Test
	public void testOduzmiBrojeviSaZarezom() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 3;
		assertEquals(rezultat,digitron.oduzmi("5,1,1"));
	}
	@Test
	public void testOduzmiBrojeviSan() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 3;
		assertEquals(rezultat,digitron.oduzmi("5\n1,1"));
	}
	@Test(expected=StringCalculatorException.class)
	public void testMinusExceptionMinus() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.oduzmi("-1,2,3");
	}
	@Test(expected=StringCalculatorException.class)
	public void testMinusExceptionn() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.oduzmi("1,\n");
	}
	@Test(expected=StringCalculatorException.class)
	public void testMinusExceptionn2() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.oduzmi("1\n,");
	}
	@Test(expected=StringCalculatorException.class)
	public void testMinusKadRezultatIdeUMinus() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.oduzmi("5,1,6");
	}
	@Test
	public void testPomnozi() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 0;
		assertEquals(rezultat,digitron.pomnozi(""));
	}
	@Test
	public void testPomnoziSaZarezom() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 6;
		assertEquals(rezultat,digitron.pomnozi("1,2,3"));
	}
	@Test
	public void testPomnoziSaCharactern() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 6;
		assertEquals(rezultat,digitron.pomnozi("1\n2,3"));
	}
	@Test(expected=StringCalculatorException.class)
	public void testPomnoziExceptionMinus() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.pomnozi("-1,2,3");
	}
	@Test(expected=StringCalculatorException.class)
	public void testPomnoziExceptionn() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.pomnozi("1,\n");
	}
	@Test(expected=StringCalculatorException.class)
	public void testPomnoziExceptionn2() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.pomnozi("1\n,");
	}

}
