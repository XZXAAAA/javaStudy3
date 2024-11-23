package jlabel项目;

import javax.swing.*;

public class mainPage {
    public static void main(String[] args)
    {
        JLabel mylabel = new JLabel();
        mylabel.setText("hello world");
        mylabel.setBounds(100,100,250,250);
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(mylabel);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setTitle("hello world");
        mylabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\1.png"));
        mylabel.setHorizontalTextPosition(JLabel.CENTER);
        mylabel.setVerticalTextPosition(JLabel.BOTTOM);

    }
}
