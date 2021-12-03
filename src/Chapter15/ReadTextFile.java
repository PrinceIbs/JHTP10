package Chapter15;

// Fig. 15.6: ReadTextFile.java
// This program reads text file and displays each record
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;

public class ReadTextFile {

    private static Scanner input;

    public static void openFile() {
        try {
            input = new Scanner(Paths.get(
                    "c:\\users\\isaac\\downloads\\the owner\\temp\\003\\clients.txt"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void readFile() {
        String[][] data = new String[3][4];

        try {
            System.out.printf("%-10s%-12s%-12s%-10s%n",
                    "Account", "First Name", "Last Name", "Balance");
            int row = 0;
            while (input.hasNext()) {
                int account = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();
                // display record contents
                System.out.printf("%-10d%-12s%-12s%-10.2f%n",
                        account, firstName, lastName, balance);
                //System.out.print(input.next());
                data[row][0] = String.valueOf(account);
                data[row][1] = firstName;
                data[row][2] = lastName;
                data[row][3] = String.valueOf(balance);
                row++;
            }
            
            // Return file content as array
            System.out.println("\nData inside an array >>>");
            for (String[] inner : data) 
                System.out.println(Arrays.toString(inner));            
            
            // check balance using account number
            String account = "500";
            for (int i = 0; i < data.length; i++) 
                if (data[i][0].equals(account)) 
                    System.out.printf("User with account number %s has balance: %s%n", account, data[i][3]);                                    
            
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
            //System.exit(1);

        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
    }

    public static void closeFile() {
        if (input != null) {
            input.close();
        }
    }

    public static void main(String[] args) {
        openFile();
        readFile();
        closeFile();
    }
}
