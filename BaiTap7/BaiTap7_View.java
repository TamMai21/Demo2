package BaiTap7;

import javax.swing.*;
import java.awt.*;

public class BaiTap7_View extends JFrame {
    public BaiTap7_View(){
        this.init();
    }
    public void init(){
        this.setTitle("Thực hành GRIDLAYOUT");
        this.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize())); //full màn hình
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new GridLayout());
        jp2.setLayout(new GridLayout());
        for(int i = 0; i < 10; i++)
            jp1.add(new JButton("phải " + i));
        for(int i = 10; i >=0; i--)
            jp2.add(new JButton("trái" + i));
        this.setLayout(new BorderLayout());
        this.add(jp1, BorderLayout.EAST);
        this.add(jp2, BorderLayout.WEST);
    }
}
