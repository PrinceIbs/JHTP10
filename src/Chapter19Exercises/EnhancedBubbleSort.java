package Chapter19Exercises;

// Exercise 19.6: EnhancedBubbleSort.java

import java.security.SecureRandom;
import java.util.Arrays;

// Modify bubble sort in exercise 19.5 to <increase efficiency>

public class EnhancedBubbleSort {
    
    public static void bubbleSort(int[] data) {
        int iterationCount = 0;
        int swaps = 0;
        
        for (int pass = 0; pass < data.length; pass++) {
            // <data.length - pass> caused increased efficiency
            for (int index = 1; index < data.length - pass; index++) {
                if (data[index - 1] > data[index]) {
                    int temp = data[index - 1];
                    data[index - 1] = data[index];
                    data[index] = temp;
                    ++swaps;                    
                }
                ++iterationCount;               
            }
            if (swaps == 0)
                break;
        }
        System.out.println("Iteration count: " + iterationCount);
        System.out.println("Swaps: " + swaps);
    }
    
    public static void main(String[] args) {
        //int[] data = {2, 1, 9, 3, 5, 6, 4};
        //int[] data = {7, 3, 8, 4, 2, 5, 1, 1, 9, 5};
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        bubbleSort(data);
        System.out.println(Arrays.toString(data));
        
    }
}
