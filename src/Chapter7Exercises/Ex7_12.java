package javaHowToProgram10Exercises;
// Duplicates Elimination

//(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
//Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
//is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
//in which all five numbers are different. Use the smallest possible array to solve this problem. Display
//the complete set of unique values input after the user enters each new value.


import java.util.Scanner;

public class Ex7_12 {
	
	public static void main(String[] args) {
		// create a scanner object
		Scanner in = new Scanner(System.in);
		int[] uniqueList = new int[5];
		boolean notUnique = false;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number between 10 and 100: ");
			int number = in.nextInt();
			
			if (number >= 10 & number <= 100) {
				
				// check weather num in unique list
				for(int num : uniqueList) {
					notUnique = num == number;
					if (notUnique) {
						System.out.println(num);
						break;
					}
					uniqueList[i] = number;
				}
			} else {
				System.out.println("Enter a valid number");
				continue;
			}
			
			System.out.print("Items on the new list: [ ");
			// print array of unique numbers
			for (int value : uniqueList)
				System.out.printf("%d ", value);
			
			System.out.print("]");
			System.out.println(); // new line
		}
	}

}
