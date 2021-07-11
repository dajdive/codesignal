package main.java.com.dajdive.codesignal.core.crossroads;

public class LeastFactorial {

	/*
	 * Given an integer n, find the minimal k such that
	 * 
	 * k = m! (where m! = 1 * 2 * ... * m) for some integer m;
	 * k >= n.
	 * 
	 * In other words, find the smallest factorial which is not less than n.
	 * 
	 * Example
	 * 
	 * For n = 17, the output should be
	 * leastFactorial(n) = 24.
	 * 
	 * 17 < 24 = 4! = 1 * 2 * 3 * 4, while 3! = 1 * 2 * 3 = 6 < 17).
	 */
	public static int leastFactorial(int n) {
	    // Do Constraints
	    if (n < 0 || n > 120) {
	        return 0;
	    }
	    
	    int factoral = 1;
	    int counter = 1;
	    while (factoral < n) {
	        factoral = factoral * (counter++);
	    }
	    return factoral;
	}
	
	public static void main(String[] args) {
		// Driver class
		System.out.println(leastFactorial(17));
	}

}
