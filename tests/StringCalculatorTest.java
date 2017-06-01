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
	@Test
	public void test_addNumbers_coma() throws StringCalculatorException{
		StringCalculator kalkulator=new StringCalculator();
		int rezultat=kalkulator.add("2,2,3,1,1,1");
		assertEquals(10,rezultat);

	}
	
	@Test
	public void test_addNumbers_newLine() throws StringCalculatorException{
		StringCalculator kalkulator=new StringCalculator();
		int rezultat=kalkulator.add("2\n2\n11");
		assertEquals(15,rezultat);

	}
}
