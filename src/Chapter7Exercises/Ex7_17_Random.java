package javaHowToProgram10Exercises;
import java.security.SecureRandom;

// Roll random numbers for dice 

public class Ex7_17_Random {
	static SecureRandom  random = new SecureRandom();
	
	public int rollDie() {
		// simulate rolling a die and getting a random number
		int face = 1 + random.nextInt(6);
		return face;
	}

}
