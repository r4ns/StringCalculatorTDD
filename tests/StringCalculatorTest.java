import static org.junit.Assert.*;

import org.junit.Test;



public class StringCalculatorTest {
	private static final double DELTA = 1e-15;

	@Test
	public void testAdd() {
		StringCalculator s = new StringCalculator();
		assertEquals(15.0,s.add("+,1,2,3,4,5"),DELTA);
	}
	
	@Test
	public void testMultiple() {
		StringCalculator s = new StringCalculator();
		assertEquals(120,s.add("*,1,2,3,4,5"),DELTA);
	}
	
	@Test
	public void testDivide() {
		StringCalculator s = new StringCalculator();
		assertEquals(0.0083333,s.add("/,1,2,3,4,5"),DELTA);
	}
	
	@Test
	public void testSub() {
		StringCalculator s = new StringCalculator();
		assertEquals(-15,s.add("-,1,2,3,4,5"),DELTA);
	}
	
	@Test
	public void testConstructor(){
		StringCalculator s = new StringCalculator();
		assertNotNull(s);
	}

}
