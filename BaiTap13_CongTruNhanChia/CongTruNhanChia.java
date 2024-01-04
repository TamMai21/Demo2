package BaiTap13_CongTruNhanChia;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CongTruNhanChia extends JFrame implements ActionListener {
    private JButton solveBtn, clearBtn, exitBtn;
    private JTextField inputA, inputB, answer;
    private JRadioButton plus, minus, multiply, divide;
    private ButtonGroup calculate;
    public CongTruNhanChia(){
        this.setSize(600, 400);
        this.setTitle("Máy tính lớp 1");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //north
        JPanel northPanel = new JPanel();
        JLabel title = new JLabel("CỘNG TRỪ NHÂN CHIA");
        title.setFont(new Font("arial", Font.BOLD, 30));
        northPanel.add(title);
        northPanel.setBackground(Color.CYAN);
        this.add(northPanel, BorderLayout.NORTH);

        //center
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        //center-left
        JPanel centerLeft = new JPanel();
        Box leftBox = Box.createVerticalBox();
        leftBox.add(Box.createVerticalStrut(30));
        leftBox.add(solveBtn = new JButton("Giải"));    solveBtn.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(clearBtn = new JButton("Xóa"));     clearBtn.addActionListener(this);
        leftBox.add(Box.createVerticalStrut(10));
        leftBox.add(exitBtn = new JButton("Thoát"));    exitBtn.addActionListener(this);
        centerLeft.add(leftBox);
        centerLeft.setBorder(new TitledBorder("Chọn tác vụ"));
        centerLeft.setBackground(Color.LIGHT_GRAY);
        centerPanel.add(centerLeft, BorderLayout.WEST);
        //center-center
        JPanel centerCenter = new JPanel();
        Box centerBox = Box.createVerticalBox();
        JPanel inputAPanel = new JPanel();                              //input
        inputAPanel.add(new JLabel("Nhập a: "));
        inputAPanel.add(inputA = new JTextField(40));
        JPanel inputBPanel = new JPanel();
        inputBPanel.add(new JLabel("Nhập b: "));
        inputBPanel.add(inputB = new JTextField(40));
        JPanel calculationPanel = new JPanel();                         //phep tinh
        calculationPanel.setBorder(new TitledBorder("Phép toán"));
        calculationPanel.setLayout(new GridLayout(2, 2, 10, 10));
        calculationPanel.add(plus = new JRadioButton("Cộng"));
        calculationPanel.add(minus = new JRadioButton("Trừ"));
        calculationPanel.add(multiply = new JRadioButton("Nhân"));
        calculationPanel.add(divide = new JRadioButton("Chia."));
        calculate = new ButtonGroup();
        calculate.add(plus);            plus.addActionListener(this);
        calculate.add(minus);           minus.addActionListener(this);
        calculate.add(multiply);        multiply.addActionListener(this);
        calculate.add(divide);          divide.addActionListener(this);
        JPanel answerPanel = new JPanel();                              //ket qua
        answerPanel.add(new JLabel("Kết quả: "));
        answerPanel.add(answer = new JTextField(40));
        answer.setEditable(false);
        centerBox.add(Box.createVerticalGlue());
        centerBox.add(inputAPanel);
        centerBox.add(Box.createVerticalGlue());
        centerBox.add(inputBPanel);
        centerBox.add(Box.createVerticalGlue());
        centerBox.add(calculationPanel);
        centerBox.add(Box.createVerticalGlue());
        centerBox.add(answerPanel);
        centerBox.add(Box.createVerticalGlue());
        centerCenter.add(centerBox);
        centerPanel.add(centerCenter, BorderLayout.CENTER);
        this.add(centerPanel, BorderLayout.CENTER);

        //south
        JPanel southPanel = new JPanel();
        JPanel blue = new JPanel();
        blue.setBackground(Color.BLUE);
        JPanel yellow = new JPanel();
        yellow.setBackground(Color.YELLOW);
        JPanel red = new JPanel();
        red.setBackground(Color.RED);
        southPanel.setBackground(Color.pink);
        southPanel.setLayout(new FlowLayout());
        southPanel.add(blue);
        southPanel.add(red);
        southPanel.add(yellow);
        this.add(southPanel, BorderLayout.SOUTH);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(inputA.getText());
        double b = Double.parseDouble(inputB.getText());
        if(e.getActionCommand().equalsIgnoreCase("Giải")){
            ButtonModel calculation = calculate.getSelection();
            if(calculation.equals(plus))        //equalsIgnoreCase("Cộng")
                answer.setText(a + b + "");
            if(calculation.equals(minus))
                answer.setText(a - b +"");
            if(calculation.equals(multiply))
                answer.setText(a * b + "");
            if(calculation.equals(divide)){
                if(b == 0)
                    answer.setText("Không thể chia cho 0");
                else
                    answer.setText(a / b*1.0 + "");
            }
        }
        if(e.getActionCommand().equalsIgnoreCase("Xóa")){
            inputA.setText("");
            inputB.setText("");
            answer.setText("");
            calculate.clearSelection();
        }
        if(e.getActionCommand().equalsIgnoreCase("Thoát")){
            System.exit(0);
        }
    }
}
