package main.java.com.dajdive.codesignal.core.crossroads;

import java.util.Arrays;

/*
 * Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.
 * 
 * Example
 * 
 * For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3, the output should be
 * arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].
 */
public class ArrayReplace {

	public static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
	    for (int i = 0; i < inputArray.length; i++) {
	        if (inputArray[i] == elemToReplace) {
	            inputArray[i] = substitutionElem;
	        }
	    }
	    return inputArray;
	}
	
	public static void main(String[] args) {
		// Driver class
		int[] input = {1, 2, 1};
		System.out.print("Before: " + Arrays.toString(input) + "\n");
		System.out.println("After: " + Arrays.toString(arrayReplace(input, 1, 3)));

	}

}
