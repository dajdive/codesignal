package main.java.com.dajdive.codesignal.core.crossroads;

public class IsSumOfConsectutive2 {

    static int countConsecutive(int N)
    {
        // constraint on values of L gives us the
        // time Complexity as O(N^0.5)
        int count = 0;
        for (int L = 1; L * (L + 1) < 2 * N; L++) {
            double a = (double)((1.0 * N - (L * (L + 1)) / 2) / (L + 1));
            if (a - (int)a == 0.0)
                count++;
        }
        return count;
    }
    
	public static void main(String[] args) {
		// Driver class
		int N = 15;
        System.out.println(countConsecutive(N));
        N = 10;
        System.out.println(countConsecutive(N));

	}

}
