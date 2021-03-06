package main.java.com.dajdive.codesignal.core.crossroads;

/* 
 * You found two items in a treasure chest! The first item weighs weight1 and is worth value1, 
 * and the second item weighs weight2 and is worth value2. What is the total maximum value of the 
 * items you can take with you, assuming that your max weight capacity is maxW and you can't come 
 * back for the items later?
 * 
 * Note that there are only two items and you can't bring more than one item of each type, i.e. 
 * you can't take two first items or two second items.
 * 
 * Example
 * 
 * For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4, and maxW = 8, the output should be
 * knapsackLight(value1, weight1, value2, weight2, maxW) = 10.
 * 
 * You can only carry the first item.
 * For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4, and maxW = 9, the output should be
 * knapsackLight(value1, weight1, value2, weight2, maxW) = 16.
 * 
 * You're strong enough to take both of the items with you.
 * 
 * For value1 = 5, weight1 = 3, value2 = 7, weight2 = 4, and maxW = 6, the output should be
 * knapsackLight(value1, weight1, value2, weight2, maxW) = 7.
 * 
 * You can't take both items, but you can take any of them.
 */
public class KnapsackLight {
	public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
	    // Do constraints
	    if (value1 < 2 || value1 > 20) {
	        return 0;
	    }
	    
	    if (value2 < 2 || value2 > 20) {
	        return 0;
	    }
	    
	    if (weight1 < 2 || weight1 > 10) {
	        return 0;
	    }
	    if (weight2 < 2 || weight2 > 10) {
	        return 0;
	    }
	    
	    if (maxW < 1 || maxW > 20) {
	        return 0;
	    }
	    
	    // Handle if the weights are above max
	    if (weight1 > maxW && weight2 > maxW) {
	        return 0;
	    }
	    
	    if (weight1 > maxW) {
	        return value2;
	    } else if (weight2 > maxW) {
	        return value1;
	    }
	    
	    if (weight1 + weight2 <= maxW) {
	        return value1 + value2;
	    }
	    
	    if (weight1 > weight2 && value1 > value2) {
	        return value1;
	    }
	    if (value1 > value2) {
	        return value1;
	    } else {
	        return value2;
	    }

	}

	public static void main(String[] args) {
		// Driver class
		System.out.println(knapsackLight(10, 5, 6, 4, 8));
		System.out.println(knapsackLight(10, 5, 6, 4, 9));
		System.out.println(knapsackLight(5, 3, 7, 4, 5));

	}

}
