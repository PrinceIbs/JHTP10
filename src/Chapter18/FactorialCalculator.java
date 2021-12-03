package Chapter18;

// Fig. 18.3: FactorialCalculator.java
// Recursive factorial method

public class FactorialCalculator {
    
    public static long factorial(long number) {
        if (number <= 1)
            return 1; // base case
        else 
            return number * factorial(number - 1);        
    }
    
    // Iterative approach to factorial problem
//    public static int itrFactorial(int n) {
//        int factorial = 1;
//        for(int count = n; count >= 1; count--)
//            factorial *= count;
//        
//        return factorial;
//    }
    
    public static void main(String[] args) {
        for(int count = 0; count <= 30; count++) {
            System.out.printf("%d! = %d%n", count, factorial(count));
        }
    }
}
