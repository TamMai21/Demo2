package BaiTap3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaiTap3_View extends JWindow{
    private JWindow jWindow;
    private JPanel jPanel;

    public BaiTap3_View() {
        this.init();
    }
    public void init(){
        this.jWindow = new JWindow();
        //this.jPanel = new JPanel();
        JButton buttonClose = new JButton("ĐÓNG JWINDOW");
        JButton buttonCC = new JButton("CON CẶC");
        //jPanel.setLayout(new BorderLayout());
        this.jWindow.setSize(300, 300);
        this.jWindow.setLayout(new BorderLayout());
        this.jWindow.getContentPane().add(buttonClose, BorderLayout.CENTER);
        this.jWindow.getContentPane().add(buttonCC, BorderLayout.NORTH);
        this.jWindow.setLocationRelativeTo(null);
    //    jPanel.setBackground(Color.CYAN);


        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equalsIgnoreCase("ĐÓNG JWINDOW"))
                    jWindow.dispose();  //dong jwindow
            }
        });

//        this.setLayout(new BorderLayout());
//        this.add(jWindow, BorderLayout.CENTER);
//        this.add(jPanel, BorderLayout.SOUTH);
        this.jWindow.setVisible(true);
    }
}
