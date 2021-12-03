package Chapter19;

// Fig. 19.3: BinarySearchTest.java

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    
    private static String remainingElements(int[] data, int low, int high) {
        StringBuilder temporary = new StringBuilder();
        
        // append spaces for alignment
        for (int i = 0; i < low; i++) 
            temporary.append("   ");
        
        // append elements left in array
        for (int i = low; i <= high; i++) 
            temporary.append(data[i] + " ");
        
        return String.format("%s%n", temporary);
        //return temporary + "\n";        
    }
    
    public static int binarySearch(int[] data, int key) {
        int low = 0, high = data.length - 1;
        int middle = (low + high + 1) / 2;
        int location = -1;
        
        do {
            // print remaining elements of array
            System.out.print(remainingElements(data, low, high));
            
            // output spaces for alignment
            for (int i = 0;  i < middle; i++) 
                System.out.print("   ");
            System.out.println(" * "); // use asteric to indicate middle element
            
            if (key == data[middle]) 
                location = middle;
            else if (key < data[middle])
                high = --middle;
            else 
                low = ++middle;
            
            middle = (low + high + 1) / 2;
        } while ((low <= high) && location == -1);
        
        return location; // return location of search key
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        
        int[] data = new int[500];
        
        // populate array
        for (int i = 0; i < data.length; i++) 
            data[i] = 10 + generator.nextInt(90);
        
        Arrays.sort(data); // sort array85
        
        System.out.printf("%s%n%n", Arrays.toString(data)); // display array
        
        System.out.print("Please enter an integer value (-1 to quit): ");
        int searchInt = input.nextInt();
        
        while (searchInt != -1) {
            // perform search 
            int location = binarySearch(data, searchInt);
            
            if (location == -1)
                System.out.printf("%d was not found%n%n", searchInt);
            else 
                System.out.printf("%d was found at position %d%n%n", searchInt, location);
            
            // ask for user input again
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
        
    }
}
