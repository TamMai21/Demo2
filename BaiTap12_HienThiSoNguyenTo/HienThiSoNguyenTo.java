package BaiTap12_HienThiSoNguyenTo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HienThiSoNguyenTo extends JFrame implements ActionListener{
    private JTextField input;
    private JTextArea output;
    private JButton generateBtn;
    public HienThiSoNguyenTo(){
        this.setSize(600, 400);
        this.setTitle("XUẤT SỐ NGUYÊN TỐ");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        //north
        JPanel northPanel = new JPanel();
        northPanel.add(input = new JTextField(20));
        northPanel.add(generateBtn = new JButton("Generate"));
        generateBtn.addActionListener(this);
        this.add(northPanel, BorderLayout.NORTH);

        //center
        JPanel centerPanel = new JPanel();
        centerPanel.add(output = new JTextArea(30, 30));
        output.setEditable(false);
        this.add(centerPanel);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Generate")){
            output.setText(generatePrimeNumber(Integer.parseInt(input.getText())));
        }
    }
    private String generatePrimeNumber(int n){
        String output = "";
        int end = n*10;
            for(int i = 0; i < end; i++){
                if(isPrime(i)){
                    output += i + " ";
                    n--;
                }
                if(n == 0)
                    break;
            }
        return output;
    }
    private boolean isPrime(int num){
        if(num < 2)
            return false;
        else if(num == 2)
            return true;
        else{
            for(int i = 2; i <= num/2; i++)
                if(num % i == 0)
                    return false;
            return true;
        }
    }
}
