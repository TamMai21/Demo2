package BaiTap8;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class BaiTap8_View extends JPanel{
    public BaiTap8_View(){
        this.init();
    }
    public void init(){
        this.setLayout(new BorderLayout());

        this.setBorder(new EmptyBorder(20, 20, 20, 20));

        Box boxRow = Box.createHorizontalBox();    //box ngang o dau tien
        for(int i = 0; i < 4; i++){
            Font font = new Font("Arial", Font.BOLD, 20 + i*2);
            JButton btn = new JButton("Nút " + i);
            btn.setFont(font);
            boxRow.add(Box.createHorizontalGlue());
            boxRow.add(btn);
            boxRow.add(Box.createHorizontalGlue());
        }
        this.add(boxRow, BorderLayout.NORTH);

        JPanel jCowEast = new JPanel();
        jCowEast.setLayout(new BoxLayout(jCowEast, BoxLayout.Y_AXIS));  //tạo box dọc, tương tự Box.CreateVerticalBox()
        jCowEast.setBorder(new TitledBorder(new EtchedBorder(), "ư ư ư"));
        for(int i = 0; i < 5; i++){
            Font font = new Font("Times new roman", Font.ITALIC, 20+ i*2);
            JButton btn = new JButton("Nút " + i);
            btn.setFont(font);
            jCowEast.add(btn);
        }
        this.add(jCowEast, BorderLayout.EAST);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setFont(new Font("Serif", Font.HANGING_BASELINE, 20));
        jTextArea.setText("This component has 12-pixel margins on left and top"
                        + " and has 72-pixel margins on right and bottom.");
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jTextArea.setBorder(new BevelBorder(BevelBorder.RAISED));
        Box fixedcol = Box.createVerticalBox();
        fixedcol.add(Box.createVerticalStrut(12));
        fixedcol.add(jTextArea);
        fixedcol.add(Box.createVerticalStrut(72));
        Box fixedrow = Box.createHorizontalBox();
        fixedrow.add(Box.createHorizontalStrut(12));
        fixedrow.add(fixedcol);
        fixedrow.add(Box.createHorizontalStrut(72));
        this.add(fixedrow, BorderLayout.CENTER);
//        this.add(jTextArea, BorderLayout.WEST);


        Box bottomBox = Box.createHorizontalBox();
        JButton settingButton = new JButton("CÀI ĐẶT");
        JCheckBox checkBoxButton = new JCheckBox("TICK VÀO ĐI");
        JButton exitButton = new JButton("THOÁT");
        bottomBox.add(Box.createHorizontalGlue());
        bottomBox.add(settingButton);
        bottomBox.add(Box.createHorizontalGlue());
        bottomBox.add(checkBoxButton);
        bottomBox.add(Box.createHorizontalGlue());
        bottomBox.add(exitButton);
        bottomBox.add(Box.createHorizontalGlue());
        this.add(bottomBox, BorderLayout.SOUTH);
    }
}
