import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	
	@Test
	public void testConstructor(){
		StringCalculator s1 = new StringCalculator();
		assertNotNull(s1);
	}
	
	@Test
	public void testAddTwoNumbers() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj = s1.add("1,2");
		assertEquals(3,broj);
	}
	
	@Test
	public void testAddTwoNumbs() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.add("1\n2");
		assertEquals(3,broj);
	}
	
	@Test
	public void testNull() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.add("");
		assertEquals(0,broj);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void textException() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj = s1.add("-1");
	}
	
	@Test(expected=StringCalculatorException.class)
	public void textExceptionTwoNums() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj = s1.add("-1,2");
	}
	
	@Test
	public void SubstractionTwoNumbers() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.substraction("2,1");
		assertEquals(1,broj);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void NegativeSubstraction() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.substraction("-1,2");
	}
	
	public void testNullSubstraction() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.substraction("");
		assertEquals(0,broj);
	}
	@Test
	public void testAddTwoNumbsSubstraction() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.substraction("2\n1");
		assertEquals(1,broj);
	}
	
	//DIVIDE
	
	@Test
	public void testDivideTwoNumbers() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj = s1.divide("4,2");
		assertEquals(2,broj);
	}
	
	@Test
	public void testDivideTwoNumbs() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.divide("4\n2");
		assertEquals(2,broj);
	}
	
	@Test
	public void testDivideNull() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.divide("");
		assertEquals(0,broj);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void textDivideException() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj = s1.divide("-1");
	}
	
	@Test(expected=StringCalculatorException.class)
	public void textDivideTwoNums() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj = s1.divide("-1,2");
	}
	
	//MULTIPLE
	
	@Test
	public void testMultipleTwoNumbers() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj = s1.multiple("4,2");
		assertEquals(8,broj);
	}
	
	@Test
	public void testMultipleTwoNumbs() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.multiple("4\n2");
		assertEquals(8,broj);
	}
	
	@Test
	public void testMultipleNull() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj=s1.multiple("");
		assertEquals(0,broj);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void textMultipleException() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj = s1.multiple("-1");
	}
	
	@Test(expected=StringCalculatorException.class)
	public void textMultpleTwoNums() throws StringCalculatorException{
		StringCalculator s1 = new StringCalculator();
		int broj = s1.multiple("-1,2");
	}
	
	
	
}
