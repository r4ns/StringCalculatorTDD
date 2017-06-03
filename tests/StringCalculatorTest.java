import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	StringCalculator cal = new StringCalculator();
	
	//Addition
	@Test
	public void test_Ok_Addition() throws StringCalculatorException {
		int expectedResult = 6;
		assertEquals(expectedResult, cal.add("3,3"));
	}
	@Test
	public void test_Ok_MoreNum_Addition() throws StringCalculatorException{
		int expectedResult = 7;
		assertEquals(expectedResult, cal.add("3,2,2"));
	}
	@Test(expected=StringCalculatorException.class)
	public void test_NegativeNum_Addition_Exception() throws StringCalculatorException{
		cal.add("2,-3");
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Char_Addition_Exception() throws StringCalculatorException{
		cal.add("5,g,*x");
	}
	@Test
	public void test_Robertov_InputAdd() throws StringCalculatorException{
		int expectedResult = 6;
		assertEquals(expectedResult, cal.add("1\n2,3"));
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Robertov_InputAdd2() throws StringCalculatorException{
		cal.add("2,\n");
	}
	//Subtraction
	@Test
	public void test_Ok_Subtraction() throws StringCalculatorException {
		int expectedResult = 2;
		assertEquals(expectedResult, cal.subtract("5,3"));
	}
	@Test
	public void test_Ok_MoreNum_Subtraction() throws StringCalculatorException {
		int expectedResult = 3;
		assertEquals(expectedResult, cal.subtract("10,4,3"));
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Substract_SmallerMinusBigger() throws StringCalculatorException {
		cal.subtract("2,7");
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Substract_NegativeNumbers() throws StringCalculatorException {
		cal.subtract("2,-1");
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Substract_Char() throws StringCalculatorException {
		cal.subtract("3,1,g");
	}
	@Test
	public void test_Robertov_InputSub() throws StringCalculatorException{
		int expectedResult = 2;
		assertEquals(expectedResult, cal.subtract("5\n2,1"));
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Robertov_Input2Sub() throws StringCalculatorException{
		cal.subtract("2,\n");
	}
	
	//Divison
	@Test
	public void test_Ok_Divison() throws StringCalculatorException {
		int expectedResult = 2;
		assertEquals(expectedResult, cal.division("10,5"));
	}
	@Test
	public void test_Ok_MoreNum_Division() throws StringCalculatorException{
		int expectedResult = 1;
		assertEquals(expectedResult, cal.division("8,4,2"));
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Division_WithZero() throws StringCalculatorException {
		cal.division("2,0");
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Division_NegativeNumbers() throws StringCalculatorException {
		cal.division("2,-1");
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Divison_Char() throws StringCalculatorException {
		cal.division("3,1,g");
	}
	@Test
	public void test_Robertov_InputDiv() throws StringCalculatorException{
		int expectedResult = 1;
		assertEquals(expectedResult, cal.division("8\n4,2"));
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Robertov_Input2Div() throws StringCalculatorException{
		cal.division("2,\n");
	}
	//Multiplication
	
	@Test
	public void test_Ok_Multiplication() throws StringCalculatorException {
		int expectedResult=6;
		assertEquals(expectedResult, cal.multiplication("3,2"));
	}
	@Test
	public void test_Ok_MoreNum_Multiplication() throws StringCalculatorException{
		int expectedResult = 12;
		assertEquals(expectedResult, cal.multiplication("3,2,2"));
	}
	@Test(expected=StringCalculatorException.class)
	public void test_NegativeNumber_Multiplication() throws StringCalculatorException{
		cal.multiplication("3,-2");
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Char_Multiplication() throws StringCalculatorException
	{
		cal.multiplication("3,g");
	}
	@Test
	public void test_Robertov_InputMul() throws StringCalculatorException{
		int expectedResult = 6;
		assertEquals(expectedResult, cal.multiplication("1\n2,3"));
	}
	@Test(expected=StringCalculatorException.class)
	public void test_Robertov_Input2Mul() throws StringCalculatorException{
		cal.multiplication("2,\n");
	}

}
