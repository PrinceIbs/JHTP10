package Chapter12;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
    
    private final JButton plainButton;
    private final JButton fancyButton;
    
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());
        
        plainButton = new JButton("Plain Button");
        add(plainButton);
        
        Icon icon1 = new ImageIcon(getClass().getResource("icon1.png"));
        Icon icon2 = new ImageIcon(getClass().getResource("icon2.jpg"));
        fancyButton = new JButton("Fancy button", icon1);
        fancyButton.setRolloverIcon(icon2);
        add(fancyButton);
        
        // Register buttons
        ButtonHandler buttonHandler = new ButtonHandler();
        plainButton.addActionListener(buttonHandler);
        fancyButton.addActionListener(buttonHandler);
    }
    
    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(
                    ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
    
}

class ButtonTest {
    public static void main(String[] args) {
        ButtonFrame button = new ButtonFrame();
        button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setVisible(true);
        button.setSize(500, 300);
    }
}




