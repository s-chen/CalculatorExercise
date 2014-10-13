public class Calculator {

	public double evaluate(String expression) {
		//double result = Double.parseDouble(expression);
		//return result;
		double single_number;
		double result;
		
		if (expression.length() == 1) {
			single_number = Double.parseDouble(expression);
			return single_number;
		} else {
			result = Double.valueOf(expression.substring(0, expression.indexOf("+"))) + Double.valueOf(expression.substring(expression.indexOf("+") + 1, expression.length()));
			return result;
		}
	}
	
	public static void main(String[] args){
		
		Calculator c = new Calculator();
		
		System.out.println(c.evaluate("255+1450"));
	}
	
}

