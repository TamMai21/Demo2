package BaiTap5;

import javax.swing.*;
import java.awt.*;

public class BaiTap5_View extends JFrame {
    public BaiTap5_View(){
        this.init();
    }
    public void init(){
        this.setTitle("THUC HANH BOXLAYOUT");
        this.setSize(500, 500);
        //this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        Box bv, bh1, bh2, bv1;
        this.add(bv = Box.createVerticalBox()); //box bv là box lớn chứa 3 box nhỏ bh1 bh2 bv2
        bv.add(bh1 = Box.createHorizontalBox());    //bh1 là box ngang 1
        bv.add(bh2 = Box.createHorizontalBox());    //bh2 là box ngang 2
        bv.add(bv1 = Box.createVerticalBox());      //bv2 là box dọc 1

        for(int i = 0; i < 3; i++){
            bh1.add(Box.createHorizontalGlue());    //keo ngang
            bh1.add(new JButton("Button  bh1" + i));
            bh1.add(Box.createHorizontalGlue());
        }

        //bản chất keo ngang là khoảng trắng 2 bên của 1 nút với nút/rìa.
        //Khi có keo ngang, các nút của box ngang sẽ được căn chỉnh đều theo chiều rộng của cửa sổ để các nút cách nhau đều hơn

        for(int i = 0; i < 5; i++){
            bh2.add(Box.createHorizontalGlue());    //keo ngang
            bh2.add(new JButton("Button bh2" + i));
            bh2.add(Box.createHorizontalGlue());    //keo ngang
        }

        for(int i = 0; i < 5; i++){
            bv1.add(Box.createVerticalStrut(5));  //tạo khoảng trống 5px ở cạnh trên cùng của box. Giống padding-top trong CSS
            bv1.add(new JButton("Button bv1" + i));
            bv1.add(Box.createVerticalStrut(5));  //tạo khoảng trống 5px ở cạnh dưỡi cụng của box.Giống padding-bottom trong CSS
        }

    }
}
