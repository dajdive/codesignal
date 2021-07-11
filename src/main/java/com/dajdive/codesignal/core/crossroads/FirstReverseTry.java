package main.java.com.dajdive.codesignal.core.crossroads;

import java.util.Arrays;

/*
 * Reversing an array can be a tough task, especially for a novice programmer. 
 * Mary just started coding, so she would like to start with something basic at first. 
 * Instead of reversing the array entirely, she wants to swap just its first and last elements.
 * 
 * Given an array arr, swap its first and last elements and return the resulting array.
 * 
 * Example
 * 
 * For arr = [1, 2, 3, 4, 5], the output should be
 * firstReverseTry(arr) = [5, 2, 3, 4, 1].
 */
public class FirstReverseTry {

	public static int[] firstReverseTry(int[] arr) {
	    if (arr != null && arr.length > 0) {
	        Integer head = arr[0];
	        Integer tail = arr[arr.length-1];
	    
	        arr[0] = tail;
	        arr[arr.length-1] = head;
	    }
	    return arr;
	}
	
	public static void main(String[] args) {
		// Driver class
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(("Before: " + Arrays.toString(arr) + "\n"));
		System.out.print("After: " + Arrays.toString(firstReverseTry(arr)));

	}

}
