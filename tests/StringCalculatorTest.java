import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.add(""),0);
	}
	
	@Test
	public void test1() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.add("1,2,3"),6);
	}
	
	@Test
	public void test2() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.add("1\n2,3"),6);
	}
	
	@Test(expected=StringCalculatorException.class)	
	public void test3() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		s.add("1,-2,3");
	}
	@Test
	public void test4() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.add("1,2\n3"),6);
	}
	@Test(expected=StringCalculatorException.class)	
	public void test5() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		s.add("1,\n");
	}

	@Test
	public void test1Mnozenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.pomnozi("1,2,3"),6);
	}
	
	
	@Test
	public void test2Mnozenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.pomnozi("1\n4,3"),12);
	}
	
	@Test(expected=StringCalculatorException.class)	
	public void test3Mnozenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		s.pomnozi("1,-5,3");
	}
	@Test
	public void test4Mnozenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.pomnozi("1,2\n3"),6);
	}
	@Test(expected=StringCalculatorException.class)	
	public void test5Mnozenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		s.pomnozi("1,\n");
	}
	
	@Test
	public void test1Oduzimanje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.oduzmi("5,2,1"),2);
	}
	
	@Test
	public void test2Oduzimanje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.oduzmi("6\n4,1"),1);
	}
	
	@Test(expected=StringCalculatorException.class)	
	public void test3Oduzimanje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		s.oduzmi("1,-5,3");
	}
	@Test
	public void test4Oduzimanje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.oduzmi("6,2\n1"),3);
	}
	@Test(expected=StringCalculatorException.class)	
	public void test5Oduzimanje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		s.oduzmi("1,\n");
	}
	
	@Test
	public void test1Deljenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.podeli("25,5,1"),5);
	}
	
	@Test
	public void test2Deljenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.podeli("48\n6,8"),1);
	}
	
	@Test(expected=StringCalculatorException.class)	
	public void test3Deljenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		s.podeli("8,-5,3");
	}
	@Test
	public void test4Deljenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		assertEquals(s.podeli("56,7\n2"),4);
	}
	@Test(expected=StringCalculatorException.class)	
	public void test5Deljenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		s.podeli("1,\n");
	}
	
	@Test(expected=StringCalculatorException.class)	
	public void test6Deljenje() throws StringCalculatorException{
		StringCalculator s=new StringCalculator();
		s.podeli("1,0");
	}

}
