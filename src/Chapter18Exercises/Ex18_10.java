package Chapter18Exercises;

// Exercise 18.10: Visualizing Recursion
public class Ex18_10 {

    static int count = 1;

    public static long factorial(long number) {
        System.out.printf("number after %d call: %d%n", count, number);
        count++;
        
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.printf("%d! = %d%n", number, factorial(number));
    }

}
