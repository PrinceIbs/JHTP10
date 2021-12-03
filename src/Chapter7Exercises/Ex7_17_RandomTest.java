package javaHowToProgram10Exercises;

public class Ex7_17_RandomTest {
	
	public static void main(String[] args) {
		// create an object of class random
		Ex7_17_Random roll = new Ex7_17_Random();
		
		// create array of 13 elements
		int[] frequency = new int[13];
                
                System.out.println("Rolling 2 dice one thousand times and checking the frequency");
		
		// roll the dice one million times
		for (int counter = 0; counter < 1000000; counter++) {
			// roll the two dice
			int sum = roll.rollDie() + roll.rollDie();
			// increment frequency
			++frequency[sum];
		}
		
		System.out.printf("%s%10s%n", "Dice", "Frequency");

		for (int i = 2; i <= 12; i++) {
			System.out.printf("%3d%10d%n", i, frequency[i]);
		}
	}
}
