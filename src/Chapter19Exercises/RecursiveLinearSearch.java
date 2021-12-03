package Chapter19Exercises;

// Exercise 19.8: RecursiveLinearSearch.java

// Modify Fig. 19.2 to search the given array recursively
public class RecursiveLinearSearch {

    public static int recursiveLinearSearch(int[] data, int startIndex, int key) {
        if (data.length == startIndex) {
            return -1;
        } else if (key == data[startIndex]) {
            return startIndex;
        } else {
            return recursiveLinearSearch(data, ++startIndex, key);
        }
    }

    public static void main(String[] args) {
        int[] data = {7, 3, 8, 4, 2, 5, 1, 1, 9, 5};
        //int[] data = {1, 2, 3, 4, 5, 6, 7, 9, 8};
//        SecureRandom gen = new SecureRandom();
//        int[] data = new int[1000];
//        for (int i = 0; i < data.length; i++) 
//            data[i] = 1 + gen.nextInt(1000);

        int location = recursiveLinearSearch(data, 0, 1);
        System.out.println(location);
    }

}
