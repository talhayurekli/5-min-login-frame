import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    public LeftPanel() {
        setBackground(new Color(255, 255, 255));
        setPreferredSize(new Dimension(350, 500));

        ImageIcon icon = new ImageIcon("images/java.png");
        JLabel imageLabel = new JLabel(icon);
        add(imageLabel);
    }
}
