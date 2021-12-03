package Chapter19;

// Fig. 19.4: SelectionSortTest.java

import java.util.Arrays;

// Sorting an array with selection sort

public class SelectionSortTest1 {
    
    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i;
            
            for (int index = i + 1; index < data.length; index++) 
                if (data[index] < data[smallest])
                    smallest = index;            
            
            // swap the smallest with i
            int temp =  data[i];
            data[i] = data[smallest];
            data[smallest] = temp;
        }
    }
    
    public static void main(String[] args) {        
        int[] data = {9, 3, 4, 1, 0, 2, 5, 9, 0, -1};
        selectionSort(data);
        System.out.println(Arrays.toString(data));
    }
    
}
