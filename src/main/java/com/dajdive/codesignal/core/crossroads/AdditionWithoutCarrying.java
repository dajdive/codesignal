package main.java.com.dajdive.codesignal.core.crossroads;

/*
 * A little boy is studying arithmetic. He has just learned how to add two integers, 
 * written one below another, column by column. But he always forgets about the important 
 * part - carrying.
 * 
 * Given two integers, your task is to find the result which the little boy will get.
 * 
 * Note: The boy had learned from this site, so feel free to check it out too if you 
 * are not familiar with column addition.
 * 
 * Example
 * 
 * For param1 = 456 and param2 = 1734, the output should be
 * additionWithoutCarrying(param1, param2) = 1180.
 * 
 *    456
 *   1734
 * + ____
 *   1180
 *   
 *   The boy performs the following operations from right to left:
 *   
 *   6 + 4 = 10 but he forgets about carrying the 1 and just writes down the 0 in the last column
 *   5 + 3 = 8
 *   4 + 7 = 11 but he forgets about the leading 1 and just writes down 1 under 4 and 7.
 *   There is no digit in the first number corresponding to the leading digit of the second one, 
 *   so the boy imagines that 0 is written before 456. Thus, he gets 0 + 1 = 1.
 */
public class AdditionWithoutCarrying {

	public static int additionWithoutCarrying(int param1, int param2) {
        int res = 0;
        int multiplier = 1;
        int bit_sum;
 
        // Add numbers till each
        // number become zero
        while (true) {
                 
            if(param1==0 && param2==0)
                break;
 
            // Add each bits
            bit_sum = (param1 % 10) + (param2 % 10);
 
            // Neglect carry
            bit_sum %= 10;
 
            // Update result
            res = (bit_sum * multiplier) + res;
            param1 /= 10;
            param2 /= 10;
 
            // Update multiplier
            multiplier *= 10;
           
        }
        return res;
}
	
	public static void main(String[] args) {
		// Driver class
		System.out.print(additionWithoutCarrying(456, 1734));

	}

}
