package main.java.com.dajdive.codesignal.core.crossroads;

public class ExtraNumber {

	/*
	 * You're given three integers, a, b and c. It is guaranteed that two of these integers are 
	 * equal to each other. What is the value of the third integer?
	 * 
	 * Example
	 * 
	 * For a = 2, b = 7, and c = 2, the output should be
	 * extraNumber(a, b, c) = 7.
	 * 
	 * The two equal numbers are a and c. The third number (b) equals 7, which is the answer.
	 */
	public static int extraNumber(int a, int b, int c) {
	    // do constriaints
	    double maxValue = Math.pow(10, 9);
	    
	    if (a < 1 || b < 1 || c < 1) {
	        return 0;
	    }
	    if (a > maxValue|| b > maxValue || c > maxValue) {
	        return 0;
	    }
	    
	    if (a == b) {
	        return c;
	    } else if (a == c) {
	        return b;
	    } else if (b == c) {
	        return a;
	    }
	    
	    return 0;
	}
	public static void main(String[] args) {
		// Driver class
		System.out.println(extraNumber(2, 7, 2));
	}

}
