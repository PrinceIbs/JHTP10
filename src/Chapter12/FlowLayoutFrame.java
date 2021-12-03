package Chapter12;

// Fig. 12.39: FlowLayoutFrame.java
// FlowLayout allows components to flow over multiple lines
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {

    private final JButton leftJButton;
    private final JButton rightJButton;
    private final JButton centerJButton;
    private final FlowLayout layout;
    private final Container container;

    public FlowLayoutFrame() {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        //  set up leftJButton and register event listener
        leftJButton = new JButton("Left");
        add(leftJButton);
        leftJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );

        rightJButton = new JButton("Right");
        add(rightJButton);
        rightJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );

        centerJButton = new JButton("Center");
        add(centerJButton);
        centerJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );

        this.setVisible(true);
        this.setSize(300, 75);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new FlowLayoutFrame();

    }
}

//class FlowLayoutFrameTest {
//    public static void main(String[] args) {
//        FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
//        flowLayoutFrame.setVisible(true);
//        flowLayoutFrame.setSize(300, 75);
//        flowLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//    }
//}
