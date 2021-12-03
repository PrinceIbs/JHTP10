package Chapter15Exercises.FileMatchingAccounts;

import java.util.Scanner;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.io.FileNotFoundException;

public class FileMatch {
    
    private static TransactionRecord[] transactionRecord = new TransactionRecord[5];
    private static Account[] account = new Account[5];
    private static Scanner transactionInput;
    private static Scanner oldMasterInput;
    private static Formatter newMasterOutput;
    private static Formatter logOutput;
    
    public static void readTransactionFile() {
        // open transaction file
        try {
            transactionInput = new Scanner(Paths.get(
                    "C:\\Users\\ISAAC\\Documents\\NetBeansProjects\\JHTP10\\src\\Chapter15Exercises\\FileMatchingAccounts\\trans.txt"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }
        
        // read data from transaction file into memory
        int count = 0;
        while (transactionInput.hasNext()) {
            try {
                int accountNumber = transactionInput.nextInt();
                double amount = transactionInput.nextDouble();
                TransactionRecord record = new TransactionRecord(accountNumber, amount);                
                transactionRecord[count] = record;     
                count++;
            } catch (NoSuchElementException elementException) {
                System.err.println("File not properly formed. Terminating.");
            } catch (IllegalStateException stateException) {
                System.err.println("Error reading from file. Terminating.");
            }            
        }
        
        // close file
        if (transactionInput != null)
            transactionInput.close();        
    }
    
    // read data from old master file
    public static void readOldMasterFile() {        
        // open old master file
        try {
            oldMasterInput = new Scanner(Paths.get(
                    "C:\\Users\\ISAAC\\Documents\\NetBeansProjects\\JHTP10\\src\\Chapter15Exercises\\FileMatchingAccounts\\oldMast.txt"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }
        
        // read data from old master file into the memory
        int counter = 0;
        while (oldMasterInput.hasNext()) {
            try {
                int accountNumber = oldMasterInput.nextInt();
                String firstName = oldMasterInput.next();
                String lastName = oldMasterInput.next();
                double balance = oldMasterInput.nextDouble();
                
                Account oldMasterAccount = new Account(
                        accountNumber, firstName, lastName, balance);                
                account[counter] = oldMasterAccount;
                counter++;
            } catch (NoSuchElementException elementException) {
                System.err.println("Error reading from file. Terminating.");
            } catch (IllegalStateException stateException) {
                System.err.println("File not properly formed. Terminating.");
            }            
        }              
    }
    
    public static void createNewMasterFile() {
        readOldMasterFile();
        readTransactionFile();
        // open new master file and log file
        try {
            newMasterOutput = new Formatter(
                    "C:\\Users\\ISAAC\\Documents\\NetBeansProjects\\JHTP10\\src\\Chapter15Exercises\\FileMatchingAccounts\\newMast.txt");
            logOutput = new Formatter(
                    "C:\\Users\\ISAAC\\Documents\\NetBeansProjects\\JHTP10\\src\\Chapter15Exercises\\FileMatchingAccounts\\log.txt");
        } catch (FileNotFoundException fileException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        } catch (SecurityException securityException) {
            System.err.println("Writing permission denied. Terminating");
            System.exit(1);
        }
        
        // add record to new master file        
        for (int i = 0; i < account.length; i++) {
            for (int j = 0; j < transactionRecord.length; j++) {
                if (account[i].getAccount() == transactionRecord[j].getAccount()) {
                    int accountNumber = account[i].getAccount();
                    String firstName = account[i].getFirstName();
                    String lastName = account[i].getLastName();
                    double balance = account[i].getBalance();                    
                    
                    Account newMaster = new Account(accountNumber, firstName, lastName, balance);
                    newMaster.combine(transactionRecord[j]);
                    
                    System.out.println("Adding record to new master file...");
                    newMasterOutput.format("%-10d%-10s%-10s%-10.2f%n", 
                            newMaster.getAccount(), newMaster.getFirstName(),
                            newMaster.getLastName(), newMaster.getBalance());
                }
            }
        }
        
        // add record to log file        
        for (int i = 0; i < transactionRecord.length; i++) {
            boolean accountExists = false;
            for (int j = 0; j < account.length; j++) {                
                if (transactionRecord[i].getAccount() == account[j].getAccount()) 
                    accountExists = !accountExists;                                                
            }
            if (!accountExists) {
                int accountNumber = transactionRecord[i].getAccount();
                System.out.println("Adding record to log file...");
                logOutput.format("Unmatched transaction record for account number %d%n", accountNumber);
            }
        }
        
        // close opened files
        if (newMasterOutput != null) 
            newMasterOutput.close();
        if (logOutput != null)
            logOutput.close();
    }
    
    public static void main(String[] args) {
        createNewMasterFile();
    }
    
}
