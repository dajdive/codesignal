package main.java.com.dajdive.codesignal.core.crossroads;

import java.util.Arrays;

public class CreateArray {

	/*
	 * Given an integer size, return array of length size filled with 1s.
	 * 
	 * Example
	 * 
	 * For size = 4, the output should be
	 * createArray(size) = [1, 1, 1, 1].
	 */
	public static int[] createArray(int size) {
	    int[] retArr = new int[size];
	    for (int i = 0; i < size; i++) {
	        retArr[i] = 1;
	    }
	    return retArr;
	}
	
	public static void main(String[] args) {
		// Driver class
		System.out.println(Arrays.toString(createArray(4)));

	}

}
