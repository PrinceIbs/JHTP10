package Chapter18Exercises;

// Exercise 18.11: Greatest Common Divisor

public class Ex18_11 {
    private static int count = 1;
    
    public static int gcd(int x, int y) {
        System.out.printf("Level %d --> x = %d, y = %d%n", count, x, y);
        count++;
        
        if (y == 0)
            return x;
        else 
            return gcd(y, x % y);
    }
    
    
    public static void main(String[] args) {
        int x = 20;
        int y = 15;
        
        System.out.printf("%nThe GCD of %d and %d is %d%n", x, y, gcd(x, y));
    }
    
}
