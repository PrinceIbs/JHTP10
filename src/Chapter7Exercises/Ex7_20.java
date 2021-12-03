package javaHowToProgram10Exercises;
import java.security.SecureRandom;

// Total Sales

//Use a two-dimensional array to solve the following problem: A company has
//four salespeople (1 to 4) who sell five different products (1 to 5). Once a day, each salesperson passes
//in a slip for each type of product sold. Each slip contains the following:
//a) The salesperson number
//b) The product number
//c) The total dollar value of that product sold that day
//Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information
//from all the slips for last month is available. 
//Write an application that will read all this information for
//last month’s sales and summarize the total sales by salesperson and by product. All totals should be
//stored in the two-dimensional array sales. After processing all the information for last month, 
//display the results in tabular format, with each column representing a salesperson and each row representing a particular product. 
//Cross-total each row to get the total sales of each product for last month.
//Cross-total each column to get the total sales by salesperson for last month. Your output should
//include these cross-totals to the right of the totaled rows and to the bottom of the totaled columns. 

public class Ex7_20 {
	
	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		// dummy array of sales
		int sales[][] = new int[5][4];
		int totalPerson = 0; // total of each person's sale
		int totalProduct = 0; // total of each product's sale
		int totalSales = 0; // overall total sales
		double multiples = 1.5;
		
		// fill the array with random amounts between 1000 and 16,000 
		for (int row = 0; row < sales.length; row++) {
			for (int column = 0; column < sales[row].length; column++) {
				sales[row][column] = (int) (1000 + multiples * random.nextInt(10000));
			}
		}
		
		// display column heading 
		System.out.print("   Label  |");
		for (int counter = 1; counter <= sales[0].length; counter++) {
			System.out.printf("%8s #%d|","Person", counter);
		}
		
		// displays total label
		System.out.print(" Total\n");
		
		// prints vertical line
		for (int i = 2; i <= 68; i++) 
			System.out.print("-");
		
		System.out.println(); // new line
		
		// prints product name and total sales amount of each product
		for (int row = 0; row <= 4; row++) {
			for (int column = 0; column <= 4; column++) {
				//display product name at first column
				if (column == 0)
					System.out.printf("%nProduct #%d", row + 1);
				else {
					System.out.printf("|%,11d", sales[row][column - 1]);
					totalPerson += sales[row][column - 1];
				}
			}
			System.out.printf("| %,2d", totalPerson);
			System.out.println(); // new line
			totalPerson = 0; // reset totalPerson to zero
		}
		
		// vertical line
		for (int i = 1; i<= 68; i++)
			System.out.print("-");
		
		// displays total label
		System.out.printf("%n%10s|", "Total");
		
		// prints the total of each sales person sales
		for (int column = 0; column <= sales[0].length - 1; column++) {
			// loop through the inner array
			for (int row = 0; row <= sales.length - 1; row++) {
				totalProduct += sales[row][column];
			}
			totalSales += totalProduct;
			System.out.printf("%,11d|", totalProduct);
			totalProduct = 0; // reset totalProduct to zero
		}
		
		// displays overall total
		System.out.printf(" %,2d", totalSales);
		
	}

}
