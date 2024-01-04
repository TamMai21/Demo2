package BaiTap9;

import javax.swing.*;

public class BaiTap9_View extends JOptionPane {
    public BaiTap9_View(){
        this.init();
    }
    public void init(){
        int yesOrNo;
        do{
            String numStr = JOptionPane.showInputDialog("Nhập số nguyên: ");
            if(numStr != null && !numStr.trim().equals("")){
                try {
                    int num = Integer.parseInt(numStr);
                    String result = "Số vừa nhập là: " + numStr + ". Là số " + ((num % 2 == 0)? "chẵn" : "lẻ");
                    JOptionPane.showMessageDialog(null, result, "Đây là tiêu đề", JOptionPane.INFORMATION_MESSAGE);
                    //4 tham số có ý nghĩa lần lượt. null: xuất hiện giữa màn hình / result: thông điệp muốn hiển thị / "Output": tiêu đề của hộp thoại / JOptionPane.INFORMATION_MESSAGE: loại thông báo
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Dữ liệu nhập không hợp lệ.");
                    }
                }
            yesOrNo = JOptionPane.showConfirmDialog(null, "Tiếp tục không?", "Question", JOptionPane.YES_NO_OPTION);
            //4 tham số có ý nghĩa lần lượt. null: xuất hiện giữa màn hình /  thông điệp muốn hiển thị / "Question": tiêu đề của hộp thoại / JOptionPane.INFORMATION_MESSAGE: loại thông báo

        }while(yesOrNo == JOptionPane.YES_OPTION);
        }
    }

