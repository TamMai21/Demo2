package BaiTap10;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionListener;

public class BaiTap10View extends JFrame {
    private BasicArrowButton
            north = new BasicArrowButton(BasicArrowButton.NORTH),
       south = new BasicArrowButton(BasicArrowButton.SOUTH),
        west = new BasicArrowButton(BasicArrowButton.WEST),
        east = new BasicArrowButton(BasicArrowButton.EAST),
        center = new BasicArrowButton(BasicArrowButton.CENTER);

    public BaiTap10View(){
        this.init();
    }
    public void init(){
        this.setTitle("Các loại button");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ActionListener ac = new BaiTap10Controller(this);

        JPanel location = new JPanel();
        location.setLayout(new BorderLayout());
        location.add(north, BorderLayout.NORTH);
        location.add(south, BorderLayout.SOUTH);
        location.add(west, BorderLayout.WEST);
        location.add(east, BorderLayout.EAST);
        location.add(center, BorderLayout.CENTER);

        JButton jButton = new JButton("JButton");
        jButton.addActionListener(ac);
        JToggleButton jToggleButton = new JToggleButton("JToggleButton");
        jToggleButton.addActionListener(ac);
        JCheckBox jCheckBox = new JCheckBox("JCheckBox");
        jCheckBox.addActionListener(ac);
        JRadioButton jRadioButton = new JRadioButton("JRadioButton");
        jRadioButton.addActionListener(ac);

        this.add(location);
        this.add(jButton);
        this.add(jToggleButton);
        this.add(jCheckBox);
        this.add(jRadioButton);



    }
}
