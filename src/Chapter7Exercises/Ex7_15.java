package javaHowToProgram10Exercises;
import java.util.Scanner;

// fibonacci series

public class Ex7_15 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter series numner: ");
		int ser = in.nextInt();
		
		fibonacci(ser);
		
	}
	
	public static void fibonacci(int n) {
		int r = 0, s = 1, t = 0;
		for(int counter = 1; counter <= n; counter++) {
			System.out.println(t);
			t = r + s;
			r = s;
			s = t;
		}
	}

}
