package Chapter12;

// Fig. 12.45: PanelFrame.java
// Using a JPanel to help lay out components
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PanelFrame extends JFrame {
    
    private final JButton[] buttons;
    private final JPanel buttonsJPanel;
    
    public PanelFrame() {
        super("Panel Demo");
        buttons = new JButton[5];
        buttonsJPanel = new JPanel();
        buttonsJPanel.setLayout(new GridLayout(1, buttons.length, 2, 2));
        
        // create and add buttons
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonsJPanel.add(buttons[count]);
        }
        
        add(buttonsJPanel, BorderLayout.SOUTH); // add panel to JFrame        
    }
    
}


class PanelFrameTest {
    public static void main(String[] args) {
        PanelFrame panelFrame = new PanelFrame();
        panelFrame.setVisible(true);
        panelFrame.setSize(500, 200);
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
