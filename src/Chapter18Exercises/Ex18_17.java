package Chapter18Exercises;

// Exercise 18.17: 
// Print an Array Backward
public class Ex18_17 {

    private static int counter;

    public static void stringReverse(char[] charArray) {
        if (counter < charArray.length) {
            System.out.print(charArray[counter]);
            stringReverse(charArray);
        }
        counter++;
    }

    public static void main(String[] args) {
        String string = "String";        
        stringReverse(string.toCharArray());
    }
}
