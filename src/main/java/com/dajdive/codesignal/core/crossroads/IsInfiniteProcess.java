package main.java.com.dajdive.codesignal.core.crossroads;

/*
 * Given integers a and b, determine whether the following pseudocode results in an infinite loop
 * 
 * while a is not equal to b do
 * 		increase a by 1
 * 		decrease b by 1
 * 
 * Assume that the program is executed on a virtual machine which can store arbitrary long numbers 
 * and execute forever.
 * 
 * Example
 * 
 * For a = 2 and b = 6, the output should be
 * isInfiniteProcess(a, b) = false;
 * 
 * For a = 2 and b = 3, the output should be
 * isInfiniteProcess(a, b) = true.
 */
public class IsInfiniteProcess {

	public static boolean isInfiniteProcess(int a, int b) {
	    // Do constriaints
	    if (a < 0 || b < 0) {
	        return false;
	    }
	    if (a > 20 || b > 20) {
	        return false;
	    }
	    
	    if (a == b) {
	        return false;
	    }

	    if (a + 1 > b - 1) {
	        return true;
	    }
	    if (a + 1 == b - 1) {
	        return false;
	    }
	    
	    if (a % 2 == 0 && b % 2 != 0) {
	        return true;
	    }
	    if (b % 2 == 0 && a % 2 != 0) {
	        return true;
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		// Driver class
		System.out.println(isInfiniteProcess(2, 6));
		System.out.println(isInfiniteProcess(2, 3));
	}

}
