import static org.junit.Assert.*;

import org.junit.Test;



public class StringCalculatorTest {
	
	@Test
	public void testContructor(){
		StringCalculator s1=new StringCalculator();
		assertNotNull(s1);
	}
	
	@Test
	public void testAddTwoNumbers() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.add("1,2");
		assertEquals(3,broj);
	}
	
	@Test
	public void testAddTwoNum() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.add("1\n2");
		assertEquals(3,broj);
	}
	
	@Test
	public void testAddMixString() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.add("1\n2,3");
		assertEquals(6,broj);
	}
	
	@Test
	public void testEmptyString() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.add("");
		assertEquals(0,broj);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testException() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.add("-1");
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testExceptionTwo() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.add("-1,1");
	}
	
	
	
	@Test
	public void testSubtractionTwoNumbers() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.subtraction("2,1");
		assertEquals(1,broj);
	}
	
	@Test
	public void testSubTwoNumbers() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.subtraction("2\n1");
		assertEquals(1,broj);
	}
	
	@Test
	public void testSubEmptyString() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.subtraction("");
		assertEquals(0,broj);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testNegative() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.subtraction("-2,1\n2");
	}
	
	
	@Test
	public void testDivideTwoNumbers() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.divide("2,1");
		assertEquals(2,broj);
	}
	
	@Test
	public void testDivideTwoNum() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.divide("2\n1");
		assertEquals(2,broj);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testNegativeNum() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.divide("-2,1\n2");
	}
	
	@Test
	public void testSubEmptyStr() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.divide("");
		assertEquals(0,broj);
	}
	
	
	
	@Test
	public void testDivideTwoNumber() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.multiple("2,1");
		assertEquals(2,broj);
	}
	
	@Test
	public void testDivideTwoNumberr() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.multiple("2,1");
		assertEquals(2,broj);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testNegativeNumb() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.multiple("-2,1\n2");
	}
	
	@Test
	public void testSubEmptyStrings() throws StringCalculatorException{
		StringCalculator s1=new StringCalculator();
		int broj=s1.multiple("");
		assertEquals(0,broj);
	}
}
