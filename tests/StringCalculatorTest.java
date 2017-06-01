import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_create_calculator() {
		StringCalculator kalkulator=new StringCalculator();
		assertNotNull(kalkulator);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void test_string_null() throws StringCalculatorException{
		StringCalculator kalkulator=new StringCalculator();
		kalkulator.add("");
	
	}
	
	@Test(expected=StringCalculatorException.class)
	public void test_string_negativeNumber() throws StringCalculatorException{
		StringCalculator kalkulator=new StringCalculator();
		kalkulator.add("-123");
		
	
	}
	public void test_addNumbers_coma() throws StringCalculatorException{
		StringCalculator kalkulator=new StringCalculator();
		int rezultat=kalkulator.add("123,2,3");
		assertEquals(rezultat,128);
		
	
	}
}
