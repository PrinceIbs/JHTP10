package Chapter18;

// Fig. 18.5: FibonacciCalculator.java
// 
import java.math.BigInteger;

public class FibonacciCalculator {
    
    private static final BigInteger TWO = BigInteger.valueOf(2);
    
    public static BigInteger fibonacci(BigInteger number) {
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE))
            return BigInteger.ONE; // base case
        else 
            return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
    }
    
    public static void main(String[] args) {
        for (int count = 0; count < 20; count++) 
            System.out.printf("Fibonacci of %d is %d%n", count, fibonacci(BigInteger.valueOf(count)));
    }
}
