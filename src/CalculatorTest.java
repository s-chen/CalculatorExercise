import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Test
	public void testEvaluateReturnsDoubleFourWhenStringFourIsPassedIn() {
		String expression = "4";
		assertEquals(4.0, calc.evaluate(expression), 0.0);
	}

	@Test
	public void testEvaluateReturnsDoubleFiveWhenStringFiveIsPassedIn() {
		String expression = "5";
		assertEquals(5.0, calc.evaluate(expression), 0.0);
	}
	
	@Test
	public void testEvaluateReturnsDoubleFourWhenStringTwoPlusTwoIsPassedIn() {
		String expression = "2+2";
		assertEquals(4.0, calc.evaluate(expression), 0.0);
	
	}
	
	@Test
	public void testEvaluateReturnsDoubleFiveWhenStringTwoPlusThreeIsPassedIn() {
		String expression = "2+3";
		assertEquals(5.0, calc.evaluate(expression), 0.0);
	
	}
}
