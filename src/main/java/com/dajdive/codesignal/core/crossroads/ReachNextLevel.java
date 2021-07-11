package main.java.com.dajdive.codesignal.core.crossroads;

public class ReachNextLevel {

	public static boolean reachNextLevel(int experience, int threshold, int reward) {
		return (experience + reward >= threshold ? true : false);
	}
	
	public static void main(String[] args) {
		// Driver class

		System.out.println(reachNextLevel(10, 15, 5));
	}

}
