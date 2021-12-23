package temperatureCovert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConvert extends JFrame implements ActionListener {

    Container c;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4;
    JButton btnC, btnF, btnK;
    Font f1, f2;

    TemperatureConvert() {
        initComponent();
    }

    public void initComponent() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(200, 100, 400, 500);
        this.setTitle("Converter Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);

        f1 = new Font("Arial", Font.BOLD, 18);
        f2 = new Font("Arial", Font.BOLD, 16);

        l1 = new JLabel("Temperature Convert");
        l1.setBounds(100, 0, 200, 50);
        l1.setFont(f1);
        c.add(l1);

        l2 = new JLabel("Input C: ");
        l2.setBounds(50, 60, 80, 50);
        l2.setFont(f2);
        c.add(l2);

        t1 = new JTextField();
        t1.setBounds(145, 60, 150, 40);
        t1.setBackground(Color.pink);
        t1.setFont(f2);
        c.add(t1);

        l3 = new JLabel("Input F: ");
        l3.setBounds(50, 123, 80, 50);
        l3.setFont(f2);
        c.add(l3);

        t2 = new JTextField();
        t2.setBounds(145, 123, 150, 40);
        t2.setBackground(Color.pink);
        t2.setFont(f2);
        c.add(t2);

        l4 = new JLabel("Input K: ");
        l4.setBounds(50, 190, 80, 50);
        l4.setFont(f2);
        c.add(l4);

        t3 = new JTextField();
        t3.setBounds(145, 190, 150, 40);
        t3.setBackground(Color.pink);
        t3.setFont(f2);
        c.add(t3);

        l5 = new JLabel("Output: ");
        l5.setBounds(50, 250, 80, 50);
        l5.setFont(f2);
        c.add(l5);

        t4 = new JTextField();
        t4.setBounds(145, 250, 150, 40);
        t4.setBackground(Color.pink);
        t4.setFont(f2);
        c.add(t4);

        btnC = new JButton("C");
        btnC.setBounds(60, 320, 70, 60);
        btnC.setFont(f1);
        btnC.setBackground(Color.orange);
        c.add(btnC);

        btnF = new JButton("F");
        btnF.setBounds(155, 320, 70, 60);
        btnF.setFont(f1);
        btnF.setBackground(Color.orange);
        c.add(btnF);

        btnK = new JButton("K");
        btnK.setBounds(250, 320, 70, 60);
        btnK.setFont(f1);
        btnK.setBackground(Color.orange);
        c.add(btnK);

        //ActionListener
        btnC.addActionListener(this);
        btnF.addActionListener(this);
        btnK.addActionListener(this);

        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        t4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s1, s2, s3;

        s1 = t1.getText();
        s2 = t2.getText();
        s3 = t3.getText();

        double result1, result2;

        if (e.getSource() == btnC) {

            if (s3.equals("") && s1.equals("") && s2 != ("")) {
                result1 = Double.parseDouble(s2);
                result2 = ((result1 - 32) * 5 / 9);
                String ss1 = String.valueOf(result2);
                t4.setText(ss1);
            } else if (s1.equals("") && s2.equals("") && s3 != ("")) {
                result1 = Double.parseDouble(s3);
                result2 = (result1 - 273);
                String ss1 = String.valueOf(result2);
                t4.setText(ss1);
            } else if (s3.equals("") && s2.equals("") && s1 != ("")) {
                t4.setText(s1);
            } else if (s3.equals("") && s2.equals("") && s1.equals("")) {
                t4.setText("Null");
            } else {
                t4.setText("Multiple Input");
            }

        }
    }

    public static void main(String[] args) {
        TemperatureConvert tc = new TemperatureConvert();
        tc.setVisible(true);
    }

}
