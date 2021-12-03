package javaHowToProgram10Exercises;
// Variable-Length Argument List
//Write an application that calculates the product of a series
//of integers that are passed to method product using a variable-length argument list. 
//Test your method with several calls, each with a different number of arguments.

public class Ex7_14 {
	
	public static void main(String[] args) {
		
		// calls method to calculate the product of integers
		var(5, 4, 3, 2, 1);
		
	}
	public static void var(int...num) {
		
		int total = 1;
		for (int i = 0; i < num.length; i++) 
			total *= num[i];
			
		System.out.printf("Total is: %d", total);
	}

}
