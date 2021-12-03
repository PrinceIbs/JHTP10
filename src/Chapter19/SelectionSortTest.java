package Chapter19;

// Fig. 19.4: SelectionSortTest.java
public class SelectionSortTest {
    
    public static void swap(int[] data, int first, int second) {
        int temp = data[first];
        data[first] = data[second];
        data[second] = data[first];        
    }
    
    public static void printPass(int[] data, int pass, int index) {
        
        System.out.printf("afterpass %2d", pass);
        
        // output elements till selected item
        for (int i = 0; i < index; i++) 
            System.out.printf("%d ", data[i]);
        
        System.out.printf("%d* ", data[index]); // indicate swap
        
        // finish outputting array
        for (int i = index + 1; i < data.length; i++) 
            System.out.printf("%d ", data[i]);
        
        System.out.printf("%n               "); // alignment
        
        // indicate amount of array sorted
        for (int j = 0; j < pass; j++) 
            System.out.print("--  ");
        
        System.out.println();
    }
    
    public static void selectionSort(int[] data) {
        // loop over data.length -1 elements
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i;
            
            // loop to find index of smallest element
            for (int index = i + 1; index < data.length; index++)
                if (data[index] < data[smallest])
                    smallest = index;
            
            swap(data, i, smallest);// swap smallest element into position
            //printPass(i + 1, smallest); // 
        }
    }
    
}
