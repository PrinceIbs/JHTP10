package Chapter12;
// Fig. 12.17: CheckBoxFrame.java

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;


public class CheckBoxFrame extends JFrame {
    
    private final JTextField textField;
    private final JCheckBox boldCheckBox;
    private final JCheckBox italicCheckBox;
    
    public CheckBoxFrame()  {
        super("JCheckBox Testing");
        setLayout(new FlowLayout());
        
        // set text field
        textField = new JTextField("Watch this text change right now", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 15));
        add(textField);
        
        boldCheckBox = new JCheckBox("Bold");
        italicCheckBox = new JCheckBox("Italic");
        add(boldCheckBox);
        add(italicCheckBox);  
        
        // register handler with the buttons
        CheckBoxHandler handler = new CheckBoxHandler();
        boldCheckBox.addItemListener(handler);
        italicCheckBox.addItemListener(handler);
        
        
    }
    
    private class CheckBoxHandler implements ItemListener {
        
        @Override
        public void itemStateChanged(ItemEvent event) {
            Font font = null;
            
            if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) 
                font = new Font("Serif", Font.ITALIC + Font.BOLD, 14); 
            else if (boldCheckBox.isSelected()) 
                font = new Font("Serif", Font.BOLD, 14);
            else if (italicCheckBox.isSelected()) 
                font = new Font("Serif", Font.ITALIC, 14);                                    
               
            textField.setFont(font);
        }
    }
}




class TestCheckBox {
    public static void main(String[] args) {
        CheckBoxFrame checkBox = new CheckBoxFrame();
        checkBox.setVisible(true);
        checkBox.setSize(250, 100);
        checkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}