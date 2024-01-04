package BaiTap4;

import javax.swing.*;
import java.awt.*;

public class BaiTap4_View extends JFrame {
    public BaiTap4_View(){
        this.init();
    }
    public void init(){
        this.setTitle("THUC HANH FLOWLAYOUT");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.GRAY);
       // this.setResizable(false);
        this.setVisible(true);

        JFrame jFrame = new JFrame("THỰC HÀNH FLOWLAYOUT");
        this.setLayout(new FlowLayout());
        for(int i = 1; i <= 100; i++){
            Button b = new Button("nứt" + i);
            this.add(b);
        }
    }
}
