package main.java.com.dajdive.codesignal.core.crossroads;

/*
 * Consider an arithmetic expression of the form a#b=c. Check whether it is possible to 
 * replace # with one of the four signs: +, -, * or / to obtain a correct expression.
 * 
 * Example
 * 
 * For a = 2, b = 3, and c = 5, the output should be
 * arithmeticExpression(a, b, c) = true.
 * 
 * We can replace # with a + to obtain 2 + 3 = 5, so the answer is true.
 * 
 * For a = 8, b = 2, and c = 4, the output should be
 * arithmeticExpression(a, b, c) = true.
 * 
 * We can replace # with a / to obtain 8 / 2 = 4, so the answer is true.
 *
 * For a = 8, b = 3, and c = 2, the output should be
 * arithmeticExpression(a, b, c) = false.
 * 
 * 8 + 3 = 11 ≠ 2;
 * 8 - 3 = 5 ≠ 2;
 * 8 * 3 = 24 ≠ 2;
 * 8 / 3 = 2.(6) ≠ 2.
 * So the answer is false.
 */
public class ArithmeticExpression {

	public static boolean arithmeticExpression(int a, int b, int c) {
	    // Do constraints
	    if (a > 0 && a > 20) {
	        return false;
	    }
	    if (b > 0 && b > 20) {
	        return false;
	    }
	    if (c > 0 && c > 20) {
	        return false;
	    }
	    
	    // Do Logic
	    if (a + b == c) {
	        return true;
	    }
	    if (a - b == c) {
	        return true;
	    }
	    if (a * b == c) {
	        return true;
	    }
	    if ((double) a / (double) b == c) {
	        return true;
	    }
	 
	    return false;
	}
	public static void main(String[] args) {
		// Driver class
		System.out.println(arithmeticExpression(2, 3, 5));
		System.out.println(arithmeticExpression(8, 2, 4));
		System.out.println(arithmeticExpression(8, 3, 2));

	}

}
