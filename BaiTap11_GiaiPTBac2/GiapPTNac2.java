package BaiTap11_GiaiPTBac2;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiapPTNac2 extends JFrame implements ActionListener {
    private JTextField aInput, bInput, cInput, answer;
    private JButton solveButton, clearButton, exitButton;
    public GiapPTNac2(){
        this.setSize(600, 400);
        this.setTitle("GIAI PT BAC 2");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //north
        JPanel northPanel = new JPanel();
        northPanel.add(new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2"));
        northPanel.setBackground(Color.cyan);
        this.add(northPanel, BorderLayout.NORTH);

        //center
        Box centerBox = Box.createVerticalBox();
        JPanel aPanel = new JPanel();
        aPanel.add(new JLabel("Nhập a: "));
        aPanel.add(aInput = new JTextField(40));
        JPanel bPanel = new JPanel();
        bPanel.add(new JLabel("Nhập b: "));
        bPanel.add(bInput = new JTextField(40));
        JPanel cPanel = new JPanel();
        cPanel.add(new JLabel("Nhập c: "));
        cPanel.add(cInput = new JTextField(40));
        JPanel ansPanel = new JPanel();
        ansPanel.add(new JLabel("Kết quả: "));
        ansPanel.add(answer = new JTextField(40));
        answer.setEditable(false);
        centerBox.add(Box.createVerticalGlue());
        centerBox.add(aPanel);
        centerBox.add(Box.createVerticalGlue());
        centerBox.add(bPanel);
        centerBox.add(Box.createVerticalGlue());
        centerBox.add(cPanel);
        centerBox.add(Box.createVerticalGlue());
        centerBox.add(ansPanel);
        centerBox.add(Box.createVerticalGlue());
        this.add(centerBox, BorderLayout.CENTER);

        //south
        Box southBox = Box.createHorizontalBox();
        southBox.add(Box.createHorizontalGlue());
        southBox.add(solveButton = new JButton("Giải"));
        solveButton.addActionListener(this);
        southBox.add(Box.createHorizontalGlue());
        southBox.add(clearButton = new JButton("Xóa rỗng"));
        clearButton.addActionListener(this);
        southBox.add(Box.createHorizontalGlue());
        southBox.add(exitButton = new JButton("Thoát"));
        exitButton.addActionListener(this);
        southBox.add(Box.createHorizontalGlue());
        JPanel southPanel = new JPanel();
        southPanel.add(southBox);
        southPanel.setBorder(new TitledBorder("Chọn tác vụ"));
        this.add(southPanel, BorderLayout.SOUTH);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(aInput.getText());
        double b = Double.parseDouble(bInput.getText());
        double c = Double.parseDouble(cInput.getText());
        if(e.getActionCommand().equalsIgnoreCase("Giải")){
            double delta = b*b - 4*a*c;
            if(delta < 0){
                answer.setText("Phương trình vô nghiệm.");
            }
            else{
                double ans = (-b + Math.sqrt(delta)) / 2*a;
                if(delta == 0){
                    answer.setText(String.format("%.5f", ans));
                }
                else{
                    answer.setText(String.format("%.5f    |     -%.5f", ans, ans));
                }
            }
        }
        if(e.getActionCommand().equalsIgnoreCase("Xóa rỗng")){
            aInput.setText("");
            bInput.setText("");
            cInput.setText("");
            answer.setText("");
        }
        if(e.getActionCommand().equalsIgnoreCase("Thoát")){
            System.exit(0);
        }
    }
}
