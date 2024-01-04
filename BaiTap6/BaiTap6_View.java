package BaiTap6;

import javax.swing.*;
import java.awt.*;

public class BaiTap6_View extends JFrame {
    public BaiTap6_View(){
        this.init();
    }
    public void init(){
        this.setTitle("Border Layout");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        JPanel jf1 = new JPanel(new BorderLayout());
        JPanel jf2 = new JPanel(new BorderLayout());

        JButton b1, b2, b3, b4, b5, b6, b7, b8;
        b1 = new JButton("BẮC");
        b2 = new JButton("ĐÔNG");
        b3 = new JButton("NAM");
        b4 = new JButton("TÂY");

        b5 = new JButton("BẮC");
        b6 = new JButton("ĐÔNG");
        b7 = new JButton("NAM");
        b8 = new JButton("TÂY");

        jf1.add(b1, BorderLayout.NORTH);
        jf1.add(b2, BorderLayout.EAST);
        jf1.add(b3, BorderLayout.SOUTH);
        jf1.add(b4, BorderLayout.WEST);
        jf1.add(new Button("CÁI MẶT"), BorderLayout.CENTER);
        jf1.setBackground(Color.PINK);

        jf2.add(b5, BorderLayout.NORTH);
        jf2.add(b6, BorderLayout.EAST);
        jf2.add(b7, BorderLayout.SOUTH);
        jf2.add(b8, BorderLayout.WEST);
        jf2.add(new Button("CÁI LỒN"), BorderLayout.CENTER);
        jf2.setBackground(Color.RED);

        this.setLayout(new BorderLayout());
        this.add(jf1, BorderLayout.NORTH);
        this.add(jf2, BorderLayout.SOUTH);
        this.add(new JButton("CON CẶC"), BorderLayout.CENTER);
        this.add(new JButton("TRÁI"), BorderLayout.WEST);
        this.add(new JButton("PHẢI"), BorderLayout.EAST);
    }
}
