import static org.junit.Assert.*;


import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator s = new StringCalculator();
	
	
	@Test
	public void test_prazan(){
		String in = null;
		StringCalculator s = new StringCalculator(in);
		assertEquals(null,in);
	}
	
	@Test 
	public void test_add_dva_broja(){
		StringCalculator s = new StringCalculator();
		String a = "11";
		assertEquals(2, s.add(a));
	}

}
