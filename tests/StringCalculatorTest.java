import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAdd2_and_2_splitted_by_comma()throws StringCalculatorException {
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.add("2,2");
		assertEquals("Rezultati se ne poklapaju, ocekivano:",4,rezultat);
	}
	@Test
	public void test_empty_inmput()throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.add("");
		assertEquals("Rezultati se ne poklapaju, ocekivano:",0,rezultat);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_negative_input() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.add("-2");
	}
	@Test
	public void test_add_number_with_newLine_delimeters() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.add("2\n2");
		assertEquals("Rezultati se ne poklapaju, ocekivano:",4,rezultat);
	}
	@Test(expected = StringCalculatorException.class)
	public void test_invalid_input_with_newLine_delimeter() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.add("2\n-2");
	}
	@Test
	public void test_with_both_delimeters() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.add("2\n2,3");
		assertEquals("Rezultati se ne poklapaju, ocekivano:",7,rezultat);
	}
	@Test(expected = StringCalculatorException.class)
	public void test_1_comma_newline() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.add("2,\n");
	}
	
	@Test
	public void test_subtract3_from_5_delimeter_comma() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.subtract("5,3");
		assertEquals("Neocekivani rezultat,ocekivano:",2,rezultat);
	}
	
	@Test
	public void test_subtract5_from_3_delimeter_comma() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.subtract("3,5");
		assertEquals("Neocekivani rezultat,ocekivano:",-2,rezultat);
	}
	@Test
	public void test_empty_input() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.subtract("");
		assertEquals("Neocekivani rezultat,ocekivano:",0,rezultat);
	}
	@Test(expected = StringCalculatorException.class)
	public void test_invalid_input() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		kalkulator.subtract("-5,3");
	}
	@Test
	public void test_subtract_with_newrow_delimeter() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.subtract("2\n3");
		assertEquals("Neocekivani rezultat,ocekivano:",-1,rezultat);
	}
	@Test(expected = StringCalculatorException.class)
	public void test_invalid_with_newline()	throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.subtract("2\n-3");
	}
	@Test(expected = StringCalculatorException.class)
	public void test_single_argument_exception()throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.subtract("2");
	}
	@Test
	public void multiply_1_2_with_comma_delimeter() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.multiply("1,2");
		assertEquals("Neocekivani rezultat,ocekivano:",2,rezultat);
	}
	@Test(expected = StringCalculatorException.class)
	public void multiply_negative_with_comma_delimeter() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.multiply("1,-3");
	}
	@Test
	public void multiply_1_2_with_comma_newrow() throws StringCalculatorException{
		StringCalculator kalkulator = new StringCalculator();
		int rezultat = kalkulator.multiply("1\n2");
		assertEquals("Neocekivani rezultat,ocekivano:",2,rezultat);
	}
}
