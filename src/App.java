import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * 练习 swing
 * @date 2021年8月18日15:37:55
 */
public class App {
    public void CreateJFrame(){
        JFrame jFrame = new JFrame("我的第一个swing程序");
        jFrame.setAlwaysOnTop(true);

        jFrame.setBackground(Color.BLACK);
        jFrame.setVisible(true);
        jFrame.addNotify();
        jFrame.setSize(600, 350);

        JLabel label = new JLabel();
        label.setText("Hello, World");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = jFrame.getContentPane();
        container.add(label);
    }
    public static void main(String[] args) {
        new App().CreateJFrame();
    }
}
