import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator calculator;
	@Test
	public void TestCalulatorCreate(){
		calculator = new StringCalculator();
		assertNotNull(calculator);
	}
	
	@Test
	public void TestCalculatorAddWithComa() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(10, calculator.add("5,5"));
	}
	@Test
	public void TestCalculatorSubstractWithComa() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(5, calculator.substract("10,5"));
	}
	@Test
	public void TestCalculatorMultyplyWithComa() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(50, calculator.multiply("10,5"));
	}
	@Test
	public void TestCalculatorDivideWithComa() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(1, calculator.divide("2,2"), 2);
	}
	@Test
	public void TestCalculatorAddWithEmpty() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
	}
	
	@Test
	public void TestCalculatorSubstractWithEmpty() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(0, calculator.substract(""));
	}
	@Test
	public void TestCalculatorMultyplyWithEmpty() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(0, calculator.multiply(""));
	}
	@Test
	public void TestCalculatorDivideWithEmpty() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(0, calculator.divide(""), 2);
	}
	@Test
	public void TestCalculatorAddWithNewLine() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(10, calculator.add("5\n5"));
	}
	
	@Test
	public void TestCalculatorSubstractWithNewLine() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(0, calculator.substract("5\n5"));
	}
	@Test
	public void TestCalculatorMultiplyWithNewLine() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(25, calculator.multiply("5\n5"));
	}
	@Test
	public void TestCalculatorDivideWithNewLine() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(1, calculator.divide("5\n5"), 2);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void TestCalculatorDivideException1() throws StringCalculatorException{
		calculator = new StringCalculator();
		calculator.divide("5,\n5");
	}
	@Test(expected = StringCalculatorException.class)
	public void TestCalculatorDivideException2() throws StringCalculatorException{
		calculator = new StringCalculator();
		calculator.divide("5\n,5");
	}
	@Test(expected = StringCalculatorException.class)
	public void TestCalculatorAddException() throws StringCalculatorException{
		calculator = new StringCalculator();
		calculator.add("5\n,5");
	}
	
	@Test(expected = StringCalculatorException.class)
	public void TestCalculatorSubstractException1() throws StringCalculatorException{
		calculator = new StringCalculator();
		calculator.substract("5,\n5");
	}
	@Test(expected = StringCalculatorException.class)
	public void TestCalculatorMultiplyException1() throws StringCalculatorException{
		calculator = new StringCalculator();
		calculator.multiply("5,\n5");
	}
	@Test
	public void TestCalculatorAddWithCommaEnd() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(15, calculator.add("5\n5,5,"));
	}
	@Test
	public void TestCalculatorSubstractWithCommaEnd() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(0, calculator.substract("10\n5,5,"));
	}
	@Test
	public void TestCalculatorMultiplyWithCommaEnd() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(50, calculator.multiply("10\n5,"));
	}
	@Test
	public void TestCalculatorDivideWithCommaEnd() throws StringCalculatorException{
		calculator = new StringCalculator();
		assertEquals(2, calculator.divide("10\n5,"), 2);
	}
}
