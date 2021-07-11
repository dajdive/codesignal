package main.java.com.dajdive.codesignal.core.crossroads;

public class CountSumofTwoRepresentations2 {

	/*
	 * Given integers n, l and r, find the number of ways to represent n as a sum of two 
	 * integers A and B such that l ≤ A ≤ B ≤ r.
	 * 
	 * Example
	 * 
	 * For n = 6, l = 2, and r = 4, the output should be
	 * countSumOfTwoRepresentations2(n, l, r) = 2.
	 * 
	 * There are just two ways to write 6 as A + B, where 2 ≤ A ≤ B ≤ 4: 6 = 2 + 4 and 6 = 3 + 3.
	 */
	public static int countSumOfTwoRepresentations2(int n, int l, int r) {
	    return Math.max(0, Math.min(n/2-l, r-n/2) + (n+1) % 2);
	}
	
	public static void main(String[] args) {
		// Driver class
		System.out.print(countSumOfTwoRepresentations2(6, 2, 4));

	}

}
