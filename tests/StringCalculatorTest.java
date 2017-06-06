import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_Start() {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Pocetni kalkulator", "0", score);
	}
	
	@Test
	public void test_Sabiranje() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.add("2,2");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Sabiranje 2 broja", "4", score);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_SubiranjePogresanZapis() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.add("2,\n2");
	}
	
	@Test
	public void test_SabiranjePrazanString() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.add("");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Sabiranje prazan string", "0", score);
	}
	
	
	@Test
	public void test_SabiranjeSaNovimRedom() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.add("2\n2");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Sabiranje 2 broja", "4", score);
	}
	
	
	@Test
	public void test_Oduzimanje() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.sub("2,2");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Oduzimanje dva broja sa \n", "-4", score);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_OduzimanjePogresanZapis() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.sub("2,\n2");
	}
	
	@Test
	public void test_OduzimanjePrazanString() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.sub("");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Oduzimanje prazan string", "0", score);
	}
	
	@Test
	public void test_OduzimanjeSaNovimRedom() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.sub("2\n2");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Oduzimanje 2 broja sa \n", "-4", score);
	}
	
	@Test
	public void test_Mnozenje() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.mul("2,2");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Oduzimanje dva broja", "4", score);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_MnozenjePogresanZapis() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.mul("2,\n2");
	}
	
	@Test
	public void test_MnozenjePrazanString() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.mul("");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Mnozenje prazan string", "1", score);
	}
	
	@Test
	public void test_MnozenjeSaNovimRedom() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.mul("2\n2");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Mnozenje 2 broja sa \n", "4", score);
	}
	
	@Test
	public void test_Deljenje() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.div("2,2");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Oduzimanje dva broja", "0.25", score);
	}
	
	@Test(expected = StringCalculatorException.class)
	public void test_DeljenjePogresanZapis() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.div("2,\n2");
	}
	
	@Test
	public void test_DeljenjePrazanString() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.div("");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Deljenje prazan string", "1", score);
	}
	
	@Test
	public void test_DeljenjeSaNovimRedom() throws StringCalculatorException {
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.div("2\n2");
		//Act
		String score = calculator.getScore() ;
		// Assert
		assertEquals("Deljenje 2 broja sa \n", "0.25", score);
	}

	@Test(expected = StringCalculatorException.class)
	public void test_DeljenjeSaNulom() throws StringCalculatorException{
		//Arrange
		StringCalculator calculator = new StringCalculator();
		calculator.div("2,0");
	}
}
