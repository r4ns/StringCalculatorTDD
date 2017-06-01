import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator s = new StringCalculator();
	@Test
	public void testAddPrazanString() throws StringCalculatorException{
		float br = s.add("");
		assertEquals("", 0, br, 0);
	}

	@Test
	public void testAddJedanBroj() throws StringCalculatorException{
		float br = s.add("1");
		assertEquals("", 1, br, 0);
	}

	@Test
	public void testAddBrojeviRazdvojeniZarezom()throws StringCalculatorException {
		float br = s.add("1,2");
		assertEquals("", 3, br, 0);
	}

	@Test
	public void testAddBrojeviRazdvojeniKosaCrtaN() throws StringCalculatorException{
		float br = s.add("2\n3");
		assertEquals("", 5, br, 0);
	}

	@Test
	public void testAddBrojeviRazdvojeniMIX() throws StringCalculatorException{
		float br = s.add("2\n3,3");
		assertEquals("", 8, br, 0);
	}

	@Test (expected = StringCalculatorException.class)
	public void testAddExeption() throws StringCalculatorException{
		float br = s.add("2\n3,3asd");
	}


	@Test (expected = StringCalculatorException.class)
	public void testAddExeption2() throws StringCalculatorException{
		float br = s.add("1,\n");
	}

	@Test (expected = StringCalculatorException.class)
	public void testAddExeption3() throws StringCalculatorException{
		float br = s.add("-1,2");
	}

	///
	@Test
	public void testOduzmiPrazanString() throws StringCalculatorException{
		float br = s.oduzmi("");
		assertEquals("", 0, br, 0);
	}

	@Test
	public void testOduzmiJedanBroj() throws StringCalculatorException{
		float br = s.oduzmi("1");
		assertEquals("", 1, br, 0);
	}

	@Test
	public void testOduzmiBrojeviRazdvojeniZarezom()throws StringCalculatorException {
		float br = s.oduzmi("1,2");
		assertEquals("", -1, br, 0);
	}

	@Test
	public void testOduzmiBrojeviRazdvojeniKosaCrtaN() throws StringCalculatorException{
		float br = s.oduzmi("2\n3");
		assertEquals("", -1, br, 0);
	}

	@Test
	public void testOduzmiBrojeviRazdvojeniMIX() throws StringCalculatorException{
		float br = s.oduzmi("2\n3,3");
		assertEquals("", -4, br, 0);
	}

	@Test (expected = StringCalculatorException.class)
	public void testOduzmiExeption() throws StringCalculatorException{
		float br = s.oduzmi("2\n3,3asd");
	}


	@Test (expected = StringCalculatorException.class)
	public void testOduzmiExeption2() throws StringCalculatorException{
		float br = s.oduzmi("1,\n");
	}

	@Test (expected = StringCalculatorException.class)
	public void testOduzmiExeption3() throws StringCalculatorException{
		float br = s.oduzmi("-1,2");
	}


	///
	@Test
	public void testMnoziPrazanString() throws StringCalculatorException{
		float br = s.mnozi("");
		assertEquals("", 0, br, 0);
	}

	@Test
	public void testMnoziJedanBroj() throws StringCalculatorException{
		float br = s.mnozi("1");
		assertEquals("", 1, br, 0);
	}

	@Test
	public void testMnoziBrojeviRazdvojeniZarezom()throws StringCalculatorException {
		float br = s.mnozi("1,2");
		assertEquals("", 2, br, 0);
	}

	@Test
	public void testMnoziBrojeviRazdvojeniKosaCrtaN() throws StringCalculatorException{
		float br = s.mnozi("2\n3");
		assertEquals("", 6, br, 0);
	}

	@Test
	public void testMnoziBrojeviRazdvojeniMIX() throws StringCalculatorException{
		float br = s.mnozi("2\n3,3");
		assertEquals("", 18, br, 0);
	}

	@Test (expected = StringCalculatorException.class)
	public void testMnoziExeption() throws StringCalculatorException{
		float br = s.mnozi("2\n3,3asd");
	}


	@Test (expected = StringCalculatorException.class)
	public void testMnoziExeption2() throws StringCalculatorException{
		float br = s.mnozi("1,\n");
	}

	@Test (expected = StringCalculatorException.class)
	public void testMnoziExeption3() throws StringCalculatorException{
		float br = s.mnozi("-1,2");
	}

	///
	@Test
	public void testDeliPrazanString() throws StringCalculatorException{
		float br = s.deli("");
		assertEquals("", 0, br, 0);
	}

	@Test
	public void testDeliJedanBroj() throws StringCalculatorException{
		float br = s.deli("1");
		assertEquals("", 1, br, 0);
	}

	@Test
	public void testDeliBrojeviRazdvojeniZarezom()throws StringCalculatorException {
		float br = s.deli("1,2");
		assertEquals("", 0.5, br, 0);
	}

	@Test
	public void testDeliBrojeviRazdvojeniKosaCrtaN() throws StringCalculatorException{
		float br = s.deli("6\n3");
		assertEquals("", 2, br, 0);
	}

	@Test
	public void testDeliBrojeviRazdvojeniMIX() throws StringCalculatorException{
		float br = s.deli("9\n3,3");
		assertEquals("", 1, br, 0);
	}

	@Test (expected = StringCalculatorException.class)
	public void testDeliExeption() throws StringCalculatorException{
		float br = s.deli("2\n3,3asd");
	}


	@Test (expected = StringCalculatorException.class)
	public void testDeliExeption2() throws StringCalculatorException{
		float br = s.deli("1,\n");
	}

	@Test (expected = StringCalculatorException.class)
	public void testDeliExeption3() throws StringCalculatorException{
		float br = s.deli("-1,2");
	}
}
