import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	

	
	@Test 
	public void testSaberiDvaBrojaBezKosaCrtaNKodSabiranja() throws StringCalculatorException
	{
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="1,2,3,4";
		int zbir=kalkulator.add(numbersStr);
		assertEquals(10,zbir);
	}
	
	@Test
	public void testSaberiDvaBrojaSaKosaCrtaNKodSabiranja() throws StringCalculatorException
	{
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="1\n2,3";
		int zbir=kalkulator.add(numbersStr);
		assertEquals(6,zbir);
	}
	
	public void testSaberiSaKosomCrtomNaDrugomMestuKodSabiranja() throws StringCalculatorException
	{
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="1,2\n3";
		int zbir=kalkulator.add(numbersStr);
		assertEquals(6,zbir);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testExceptionKosaCrtaNaLosemMestuKodSabiranja() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="1,\n";
		int zbir=kalkulator.add(numbersStr);
		
		
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testNegativanBrojKodSabiranja() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="1,-2,3";
		int zbir=kalkulator.add(numbersStr);
		
		
	}
	
	
	@Test(expected=StringCalculatorException.class)
	public void testPrazanStringKodSabiranja() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="";
		int zbir=kalkulator.add(numbersStr);
	}
	
	@Test
	public void testPomnoziBrojeve() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="1,2,3";
		int proizvod=kalkulator.pomnozi(numbersStr);
		assertEquals(6, proizvod);
	}
	
	@Test
	public void testPomnoziBrojeveSaKosomCrtom() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="1\n2,3";
		int proizvod=kalkulator.pomnozi(numbersStr);
		assertEquals(6, proizvod);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testPrazanStringKodMnozenja() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="";
		int proizvod=kalkulator.pomnozi(numbersStr);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testNegativanBrojKodMnozenja() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="-1,2,3";
		int proizvod=kalkulator.pomnozi(numbersStr);
		
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testKodMnozenjaSaKosomCrtomNaLosemMestu() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="3,\n";
		int proizvod=kalkulator.pomnozi(numbersStr);
		
	}
	
	
	@Test
	public void testOduzimanje () throws StringCalculatorException
	{
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="5,2,3";
		
		int razlika=kalkulator.oduzimanje(numbersStr);
		assertEquals(0, razlika);
	}
	
	@Test
	public void testOduzimanjeSaKosomCrtom () throws StringCalculatorException
	{
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="5\n2,3";
		
		int razlika=kalkulator.oduzimanje(numbersStr);
		assertEquals(0, razlika);
	}
	
	
	@Test(expected=StringCalculatorException.class)
	public void testPrazanStringKodOduzimanja () throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="";
		int razlika=kalkulator.oduzimanje(numbersStr);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testKodOduzimanjaSaKosomCrtomNaLosemMestu() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="3,\n";
		int razlika=kalkulator.oduzimanje(numbersStr);
		
	}
	
	@Test
	public void testDeljenje () throws StringCalculatorException
	{
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="6,2";
		
		float kolicnik=kalkulator.deljenje(numbersStr);
		assertEquals(3, kolicnik, 0.9);
	
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testPrazanStringKodDeljenja() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="";
		float kolicnik=kalkulator.deljenje(numbersStr);
	}
	
	@Test(expected=StringCalculatorException.class)
	public void testKodDeljanjaSaKosomCrtomNaLosemMestu() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="3,\n";
		float kolicnik=kalkulator.deljenje(numbersStr);
		
	}
	
	@Test(expected=StringCalculatorException.class)
	public void deljenjeSaNulom() throws StringCalculatorException{
		
		StringCalculator kalkulator= new StringCalculator();
		String numbersStr="3,0";
		float kolicnik=kalkulator.deljenje(numbersStr);
		
	}
	
	
}
