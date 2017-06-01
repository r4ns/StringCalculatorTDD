import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_create_calculator() {
		StringCalculator kalkulator=new StringCalculator();
		assertNotNull(kalkulator);
	}
	
	@Test(expected=StringCalculatorException)
	public void test_create_calculator() throws StringCalculatorException{
		StringCalculator kalkulator=new StringCalculator();
		assertNotNull(kalkulator);
	}
	

}
