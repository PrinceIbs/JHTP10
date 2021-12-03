package Chapter12;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class LabelFrame extends JFrame {
    
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    
    public LabelFrame() {
        super("Testing Label");
        setLayout(new FlowLayout());
        
        // JLabel constrictor with string argument
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);
        
        // JLabe constructor with string, Icon and alignment arguments
        Icon icon = new ImageIcon(getClass().getResource("icon0.png"));
        label2 = new JLabel("Label with text and icon", icon, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);
        
        label3 = new JLabel();
        label3.setText("Label with icon and text at buttom");
        label3.setIcon(icon);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is lable3");
        add(label3);
        
    }
    
}




class LabelTest {
    
    public static void main(String[] args) {
     
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(800, 500);
        labelFrame.setVisible(true);   
    }
}
