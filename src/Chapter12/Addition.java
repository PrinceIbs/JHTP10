package Chapter12;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Addition {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String num1 = JOptionPane.showInputDialog("Enter first integer");
        String num2 = JOptionPane.showInputDialog("Enter second integer");
        
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        // display result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(
                null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}
