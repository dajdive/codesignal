package main.java.com.dajdive.codesignal.core.crossroads;

import java.util.Arrays;

/*
 * Given two arrays of integers a and b, obtain the array formed by the elements of a 
 * followed by the elements of b.
 * 
 * Example
 * 
 * For a = [2, 2, 1] and b = [10, 11], the output should be
 * concatenateArrays(a, b) = [2, 2, 1, 10, 11]
 */
public class ConcatenateArrays {

	public static int[] concatenateArrays(int[] a, int[] b) {
	    int[] arr = null;
	    if (a != null && b != null) {
	        arr = new int[a.length + b.length];
	        for (int i = 0; i < a.length; i++) {
	            arr[i] = a[i];
	        }
	        for (int i = 0; i < b.length; i++) {
	            arr[a.length + i] = b[i];
	        }
	    }
	    
	    return arr;
	}

	public static void main(String[] args) {
		// Driver class
		int[] a = {2, 2, 1};
		int [] b = {10, 11};
		
		System.out.println("a = " + Arrays.toString(a) + "\n");
		System.out.println("b = " + Arrays.toString(b) + "\n");
		System.out.println("a + b = " + Arrays.toString(concatenateArrays(a, b)) + "\n");

	}

}
