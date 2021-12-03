package Chapter12;
// Fig. 12.21 ComboBoxFrame.java

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class ComboBoxFrame extends JFrame {

    private final JComboBox<String> imagesJComboBox;
    private final JLabel label;

    private static final String[] names = {
        "images/icon0.png", "images/icon1.png", "images/icon2.jpg", "images/icon3.png"};
    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))};

    public ComboBoxFrame() {
        super("JComboBox Testing");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox<>(names);
        imagesJComboBox.setMaximumRowCount(3);
        imagesJComboBox.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent event) {
                        if (event.getStateChange() == ItemEvent.SELECTED) {
                            label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                        }
                    }
                }
        );

        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }

}


class JComboBoxText {
    public static void main(String[] args) {
        ComboBoxFrame comboBox = new ComboBoxFrame();
        comboBox.setVisible(true);
        comboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBox.setSize(350, 150);
    }
}
