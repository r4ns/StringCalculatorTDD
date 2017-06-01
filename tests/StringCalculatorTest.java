import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test 
	public void testiranjeKonstruktor()
	{
		StringCalculator kalkulator= new StringCalculator();
		
		assertNotNull(kalkulator);
	}
	
	@Test
	public void testSaberiSplitNaZarez()
	{
		StringCalculator kalkulator= new StringCalculator();
		
		
		String rezultat=kalkulator.saberi("2,3");
		
		assertEquals("5", rezultat);
	
	}
	
	@Test
	public void testSaberiSakosaCrtaN()
	{
		StringCalculator kalkulator= new StringCalculator();
		
		
		String rezultat=kalkulator.saberi("1\n2,3");
		
		assertEquals("6", rezultat);
	
	}
	
	@Test 
	public void testSaberiTribroja()
	{
		StringCalculator kalkulator= new StringCalculator();
		
		
		String rezultat=kalkulator.saberi("2,3,3");
		
		assertEquals("8", rezultat);
	}
	
	@Test
	public void testSaberiSakosaCrtaNSaTriBroja()
	{
		StringCalculator kalkulator= new StringCalculator();
		
		
		String rezultat=kalkulator.saberi("1\n2,3,4");
		
		assertEquals("10", rezultat);
	
	}
	
}
