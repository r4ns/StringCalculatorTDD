import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void test_Zbir() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.add("1,2,3");
		assertEquals("Ocekivana vrednost zbira je 6",6,calc.sabiranje());
	}
	
	@Test
	public void test_Razlika() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.add("1,2,3");
		assertEquals("Ocekivana vrednost zbira je -6",-6,calc.oduzimanje());
	}
	
	@Test
	public void test_Proizvod() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.add("1,2,3");
		assertEquals("Ocekivana vrednost zbira je 6",6,calc.mnozenje());
	}
	
	@Test
	public void test_Kolicnik() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.add("6,2");
		assertEquals("Ocekivana vrednost zbira je 3.0","3.0",calc.deljenje());
	}
	
	@Test
	public void test_deljenjeSaNulom() throws StringCalculatorException{
		StringCalculator calc = new StringCalculator();
		calc.add("6,0");
		assertEquals("Ocekivana vrednost zbira je 3.0","Deljenje sa 0 nije moguce",calc.deljenje());
	}
	

}
