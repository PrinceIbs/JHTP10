package Chapter18Exercises;

// Exercise 18.9: Recursive power method
import java.util.Scanner;

public class Ex18_9 {
    
    public static int pow(int base, int exp){
        if (exp == 1)
            return base;
        else
            return base * pow(base, exp - 1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter base and exponent separated by space >>> ");
        String[] number = input.nextLine().split(" ");
        
        int base = Integer.parseInt(number[0]);
        int exp = Integer.parseInt(number[1]);
        
        System.out.printf("%d to the power of %d = %d%n", base, exp, pow(base, exp));
    }
    
}
