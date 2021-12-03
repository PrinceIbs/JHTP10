package javaHowToProgram10Exercises;

/*
 * Write statements that perform the following one-dimensional-array operations:
a) Set the 10 elements of integer array counts to zero.
b) Add one to each of the 15 elements of integer array bonus.
c) Display the five values of integer array bestScores in column format
 */

public class Ex7_11 {

	public static void main(String[] args) {
		
		// (a)
		int element[] = new int[10];
		
		// (b)
		int bonus[] = new int[15];
		for(int counter = 0; counter < bonus.length; counter++) {
			bonus[counter] += 1;
		}
		
		// (c)
		int bestScores[] = { 1, 5, 5, 9, 4 };
		for (int score : bestScores)
			System.out.println(score);
			
	}
}
