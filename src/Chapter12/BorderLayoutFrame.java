package Chapter12;

// Fig. 12.41: BorderLayoutFrame.java
// BorderLayout containing five JButtons
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener {
    
    private final JButton[] buttons;
    private final String[] names = {
        "Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
    private final BorderLayout layout;

    
    public BorderLayoutFrame () {
        super("Border Layout Testing");
        
        layout = new BorderLayout(2, 2);
        setLayout(layout);
        buttons = new JButton[names.length];
        
        //
        for(int count = 0; count < names.length; count++) {
           buttons[count] = new JButton(names[count]);
           buttons[count].addActionListener(this);
        }
        
        // add buttons to container
        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);        
    }
    
    // handle button events
    @Override
    public void actionPerformed(ActionEvent event) {
        for(JButton button : buttons) {
            if (event.getSource() == button)
                button.setVisible(false);
            else
                button.setVisible(true);
        }
        
        layout.layoutContainer(getContentPane());
    }
}


class TestBorderLayoutFrame {
    public static void main(String[] args) {
        BorderLayoutFrame layoutFrame = new BorderLayoutFrame();
        layoutFrame.setVisible(true);
        layoutFrame.setSize(500, 200);
        layoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
