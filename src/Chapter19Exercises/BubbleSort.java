package Chapter19Exercises;

// Exercise 19.5: BubbleSort.java
import java.security.SecureRandom;
import java.util.Arrays;

// Implement the bubble sort algorithm
public class BubbleSort {

    public static void bubbleSort(int[] data) {
        int iterationCount = 0;
        for (int pass = 0; pass < data.length; pass++) {
            for (int i = 1; i < data.length; i++) {
                if (data[i - 1] > data[i]) {
                    int temp = data[i - 1];
                    data[i - 1] = data[i];
                    data[i] = temp;
                }
                ++iterationCount;
            }          
        }
        System.out.println("Iteration count: " + iterationCount);
    }

    public static void main(String[] args) {
        //int[] data = {7, 3, 8, 4, 2, 5, 1, 1, 9, 5};
        int[] data = {1, 2, 3, 4, 5, 6, 7, 9, 8};
//        SecureRandom gen = new SecureRandom();
//        int[] data = new int[1000];
//        for (int i = 0; i < data.length; i++) 
//            data[i] = 1 + gen.nextInt(1000);

        bubbleSort(data);
        System.out.println(Arrays.toString(data));
    }

}

// Bubble sort algorithm
/*
INPUT: Unsorted array A of length n
OUTPUT: Sorted array A
1. for i = 0 to n - 1
2.     for j = 1 to n - i
3.         if (A[i - 1] > A[i])
4.             temp = A[i - 1]
5.             A[i - 1] = A[i]
6.             A[i] = temp
7.         end if
8.     end for
9. end for
10. return A
*/
