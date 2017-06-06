import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	
	@Test
	public void testMnozi1() throws StringCalculatorException {

		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.mnozi(""));
	
	}
	
	@Test
	public void testMnozi2() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(16,calc.mnozi("8,2"));

	}
	
	@Test 
	public void testMnozi3() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		assertEquals(64,calc.mnozi("8\n4,2"));
	}
	
	
	
	@Test (expected=StringCalculatorException.class)
	public void testMnozi4() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("1,\n");
	
	}
	
	@Test (expected=StringCalculatorException.class)
	public void testMnozi5() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("-1,2");
	
	}
	
	
	
	
	
	@Test
	public void testDivide1() throws StringCalculatorException {

		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.divide(""));
	
	}



	
	@Test
	public void testDivide2() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(4,calc.divide("8,2"));

	}
	
	@Test 
	public void testDivide3() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		assertEquals(1,calc.divide("8\n4,2"));
	}
	
	
	@Test (expected=StringCalculatorException.class)
	public void testDivide4() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("1,\n");
	
	}
	
	@Test (expected=StringCalculatorException.class)
	public void testDivide5() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("-1,2");
	
	}
	
	
	
	
	
	
	
	
	
	@Test
	public void testMinus() throws StringCalculatorException {

		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.minus(""));
	}
	
	@Test
	public void testMinus1() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(1,calc.minus("3,2"));

	}
	
	@Test
	public void testMinus2() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(-3,calc.minus("10,5,8"));

	}
	
	
	@Test 
	public void minus3() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		assertEquals(-25,calc.minus("1\n23,3"));

	}
	
	@Test (expected=StringCalculatorException.class)
	public void minus4() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("1,\n");
	
	}
	
	@Test (expected=StringCalculatorException.class)
	public void minus5() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("-1,2");
	
	}
	
	
	
	
	

	@Test
	public void test() throws StringCalculatorException {

		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.add(""));
	}

	@Test
	public void test1() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(3,calc.add("1,2"));

	}

	@Test
	public void test2() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();

		assertEquals(6,calc.add("1,2,3"));

	}

	@Test
	public void test3() throws StringCalculatorException{

		StringCalculator calc = new StringCalculator();
		assertEquals(27,calc.add("1,23,3"));

	}

	@Test 
	public void test4() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		assertEquals(27,calc.add("1\n23,3"));

	}
	
	@Test (expected=StringCalculatorException.class)
	public void test5() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("1,\n");
	
	}
	
	@Test (expected=StringCalculatorException.class)
	public void test6() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("-1,2");
	
	}
	
	@Test (expected=StringCalculatorException.class)
	public void test7() throws StringCalculatorException  {

		StringCalculator calc = new StringCalculator();
		calc.add("-1\n2");
	
	}
	
	
	
	
	
	
	
	
	










}
