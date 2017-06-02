import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
/*
	@Test
	public void test() {
		
		fail("Not yet implemented");
	}*/
	@Test
	public void test_add()throws StringCalculatorException {
		String array= "+,1,2,3,4,5";
		StringCalculator s = new StringCalculator();
		
		String expected = "15";
		assertEquals(expected,String.valueOf(s.add(array)));
	}
	
	@Test
	public void test_constructor(){
		StringCalculator s = new StringCalculator();
		assertNotNull(s);
	}
	
	@Test 
	public void test_substraction_2_element()throws StringCalculatorException{
		String array= "-,5,4";
		StringCalculator s = new StringCalculator();
		String expected = "1";
		
		assertEquals(expected,String.valueOf(s.add(array)));
	}
	
	@Test 
	public void test_substraction_more_element()throws StringCalculatorException{
		String array= "-,5,4,3,2,1";
		StringCalculator s = new StringCalculator();
		String expected = "-5";
		
		assertEquals(expected,String.valueOf(s.add(array)));
	}
	
	@Test 
	public void test_multiplication_more_element()throws StringCalculatorException{
		String array= "*,5,4";
		StringCalculator s = new StringCalculator();
		String expected = "20";
		
		assertEquals(expected,String.valueOf(s.add(array)));
	}
	
	@Test 
	public void test_division_more_element()throws StringCalculatorException{
		String array= "/,8,4";
		StringCalculator s = new StringCalculator();
		String expected = "2";
		
		assertEquals(expected,String.valueOf(s.add(array)));
	}
	
	@Test(expected=StringCalculatorException.class) 
	public void test_division_more_element_exception()throws StringCalculatorException{
		String array= "/,8,4,0";
		StringCalculator s = new StringCalculator();
		String expected = "2";
		
		assertEquals(expected,String.valueOf(s.add(array)));
	}
	
	@Test 
	public void test_empty_string()throws StringCalculatorException{
		String array= " ";
		StringCalculator s = new StringCalculator();
		
		String expected = "0";
		assertEquals(expected, String.valueOf(s.add(array)));
		
	}
	
	@Test(expected=StringCalculatorException.class)
	public void test_n_is_not_valid()throws StringCalculatorException{
		String array = "1,2,3,\n,4,5";
		StringCalculator s = new StringCalculator();
		
		String expected = "exception";
		assertEquals(expected, String.valueOf(s.add(array)));
		
	}
	
	@Test
	public void test_n_is_valid_for_add()throws StringCalculatorException{
		String array = "+,1,2,3\n4,5";
		StringCalculator s = new StringCalculator();
		
		String expected = "15";
		assertEquals(expected, String.valueOf(s.add(array)));
	}
	
	@Test(expected=StringCalculatorException.class)
	public void test_n_2_is_not_valid()throws StringCalculatorException{
		String array = "1,2,3,\n,4,5";
		StringCalculator s = new StringCalculator();
		
		String expected = "exception";
		assertEquals(expected, String.valueOf(s.add(array)));
	}
	
	@Test(expected=StringCalculatorException.class)
	public void invalid_input_with_negative_number()throws StringCalculatorException{
		String array = "+,1,2,3,-4,5";
		StringCalculator s = new StringCalculator();
		
		String expected = "exception";
		assertEquals(expected, String.valueOf(s.add(array)));
	}
	
	@Test(expected=StringCalculatorException.class)
	public void invalid_input_with_some_character()throws StringCalculatorException{
		String array = "-,1,2,?,14,5,6";
		StringCalculator s = new StringCalculator();
		
		String expected = "exception";
		assertEquals(expected, String.valueOf(s.add(array)));
	}
	/*
	@Test()
	public void test_with_more_operand()throws StringCalculatorException{
		String array = "-,1,2,+,1,5,6";
		StringCalculator s = new StringCalculator();
		
		String expected = "11";
		assertEquals(expected, String.valueOf(s.add(array)));
	}*/
}
