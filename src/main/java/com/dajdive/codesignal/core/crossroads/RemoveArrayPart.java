package main.java.com.dajdive.codesignal.core.crossroads;

import java.util.Arrays;

public class RemoveArrayPart {

	public static void main(String[] args) {
	    
		
		int frontStop = 2;
		int rearStop = 4;
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int[] finalArr = new int[0 + frontStop + (arr.length - rearStop) - 1];
		
		int reverseStartPos = arr.length - 1;
		int finalReversePos = finalArr.length - 1;
		
	    for (int frontStartPos = 0; frontStartPos < arr.length; frontStartPos++) {
	    	if (frontStartPos < frontStop) {
	    		finalArr[frontStartPos] = arr[frontStartPos];
	    	}
	    	if (reverseStartPos > rearStop) {
	    		finalArr[finalReversePos] = arr[reverseStartPos];
	    		reverseStartPos--;
	    		finalReversePos--;
	    	}
	    }
	    System.out.println(Arrays.toString(finalArr));
	}

}
