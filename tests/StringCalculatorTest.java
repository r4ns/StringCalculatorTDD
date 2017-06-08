import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	StringCalculator test = new StringCalculator();
	
	@Test
	public void test_initialAdd() throws StringCalculatorException {
		int rezultat = 1;
		assertEquals(rezultat, test.add("1"), 0);
	}
	@Test
	public void test_initialAdd_Zero() throws StringCalculatorException {
		int rezultat = 0;
		assertEquals(rezultat, test.add(""), 0);
	}
	
	@Test
	public void test_initialsAdd() throws StringCalculatorException {
		int rezultat = 6;
		assertEquals(rezultat, test.add("1,2,3"), 0);
	}
	
	@Test
	public void test_initialsAdd_newLine() throws StringCalculatorException {
		int rezultat = 6;
		assertEquals(rezultat, test.add("1\n2,3"), 0);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_initialsAdd_newLine_comma() throws StringCalculatorException {
		test.add(",\n");
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_initialAdd_Negative() throws StringCalculatorException {
		test.add("-1");
	}
	
	@Test
	public void test_initialOduzmi() throws StringCalculatorException {
		int rezultat = 1;
		assertEquals(rezultat, test.oduzmi("1"), 0);
	}
	@Test
	public void test_initialOduzmi_Zero() throws StringCalculatorException {
		int rezultat = 0;
		assertEquals(rezultat, test.oduzmi(""), 0);
	}
	
	@Test
	public void test_initialsOduzmi() throws StringCalculatorException {
		int rezultat = 0;
		assertEquals(rezultat, test.oduzmi("3,2,1"), 0);
	}
	
	@Test
	public void test_initialsOduzmi_newLine() throws StringCalculatorException {
		int rezultat = 0;
		assertEquals(rezultat, test.oduzmi("3\n2,1"), 0);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_initialsOduzmi_newLine_comma() throws StringCalculatorException {
		test.oduzmi(",\n");
	}
	
	/*@Test(expected = StringCalculatorException.class)
	public void test_initialOduzmi_Negative() throws StringCalculatorException {
		test.oduzmi("-1");
	}*/
	
	@Test(expected = StringCalculatorException.class)
	public void test_initialsOduzmi_Exc() throws StringCalculatorException {
		test.oduzmi("2,3,1");
	}
	
	@Test
	public void test_initialPomnozi() throws StringCalculatorException {
		int rezultat = 1;
		assertEquals(rezultat, test.pomnozi("1"), 0);
	}
	@Test
	public void test_initialPomnozi_Zero() throws StringCalculatorException {
		int rezultat = 0;
		assertEquals(rezultat, test.pomnozi(""), 0);
	}
	
	@Test
	public void test_initialsPomnozi() throws StringCalculatorException {
		int rezultat = 6;
		assertEquals(rezultat, test.pomnozi("1,2,3"), 0);
	}
	
	@Test
	public void test_initialsPomnozi_newLine() throws StringCalculatorException {
		int rezultat = 6;
		assertEquals(rezultat, test.pomnozi("1\n2,3"), 0);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_initialsPomnozi_newLine_comma() throws StringCalculatorException {
		test.pomnozi(",\n");
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_initialPomnozi_Negative() throws StringCalculatorException {
		test.pomnozi("-1");
	}
	
	@Test
	public void test_initialPodeli() throws StringCalculatorException {
		int rezultat = 1;
		assertEquals(rezultat, test.podeli("1"), 0);
	}
	@Test
	public void test_initialPodeli_Zero() throws StringCalculatorException {
		int rezultat = 0;
		assertEquals(rezultat, test.podeli(""), 0);
	}
	
	@Test
	public void test_initialsPodeli() throws StringCalculatorException {
		double rezultat = 1.5;
		assertEquals(rezultat, test.podeli("3,2"), 0);
	}
	
	@Test
	public void test_initialsPodeli_newLine() throws StringCalculatorException {
		double rezultat = 1.5;
		assertEquals(rezultat, test.podeli("3\n2"), 0);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_initialsPodeli_newLine_comma() throws StringCalculatorException {
		test.podeli(",\n");
	}
	
	/*@Test(expected = StringCalculatorException.class)
	public void test_initialPodeli_Negative() throws StringCalculatorException {
		test.podeli("-1");
	}*/
}
