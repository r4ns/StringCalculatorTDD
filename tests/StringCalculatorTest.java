import static org.junit.Assert.*;

import org.junit.Test;
public class StringCalculatorTest {

	StringCalculator sc;
	
	@Test
	public void testNotNull(){
		sc = new StringCalculator();
		assertNotNull(sc);
	}
	
	@Test
	public void testAdd() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "1,2,3";
		assertEquals(6, sc.add(numbers));
	}
	
	@Test
	public void testAddWithN() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "1\n2,3";
		assertEquals(6,sc.add(numbers));
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testAddForNException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = ",\n";
		sc.add(numbers);
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testAddForEmpthyException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "";
		sc.add(numbers);
	}
	
	@Test(expected= StringCalculatorException.class )
	public void testAddForNegativeException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "-1";
		sc.add(numbers);
	}
	
	@Test (expected= StringCalculatorException.class)
	public void testAddForLetterException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "a";
		sc.add(numbers);
	}
	
	
	@Test
	public void testSubstract() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "3,2";
		assertEquals(1, sc.substract(numbers));
	}
	
	@Test
	public void testSubstractWithN() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "3\n2";
		assertEquals(1,sc.substract(numbers));
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testSubstractForNException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = ",\n";
		sc.substract(numbers);
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testSubstractForEmpthyException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "";
		sc.substract(numbers);
	}
	
	@Test(expected= StringCalculatorException.class )
	public void testForSubstractNegativeException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "-1,5";
		sc.substract(numbers);
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testForSubstactResultNegativeException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "1,2";
		sc.substract(numbers);
	}
	
	@Test (expected= StringCalculatorException.class)
	public void testSubstractForLetterException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "a";
		sc.substract(numbers);
	}
	
	@Test
	public void testMultiply() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "3,2";
		assertEquals(6, sc.multiply(numbers));
	}
	
	@Test
	public void testmultiplyWithN() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "3\n2";
		assertEquals(6,sc.multiply(numbers));
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testmultiplyForNException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = ",\n";
		sc.multiply(numbers);
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testmultiplyForEmpthyException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "";
		sc.multiply(numbers);
	} 
	
	@Test(expected= StringCalculatorException.class )
	public void testForNegativeException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "-1,2";
		sc.multiply(numbers);
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testForMultiplyResultNegativeException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "1,-2";
		sc.multiply(numbers);
	}
	
	@Test (expected= StringCalculatorException.class)
	public void testMultiplyForLetterException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "a";
		sc.multiply(numbers);
	}
	
	@Test
	public void testDivide() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "6,2";
		assertEquals(3.0, sc.divide(numbers),0);

	}
	
	@Test
	public void testdivideWithN() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "6\n2";
		assertEquals(3,sc.divide(numbers),0);
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testdivideForNException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = ",\n";
		sc.divide(numbers);
	}
	
	
	@Test(expected= StringCalculatorException.class )
	public void testdivideForEmpthyException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "";
		sc.divide(numbers);
	}
	
	@Test(expected= StringCalculatorException.class )
	public void testForNegativeAndpositiveException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "-1,2";
		sc.divide(numbers);
	}
	
	@Test(expected= StringCalculatorException.class )
	public void testForPositiveAndNegativeException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "2,-1";
		sc.divide(numbers);
	}
	
	@Test (expected= StringCalculatorException.class)
	public void testDivideForLetterException() throws StringCalculatorException{
		sc = new StringCalculator();
		String numbers = "a";
		sc.divide(numbers);
	}
	
	
}
