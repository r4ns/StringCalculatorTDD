import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test1(){
		StringCalculator s = new StringCalculator();
		assertNotNull(s);
	}
	
	@Test
	public void testAdd(){
		StringCalculator s = new StringCalculator();
		int result = s.add("1,2,3");
		assertEquals("Initial result incorrect", 6 , result);
	}
	
	@Test
	public void testAdd1(){
		StringCalculator s = new StringCalculator();
		int result = s.add("1\n2,3");
		assertEquals("Initial result incorrect", 6 , result);
	}
	
	@Test
	public void testAdd2(){
		StringCalculator s = new StringCalculator();
		int result = s.add("");
		assertEquals("Initial result incorrect", 0 , result);
	}

	@Test
	public void testAdd3(){
		StringCalculator s = new StringCalculator();
		int result = s.add("-3,2,5");
		assertEquals("Initial result incorrect", 4 , result);
	}
	
	@Test
	public void testOduzimanje(){
		StringCalculator s = new StringCalculator();
		int result = s.oduzimanje("3,1");
		assertEquals("Initial result incorrect", 2 , result);
	}
	
	@Test
	public void testOduzimanje1(){
		StringCalculator s = new StringCalculator();
		int result = s.oduzimanje("10,1,2,5");
		assertEquals("Initial result incorrect", 2 , result);
	}
	
	@Test
	public void testMnozenje(){
		StringCalculator s = new StringCalculator();
		int result = s.mnozenje("1,3,5");
		assertEquals("Initial result incorrect", 15 , result);
	}
	
	@Test
	public void testDeljenje(){
		StringCalculator s = new StringCalculator();
		int result = s.deljenje("10,2,1");
		assertEquals("Initial result incorrect", 5 , result);
	}
	
	@Test
	public void testDeljenje1(){
		StringCalculator s = new StringCalculator();
		int result = s.deljenje("10,2,1");
		assertEquals("Initial result incorrect", 5 , result);
	}
}
