import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void test_empty_input() throws StringCalculatorException{
		StringCalculator sc = new StringCalculator();
		int rez = sc.add("");
		
		assertEquals("Greska!", 0, rez);
	}
	
	@Test
	public void test_sum_1_1() throws StringCalculatorException{
		StringCalculator sc = new StringCalculator();
		int rez = sc.add("1,1");
		
		assertEquals("Greska!", 2, rez);
	}
	
	@Test
	public void test_sum_4_6() throws StringCalculatorException{
		StringCalculator sc = new StringCalculator();
		int rez = sc.add("4,6");
		
		assertEquals("Greska!", 10, rez);
	}
	
	@Test
	public void test_sum_4_6_9() throws StringCalculatorException{
		StringCalculator sc = new StringCalculator();
		int rez = sc.add("4,6,9");
		
		assertEquals("Greska!", 19, rez);
	}
	@Test
	public void test_sum_4_n6_9() throws StringCalculatorException{
		StringCalculator sc = new StringCalculator();
		int rez = sc.add("4\n6,9");
		
		assertEquals("Greska!", 19, rez);
	}
	@Test
	public void test_sum_4_n() throws StringCalculatorException{
		StringCalculator sc = new StringCalculator();
		int rez = sc.add("4\n6");
		
		assertEquals("Greska!", 10, rez);
	}
	
	@Test
	public void test_multi_2_2() throws StringCalculatorException{
		StringCalculator sc = new StringCalculator();
		int rez = sc.add("4\n6,9");
		
		assertEquals("Greska!", 19, rez);
	}
	@Test(expected = StringCalculatorException.class)
	public void test_1_comma_newline() throws StringCalculatorException{
		StringCalculator sc = new StringCalculator();
		int rez = sc.add("2,\n");
	}
	
	@Test
	public void substract_2_2() throws StringCalculatorException{
		StringCalculator sc = new StringCalculator();
		int rez = sc.substract("2,1");
		
		assertEquals("Greska!", 1, rez);
	}
}
