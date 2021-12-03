package Chapter15Exercises.FileMatchingAccounts;

// CreateData.java
// Create data to be used for testing the program
import java.util.Formatter;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateData {
    private static Formatter oldMasterOutput;
    private static Formatter transOutput;
    private static Scanner input;
    
    // open old master file
    public static void openOldMasterFile() {
        try {
            oldMasterOutput = new Formatter(
                    "C:\\Users\\ISAAC\\Documents\\NetBeansProjects\\JHTP10\\src\\Chapter15Exercises\\FileMatchingAccounts\\oldMast.txt");
        } catch(FileNotFoundException fileException) {
            System.err.println("Failed to open file. Terminating.");
            System.exit(1);
        }   
    }
    
    // add record to old master file
    public static void addOldMaster() {        
        input = new Scanner(System.in);
        System.out.printf("%s %s %s %s%n", 
                "<Account>", "<First Name>", "<Last Name>", "<Balance>");
        int count = 0;
        while (count < 5) {
            System.out.print("? ");
            try {
                oldMasterOutput.format("%-10d%-10s%-10s%-10.2f%n",
                        input.nextInt(), input.next(), input.next(), input.nextDouble());
            } catch (NoSuchElementException elementException) {
                System.out.println("Invalid input. Try again");
                input.nextLine(); // clear scanner for new input
            }            
            count++;            
        }
        //System.out.println();
    }
    
    // close old master file
    public static void closeOldMasterFile() {
        if (oldMasterOutput != null)
            oldMasterOutput.close();
    }
    
    // open transaction file
    public static void openTransactionFile() {
        try {
            transOutput = new Formatter(
                    "C:\\Users\\ISAAC\\Documents\\NetBeansProjects\\JHTP10\\src\\Chapter15Exercises\\FileMatchingAccounts\\trans.txt");
        } catch(FileNotFoundException fileException) {
            System.err.println("Failed to open file. Terminating.");
            System.exit(1);
        }  
    }
    
    // add record to the transaction file
    public static void addTransaction() {
        input = new Scanner(System.in);
        System.out.printf("%s %s%n", "<Account>", "<Amount>");
        int counter = 0;
        while (counter < 5) {
            System.out.print("? ");
            try {
                transOutput.format("%-10d%-10.2f%n",
                        input.nextInt(), input.nextDouble());
            } catch (NoSuchElementException elementException) {
                System.out.println("Invalid input. Try again");
                input.nextLine(); // clears input
            }            
            counter++;            
        }
       // System.out.println();
    }
    
    // close transaction file
    public static void closeTransactionFile() {
        if (transOutput != null)
            transOutput.close();
    }
    
    public static void createOldMaster() {
        System.out.println("Create data for old master file");
        openOldMasterFile();
        addOldMaster();
        closeOldMasterFile();      
        System.out.println("------------------------------------");                  
    }
    
       public static void createTransactionFile() {
        System.out.println("Create data for transaction file");
        openTransactionFile();
        addTransaction();
        closeTransactionFile();      
        System.out.println("------------------------------------");                  
    }
    
    
    public static void main(String[] args) {
        createOldMaster();
        System.out.println();
        createTransactionFile();
    }
    
}
