

public class Calculator {

	public double evaluate(String expression) {
		//double result = Double.parseDouble(expression);
		//return result;
		double single_number;
		double result = 0.0;
		String[] numbers;

		
		if (expression.length() == 1) {
			single_number = Double.parseDouble(expression);
			return single_number;
		} else {
			
			if (expression.contains("+") && !expression.contains("-") && !expression.contains("*") && !expression.contains("/")) {
				numbers = expression.split("\\+");
				
				for (int i=0; i<numbers.length; i++) {
					result += Double.parseDouble(numbers[i]);
				}
				return result;
			}
			
			if (expression.contains("-") && !expression.contains("+") && !expression.contains("*") && !expression.contains("/")) {
				numbers = expression.split("-");
				result = Double.parseDouble(numbers[0]);
				
				for (int i=1; i<numbers.length; i++) {
					result -= Double.parseDouble(numbers[i]);
				}
				return result;
			}
			
			if (expression.contains("*") && !expression.contains("+") && !expression.contains("-") && !expression.contains("/")) {
				numbers = expression.split("\\*");
				result = 1.0;
				
				for (int i=0; i<numbers.length; i++) {
					result *= Double.parseDouble(numbers[i]);
				}
				return result;
			}
			
			if (expression.contains("/") && !expression.contains("+") && !expression.contains("-") && !expression.contains("*")) {
				numbers = expression.split("\\/");
				result = Double.parseDouble(numbers[0]);
				
				for (int i=1; i<numbers.length; i++) {
					result = result / Double.parseDouble(numbers[i]);
				}
				return result;
			}


			
			return result;
			
		}
	}
	
	public static void main(String[] args){
		
		Calculator c = new Calculator();
		
		System.out.println(c.evaluate("80/4"));
		
	/*	String test = "2/6/4-1";
		
	String[] r = test.split("\\*|\\/|\\+|-");
		
		for (int i =0; i< r.length; i++) {
			
			System.out.println(r[i]);
		}*/
		
	}
	
}

