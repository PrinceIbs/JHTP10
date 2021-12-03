package Chapter12;
// Fig. 12.19: RadioButtonFrame.java

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class RadioButtonFrame extends JFrame {

    private final JTextField textField;
    private final Font plainFont;
    private final Font boldFont;
    private final Font italicFont;
    private final Font boldItalicFont;
    private final JRadioButton plainRadioButton;
    private final JRadioButton boldRadioButton;
    private final JRadioButton italicRadioButton;
    private final JRadioButton boldItalicRadioButton;
    private final ButtonGroup buttonGroup;
    private final JButton jButton;

    public RadioButtonFrame() {
        super("JRadioButton Testing");
        setLayout(new FlowLayout());

        // add text field to JFrame
        textField = new JTextField("Watch the font style change", 25);
        add(textField);

        // Define fonts 
        plainFont = new Font("Serif", Font.PLAIN, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

        textField.setFont(plainFont);

        // Initialize and add radio buttons
        plainRadioButton = new JRadioButton("Plain");
        italicRadioButton = new JRadioButton("Italic");
        boldRadioButton = new JRadioButton("Bold");
        boldItalicRadioButton = new JRadioButton("Bold/Italic");
        add(plainRadioButton);
        add(italicRadioButton);
        add(boldRadioButton);
        add(boldItalicRadioButton);
        
        // Additional Button to clear selection
        jButton = new JButton("Clear Selection");
        add(jButton);
        
        JButtonHandler jBtnHandler = new JButtonHandler();
        jButton.addActionListener(jBtnHandler);
        
        

        // create logical relationship between JRadioButtons
        buttonGroup = new ButtonGroup();
        buttonGroup.add(plainRadioButton);
        buttonGroup.add(italicRadioButton);
        buttonGroup.add(boldRadioButton);
        buttonGroup.add(boldItalicRadioButton);

        // Register RadioButtonHandler
        plainRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        italicRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        boldItalicRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));

    }

    private class RadioButtonHandler implements ItemListener {

        Font font;

        public RadioButtonHandler(Font font) {
            this.font = font;
        }

        @Override
        public void itemStateChanged(ItemEvent event) {
            textField.setFont(font);
        }
    }
    
    private class JButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonGroup.clearSelection();
            textField.setFont(plainFont);
        }
        
    }

}

class JRadioButtonTest {

    public static void main(String[] args) {
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
        radioButtonFrame.setVisible(true);
        radioButtonFrame.setSize(350, 130);
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
