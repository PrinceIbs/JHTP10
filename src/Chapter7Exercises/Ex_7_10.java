package javaHowToProgram10Exercises;
// Exercise: 7.10
// Sales Commissions
//Use a one-dimensional array to solve the following problem: A company pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
//their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week receives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
//that determines how many of the salespeople earned salaries in each of the following ranges (assume
//that each salesperson’s salary is truncated to an integer amount):
//a) $200–299
//b) $300–399
//c) $400–499
//d) $500–599
//e) $600–699
//f) $700–799
//g) $800–899
//h) $900–999
//i) $1,000 and over
//Summarize the results in tabular format

import java.security.SecureRandom;

public class Ex_7_10 {
	
	public static void main(String[] args) {
		// create a random object
		SecureRandom random = new SecureRandom();
		final int START = 200;
		
		// create an array of random gross sales
		int[] grosses = new int[20];
		int[] earnings = new int[grosses.length];
		for (int counter = 0; counter < grosses.length; counter++) {
			grosses[counter] = 10 + random.nextInt(110) * 100; // random numbers of multiples of 1000
			
		}
		
		// store each salary in a one-dimensional array
		for(int counter = 0; counter < grosses.length; counter++) {
			int wage = (grosses[counter]/100) * 9 + START;
			earnings[counter] = wage;
		
		}
		
		// display the result in tabular form
		for(int earning : earnings)
			System.out.println(earning);
		
		// to be continued
	}

}
