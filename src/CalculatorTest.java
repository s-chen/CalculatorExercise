import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();
	
	/**Single Number**/
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
	
	/**Add two numbers**/
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
	
	/**Add more than 2 numbers**/
	@Test
	public void testEvaluateReturnsDoubleTenWhenStringTwoPlusThreePlusFiveIsPassedIn() {
		String expression = "2+3+5";
		assertEquals(10.0, calc.evaluate(expression), 0.0);
	}
	
	
	// Subtract - two numbers 
	@Test
	public void testEvaluateReturnsDoubleFourWhenStringEightMinusFourIsPassedIn() {
		String expression = "8-4";
		assertEquals(4.0, calc.evaluate(expression), 0.0);
	
	}
	
	// Subtract - more than two numbers
	@Test
	public void testEvaluateReturnsDoubleFiveWhenStringTenMinusThreeMinusTwoIsPassedIn() {
		String expression = "10-3-2";
		assertEquals(5.0, calc.evaluate(expression), 0.0);
	}
	
	// Multiply two numbers
	@Test
	public void testEvaluateReturnsDoubleTwentyFourWhenStringSixMultiplyFourIsPassedIn() {
		String expression = "6*4";
		assertEquals(24.0, calc.evaluate(expression), 0.0);
	
	}
	
	// Multiply more than two numbers
	@Test
	public void testEvaluateReturnsDoubleThirtyWhenStringTwoMultiplyThreeMultiplyFiveIsPassedIn() {
		String expression = "2*3*5";
		assertEquals(30.0, calc.evaluate(expression), 0.0);
	
	}
	
	// Divide - two numbers
	@Test
	public void testEvaluateReturnsDoubleThreeWhenStringNineDivideThreeIsPassedIn() {
		String expression = "9/3";
		assertEquals(3.0, calc.evaluate(expression), 0.0);
	
	}
	
	@Test
	public void testEvaluateReturnsDoubleTenWhenStringEightyDivideFourDivideTwoIsPassedIn() {
		String expression = "80/4/2";
		assertEquals(10.0, calc.evaluate(expression), 0.0);
	
	}
	
	
	
	
}
