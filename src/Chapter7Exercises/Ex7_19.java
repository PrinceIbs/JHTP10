import java.util.Scanner;

// Airline Reservation System

//) A small airline has just purchased a computer for its new automated reservations system. 
//You�ve been asked to develop the new system. 
//You�re to write an application to assign seats on each flight of the airline�s only plane (capacity: 10 seats).
//Your application should display the following alternatives: Please type 1 for First Class and
//Please type 2 for Economy. If the user types 1, 
//your application should assign a seat in the firstclass section (seats 1�5). If the user types 2, 
//your application should assign a seat in the economy
//section (seats 6�10). Your application should then display a boarding pass indicating the person�s
//seat number and whether it�s in the first-class or economy section of the plane.
//Use a one-dimensional array of primitive type boolean to represent the seating chart of the
//plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
//each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
//no longer available.
//Your application should never assign a seat that has already been assigned. When the economy
//section is full, your application should ask the person if it�s acceptable to be placed in the first-class
//section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
//"Next flight leaves in 3 hours."

public class Ex7_19 {
	
	private static boolean seats[] = new boolean[10 + 1];
	private  static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// loops through all the seats
		for (int counter = 1; counter <= 10; counter++) {
			
			System.out.print("Please type 1 for First class and 2 for Economy: ");
			int choice = in.nextInt();
			
			// selects the user choice
			if (choice == 1) 
				firstClass();
			else if (choice == 2)
				economyClass();
			else 
				System.out.print("---Enter a valid value---\n");
				//counter--; 
		
		}
	}
	
	public static void firstClass() {
		System.out.println("\nWelcome to the First Class Lounge");
		boolean assigned = true;
		boolean filled = false;
		int seat = 0;
		
		// assign a first class seat to the passenger
		for (int i = 1; i <= 5; i++) {
			
			// if seat not assigned
			if (seats[i] != assigned) {
				seats[i] = assigned;
				seat = i;
				break;
			} else {
				// when last seat is filled
				if (seats[5] == assigned)
					filled = true;
			}
		}
		
		if (filled) {
			System.out.print(
				"First Class filled, Do you wish to board Economy Class (Y or N)? ");
			String board = in.next();
			
			if(board.equalsIgnoreCase("Y")) 
				economyClass();
			else if (board.equalsIgnoreCase("N")) 
				System.out.println("Next flight leaves in 3 hours");
		
		} else
			System.out.printf("Congrats, you've just boarded a First class flight %s %d%n%n",
					"Your seat number is", seat);
	}
	
	public static void economyClass() {
		System.out.println("\nWelcome to the Economy Class lounge.");
		boolean assigned = true;
		boolean filled = false;
		int seat = 0;
		
		for (int i = 6; i <= 10; i++) {
			if (seats[i] != assigned) {
				seats[i] = assigned;
				seat = i;
				break;
			} else {
				// when last seat is filled
				if (seats[10] == assigned)
					filled = true;
			}
		}
			// when the se
			if (filled) {
				System.out.print(
						"Second class filled, wish to board First Class (Y or N)? ");
				String board = in.next();
				
				if (board.equalsIgnoreCase("Y"))
					firstClass();
				else if (board.equalsIgnoreCase("N"))
					System.out.println("Next flight leaves in 3 hours");
			}
			else
				System.out.printf("Congrats, you've just boarded Economy class flight. %s %s%n%n",
						"Your seat number is ", seat);
		
	}

}
