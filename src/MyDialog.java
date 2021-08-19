import javax.swing.*;
import java.awt.*;

public class MyDialog extends JDialog {
    public MyDialog() {
        super(new MyJFrame(), "窗体", true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        this.add(new JLabel("你好吗，猪大肠"));
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
    }
}
