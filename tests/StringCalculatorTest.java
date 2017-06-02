import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() throws StringCalculatorException {
		
		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.add(""));
	}

	@Test
	public void testString() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		assertEquals(5,calc.add("2,3"));
		
	}
	
	@Test
	public void testString2() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		assertEquals(10,calc.add("2\n3,5"));
		
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testString3() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.add("1,\n");
			
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testString4() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.add("1,-3");
			
	}
	
	@Test
	public void testStringOduzmi1() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();

		assertEquals(7,	calc.oduzmi("10,1,2"));
			
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testStringOduzmi2() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.oduzmi("2\n3,5");
			
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testStringv3() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.oduzmi("1,-3");
			
	}
	
	@Test
	public void testStringOduzmi4() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();

		assertEquals(0,	calc.oduzmi(""));
			
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testStringOduzmi5() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.oduzmi("1,\n");
			
	}
	
	@Test
	public void testStringPomnozi1() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();

		assertEquals(0,	calc.pomnozi(""));
			
	}
	
	@Test
	public void testStringPomnozi2() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();

		assertEquals(15,calc.pomnozi("1,3,5\n"));
			
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testStringPomnozi3() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.pomnozi("1,\n");
			
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testStringPomnozi4() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.pomnozi("1,-3,5\n");
	
			
	}
	
	@Test
	public void testStringPomnozi5() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();

		assertEquals(15,calc.pomnozi("1,3,5"));
			
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testStringPomnozi6() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.pomnozi("1\n,");
			
	}
	
	@Test
	public void testStringPodeli1() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		double x=2;
		assertEquals(x, calc.podeli("4,2"),0);
			
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testStringPodeli2() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.podeli("1\n,");

			
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testStringPodeli3() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		calc.podeli("1,-3,5\n");
	
			
	}
	
	@Test
	public void testStringPodeli4() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		double x=5;
		assertEquals(x, calc.podeli("50,5\n2"),0);
			
	}
	
	@Test
	public void testStringPodeli5() throws StringCalculatorException{
		
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.podeli(""),0);
			
	}
	
	
	
	
	
	
}
