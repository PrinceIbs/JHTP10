package javaHowToProgram10Exercises;

// Sieve of Eratosthenes algorithm implementation of finding prime numbers

//A prime number is any integer greater than 1 that�s evenly divisible
//only by itself and 1. The Sieve of Eratosthenes is a method of finding prime numbers. It operates as
//follows:
//a) Create a primitive-type boolean array with all elements initialized to true. 
//Array elements with prime indices will remain true. All other array elements will eventually be
//set to false.
//b) Starting with array index 2, determine whether a given element is true. If so, loop
//through the remainder of the array and set to false every element whose index is a multiple of the index for the element with value true. 
//Then continue the process with the
//next element with value true. For array index 2, all elements beyond element 2 in the
//array that have indices which are multiples of 2 (indices 4, 6, 8, 10, etc.) will be set to
//false; for array index 3, all elements beyond element 3 in the array that have indices
//which are multiples of 3 (indices 6, 9, 12, 15, etc.) will be set to false; and so on.
//When this process completes, the array elements that are still true indicate that the index is a
//prime number. These indices can be displayed. 
//Write an application that uses an array of 1,000 elements to determine and display the prime numbers between 2 and 999. 
//Ignore array elements 0
//and 1.

public class Ex7_27 {
	
	public static void main(String[] args) {
            
            System.out.println("Using the seive of Erathosenes to print prime numbers.");
		
		// create and initialize array with all values set to false
		boolean[] list = new boolean[1000];

		// set all list's value to true
		for(int count = 0; count < 1000; count++) {
			list[count] = true;
		}
		
		for (int i = 2; i <= Math.sqrt(1000); i++) {
			if (list[i] == true) {
				for (int j = i * i, k = 1; j < 1000; j = i*i + k*i, k++) {
					list[j] = false;
				}
			}
		}
		
		// Display the result
		for (int i = 2; i < 1000; i++) {
			if (list[i] == true)
				System.out.println(i);
		}
		
	}

}
