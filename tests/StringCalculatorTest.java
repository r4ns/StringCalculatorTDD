import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_create_calculator() {
		StringCalculator kalkulator=new StringCalculator();
		assertNotNull(kalkulator);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void test_string_null(){
		StringCalculator kalkulator=new StringCalculator();
		kalkulator.add("");
		
		
	}
	

}
