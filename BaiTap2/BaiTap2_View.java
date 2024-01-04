package BaiTap2;

import BaiTap1.BaiTap1_View;

import javax.swing.*;

public class BaiTap2_View extends JDialog {
    public BaiTap2_View(){
        this.init();
    }
    public void init(){
        this.setTitle("HIEN THI JDIALOG");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setVisible(true);
    }
}
