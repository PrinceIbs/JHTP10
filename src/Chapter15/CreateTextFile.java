package Chapter15;

// Fig. 15.3: CreateTextFile.java
// Writing data to a sequential text file with class Formatter
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    
    private static Formatter output;
    
    public static void openFile() {
        try {
            output = new Formatter("c:\\users\\isaac\\downloads\\the owner\\temp\\003\\clients.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate program
            
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate program
        }
    }
    
    public static void addRecords() {        
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name, and balance.",
                "Enter end-of-file indicator (ctrl + z) to end input");
        int counter = 0;
        while (counter < 3) {
            try {
                // output new record to file; assumes a valid input
                output.format("%d %s %s %.2f%n", 
                        input.nextInt(), input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException noSuchElementException) {
                System.err.println("Invalid input. Try again.");
                input.nextLine(); // discard input so user can try again
            }
            
            System.out.print("? ");
            counter++;
        }
    }
    
    public static void closeFile() {
        if (output != null) 
            output.close();
    }
        
    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }
}
