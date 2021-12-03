package Chapter12Exercises;

//
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Ex12_9 extends JFrame {
    
    private final JTextField txtScreen;
    private final JButton btnOne;
    private final JButton btnTwo;
    private final JButton btnThree;
    private final JButton btnFour;
    private final JButton btnFive;
    private final JButton btnSix;
    private final JButton btnSeven;
    private final JButton btnEight;
    private final JButton btnNine;
    private final JButton btnZero;
    private final JButton btnDot;
    private final JButton btnEquals;
    private final JButton btnDivide;
    private final JButton btnMultiply;
    private final JButton btnSubtract;
    private final JButton btnAdd;
    
    private final JPanel screenPanel;
    private final JPanel btnPanel;
    
    public Ex12_9() {
        super("Calculator");
        
        screenPanel = new JPanel();
        btnPanel = new JPanel();
        
        screenPanel.setLayout(new GridLayout(1, 1, 3, 0));
        screenPanel.setBounds(20, 20, 20, 20);
        btnPanel.setLayout(new GridLayout(4, 4, 3, 3));        
        
        txtScreen = new JTextField(50);
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnZero = new JButton("0");
        btnDot = new JButton(".");
        btnEquals = new JButton("=");
        btnDivide = new JButton("/");
        btnMultiply = new JButton("*");
        btnSubtract = new JButton("-");
        btnAdd = new JButton("+");
        
        screenPanel.add(txtScreen);
        btnPanel.add(btnSeven);
        btnPanel.add(btnEight);
        btnPanel.add(btnNine);
        btnPanel.add(btnDivide);
        btnPanel.add(btnFour);
        btnPanel.add(btnFive);
        btnPanel.add(btnSix);
        btnPanel.add(btnMultiply);
        btnPanel.add(btnOne);
        btnPanel.add(btnTwo);
        btnPanel.add(btnThree);
        btnPanel.add(btnSubtract);
        btnPanel.add(btnZero);
        btnPanel.add(btnDot);
        btnPanel.add(btnEquals);
        btnPanel.add(btnAdd);
        
        
        add(screenPanel, BorderLayout.NORTH);
        add(btnPanel, BorderLayout.CENTER);
    }
            
}






class CalulatorTest {
    
    public static void main(String[] args) {
        Ex12_9 calculator = new Ex12_9();
        calculator.setVisible(true);
        calculator.setSize(250, 300);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
