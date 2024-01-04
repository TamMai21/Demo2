package BaiTap1;

import BaiTap2.BaiTap2_View;

import javax.swing.*;

public class BaiTap1_View extends JFrame {
    public BaiTap1_View(){
        this.init();
    }
    public void init(){
        this.setTitle("BAI TAP 1 - HIEN THI JFRAME DON GIAN");
        this.setSize(500, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
