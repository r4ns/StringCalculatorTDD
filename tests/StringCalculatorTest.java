import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void testKonstruktor(){
		
		StringCalculator calculator = new StringCalculator();
		
		assertNotNull(calculator);
	}
	
	@Test
	public void testSaberiBrojeve(){
		StringCalculator calculator = new StringCalculator();
		
		String rez=calculator.saberi("5,2");
		assertEquals("7", rez);
	}
	
	@Test
	public void testSaberi_n(){
		
		StringCalculator calculator = new StringCalculator();
		String rez=calculator.saberi("5\n1,2");
		assertEquals("8", rez);
		
	}
	
	@Test
	public void testSaberiTriBroja(){
		StringCalculator calculator = new StringCalculator();
		String rez=calculator.saberi("1,2,3");
		assertEquals("6", rez);
	}
	
	@Test
	public void testSaberiPetBrojevaSa_n(){
		StringCalculator calculator = new StringCalculator();
		String rez= calculator.saberi("1\n2,2,3,5");
		assertEquals("13", rez);
	}

}
