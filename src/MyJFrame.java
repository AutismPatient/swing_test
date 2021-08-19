import javax.swing.*;
import javax.swing.text.Style;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyJFrame extends JFrame {
    public MyJFrame(){
        int width = 600;
        int height = 350;

        setTitle("我的第一个swing程序");
        setBackground(Color.white);

        JLabel label = new JLabel();
        label.setText("请认真阅读下列条款：");
        label.setHorizontalAlignment(JLabel.LEFT);
        Font font = new Font("宋体", Font.BOLD,18);
        label.setFont(font);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setText("本协议条款（以下简称“协议”）将约束此处（#serviceslist）在条款末尾列出的消费类产品、网站和服务（以下简称“服务”）在中国（仅就本协议而言，不包括香港特别行政区、澳门特别行政区或中国台湾地区）的使用。此外，在您与下面第 10.c 节中标明的当地服务提供商（以下简称“中国商店提供商”）之间，本协议条款还适用于您按照第 10.c 节的规定使用 Xbox 上的 Microsoft Store 和 Windows 上的 Microsoft Store 的活动。您创建 Microsoft 帐户、使用服务或者在收到了变更通知后继续使用服务，即表示您接受本协议。在本协议中，“我们”是指 Microsoft 和/或中国商店提供商（如果适用）。");
        jTextArea.setLineWrap(true);
        jTextArea.setBackground(null);

        JButton jButton = new JButton();
        jButton.setToolTipText("这是一个按钮");
        jButton.setText("确认");
        jButton.setPreferredSize(new Dimension(60,30));
//        jButton.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new MyDialog().setVisible(true);
//            }
//        });

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,1,5,10));
        container.add(label);
        container.add(jTextArea);
        container.add(jButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(width,height);
        setLocationRelativeTo(null);
    }
}