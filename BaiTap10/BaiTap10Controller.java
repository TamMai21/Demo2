package BaiTap10;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaiTap10Controller implements ActionListener {
    private BaiTap10View baiTap10View;

    public BaiTap10Controller(BaiTap10View baiTap10View) {
        this.baiTap10View = baiTap10View;
    }

    public BaiTap10View getBaiTap10View() {
        return baiTap10View;
    }

    public void setBaiTap10View(BaiTap10View baiTap10View) {
        this.baiTap10View = baiTap10View;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "JButton":{
                JOptionPane.showMessageDialog(null, "Đây là nút JButton", "Đây là nút gì?", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case "JToggleButton":{
                JOptionPane.showMessageDialog(null, "Đây là nút " + e.getActionCommand(), "Đây là nút gì?", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case "JCheckBox":{
                JOptionPane.showMessageDialog(null, "Đây là nút checkob" , "Đây là nút gì?", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case "JRadioButton":{
                JOptionPane.showMessageDialog(null, "Đây là nút jradio" , "Đây là nút gì?", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case BasicArrowButton.NORTH + "":{
                JOptionPane.showMessageDialog(null, "Đây là nút mũi tên lên" , "Đây là nút gì?", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case BasicArrowButton.SOUTH + "":{
                JOptionPane.showMessageDialog(null, "Đây là nút mũi tên xuống", "Đây là nút gì?", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case BasicArrowButton.WEST + "":{
                JOptionPane.showMessageDialog(null, "Đây là nút mũi tên trái", "Đây là nút gì?", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case BasicArrowButton.EAST + "":{
                JOptionPane.showMessageDialog(null, "Đây là nút mũi tên phải" , "Đây là nút gì?", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Đây không là nút gì cả", "Đây là nút gì?", JOptionPane.INFORMATION_MESSAGE);  break;

        }
    }
}
