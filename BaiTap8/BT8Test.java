package BaiTap8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BT8Test {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        jf.setTitle("BAI TAP TONG HOP 8");
        jf.setContentPane(new BaiTap8_View());
        jf.pack();
        //jf.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
        jf.setSize(700, 700);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
