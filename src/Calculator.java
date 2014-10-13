public class Calculator {

	public static double evaluate(String expression) {
		//double result = Double.parseDouble(expression);
		//return result;
		double single_number;
		double result;
		
		if (expression.length() == 1) {
			single_number = Double.parseDouble(expression);
			return single_number;
		} else {
			result = Double.parseDouble(String.valueOf(expression.charAt(0)));
			for (int i=1; i <= expression.length(); i++) {
				if (String.valueOf(expression.charAt(i)) == "+") {
					result += Double.valueOf(expression.charAt(i+1));
				}
			}
			return result;
		}
	}
	
	public static void main(String[] args){
		
		System.out.println(evaluate("2+2"));
	}
	
}

