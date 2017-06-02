import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void prazanString() {
		String input = null;
		StringCalculator string = new StringCalculator(input);
		assertTrue(input == null);
	}
	
	
	
	@Test
	public void zarez(){
		String input = ",";
		StringCalculator string = new StringCalculator(input);
		assertTrue(input == ",");
		
	}
	
	@Test
	public void sabiranje(){
		String input = "1,2";
		StringCalculator string = new StringCalculator(input);
		int zbir; 
		zbir =  string.add(input);
		assertEquals(3, zbir);
	}
	
	@Test
	public void oduzimanje(){
		String input = "1,2";
		StringCalculator string = new StringCalculator(input);
		int zbir; 
		zbir =  string.substract(input);
		assertEquals(-1, zbir);
	}
	
	@Test
	public void mnozenje(){
		String input = "1,2";
		StringCalculator string = new StringCalculator(input);
		int proizvod; 
		proizvod =  string.multiply(input);
		assertEquals(2, proizvod);
	}
	

}
