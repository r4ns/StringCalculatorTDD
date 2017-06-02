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
	@Test
	public void testSpace() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 0;
		assertEquals(rezultat,digitron.add(""));
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
	public void testsubtraction() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 0;
		assertEquals(rezultat,digitron.subtraction(""));
	}
	@Test
	public void testsubtractionJednostavno() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 3;
		assertEquals(rezultat,digitron.subtraction("5,1,1"));
	}
	@Test
	public void testsubtractionSan() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 3;
		assertEquals(rezultat,digitron.subtraction("5\n1,1"));
	}
	@Test(expected=StringCalculatorException.class)
	public void testMinusExceptionMinus() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.subtraction("-1,2,3");
	}
	@Test(expected=StringCalculatorException.class)
	public void testMinusExceptionn() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.subtraction("1,\n");
	}
	@Test(expected=StringCalculatorException.class)
	public void testMinusExceptionn2() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.subtraction("1\n,");
	}
	@Test(expected=StringCalculatorException.class)
	public void testMinusKadRezultatIdeUMinus() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.subtraction("5,1,6");
	}
	@Test
	public void testmultiplication() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 0;
		assertEquals(rezultat,digitron.multiplication(""));
	}
	@Test
	public void testmultiplicationSaZarezom() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 6;
		assertEquals(rezultat,digitron.multiplication("1,2,3"));
	}
	@Test
	public void testmultiplicationSaCharactern() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		int rezultat = 6;
		assertEquals(rezultat,digitron.multiplication("1\n2,3"));
	}
	@Test(expected=StringCalculatorException.class)
	public void testmultiplicationExceptionMinus() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.multiplication("-1,2,3");
	}
	@Test(expected=StringCalculatorException.class)
	public void testmultiplicationExceptionn() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.multiplication("1,\n");
	}
	@Test(expected=StringCalculatorException.class)
	public void testmultiplicationExceptionn2() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		digitron.multiplication("1\n,");
	}

	@Test
	public void testdevide() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		float rezultat = 0;
		
		//assertEquals(rezultat,digitron.devide(""));
		assertEquals(rezultat,digitron.devide("") );
	}
	@Test
	public void testdevideJednostavno() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		double rezultat = 0.2;
		assertEquals(rezultat,digitron.devide("1,1,5"));
	}
	@Test
	public void testdevideSaN() throws StringCalculatorException {
		StringCalculator digitron = new StringCalculator();
		double rezultat = 0.2;
		assertEquals(rezultat,digitron.devide("5\n1,1"));
	}

}
