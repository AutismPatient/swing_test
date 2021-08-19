import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * 练习 swing
 * @date 2021年8月18日15:37:55
 */
public class App {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyJFrame();
            }
        });
    }
}

