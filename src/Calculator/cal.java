package Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cal extends JFrame implements ActionListener {

    private Container C;
    private ImageIcon icon;
    private JLabel label;
    private Font font, font2;
    private JTextField textField;
    private JPanel panel1, panel2;

    int flag = 0;
    double a, b, c;

    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, plus, minus, div, mul,
            clear, pow, dot, equal,
            sqrt, sin, cos, tan, log, pow3;

    cal() {
        initComponents(); // initialized Components 
    }

    void initComponents() {

        C = this.getContentPane();
        C.setLayout(null);  // by deafult frame er contentPane er layout boarder Layout. Layout null kore dite hobe
        C.setBackground(Color.LIGHT_GRAY);

        ///Icon Setting
        icon = new ImageIcon(getClass().getResource("Cal.png")); //Icon Change
        this.setIconImage(icon.getImage());

        ///Font 
        font = new Font("Time new Roman", Font.ITALIC + Font.BOLD, 14);
        font2 = new Font("Time new Roman", Font.ITALIC + Font.BOLD, 18);

        //JPanel
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 400, 115);
        panel1.setBackground(Color.darkGray);
        panel1.setLayout(null);
        C.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(6, 4, 1, 1));
        panel2.setBounds(0, 115, 400, 357);
        panel2.setBackground(Color.gray);
        C.add(panel2);

        //JLabel        
        label = new JLabel();
        label.setText("SCIENTIFIC CALCULATOR");
        label.setBounds(105, 0, 240, 50);
        label.setForeground(Color.WHITE);
        label.setFont(font);
        panel1.add(label);

        //JTextField
        textField = new JTextField();
        textField.setBounds(10, 50, 375, 50);
        textField.setFont(font2);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setForeground(Color.black);
        panel1.add(textField);

        ///JButton
        sin = new JButton("sin");sin.setFont(font2);sin.setBackground(Color.LIGHT_GRAY);panel2.add(sin);
        cos = new JButton("cos");cos.setFont(font2);cos.setBackground(Color.LIGHT_GRAY);panel2.add(cos);
        tan = new JButton("tan");tan.setFont(font2);tan.setBackground(Color.LIGHT_GRAY);panel2.add(tan);
        log = new JButton("log");log.setFont(font2);log.setBackground(Color.LIGHT_GRAY);panel2.add(log);

        sqrt = new JButton("sqrt");sqrt.setFont(font2);sqrt.setBackground(Color.LIGHT_GRAY);panel2.add(sqrt);
        pow = new JButton("x^2");pow.setFont(font2);pow.setBackground(Color.LIGHT_GRAY);panel2.add(pow);
        pow3 = new JButton("x^3");pow3.setFont(font2);pow3.setBackground(Color.LIGHT_GRAY);panel2.add(pow3);
        div = new JButton("/");div.setFont(font2);div.setBackground(Color.LIGHT_GRAY);panel2.add(div);

        b7 = new JButton("7");b7.setFont(font2);b7.setBackground(Color.LIGHT_GRAY);panel2.add(b7);
        b8 = new JButton("8");b8.setFont(font2);b8.setBackground(Color.LIGHT_GRAY);panel2.add(b8);
        b9 = new JButton("9");b9.setFont(font2);b9.setBackground(Color.LIGHT_GRAY);panel2.add(b9);

        mul = new JButton("*"); mul.setFont(font2);mul.setBackground(Color.LIGHT_GRAY);panel2.add(mul);
        b4 = new JButton("4");b4.setFont(font2);b4.setBackground(Color.LIGHT_GRAY);panel2.add(b4);
        b5 = new JButton("5");
        b5.setFont(font2);
        b5.setBackground(Color.LIGHT_GRAY);
        panel2.add(b5);
        b6 = new JButton("6");
        b6.setFont(font2);
        b6.setBackground(Color.LIGHT_GRAY);
        panel2.add(b6);

        minus = new JButton("-");
        minus.setFont(font2);
        minus.setBackground(Color.LIGHT_GRAY);
        panel2.add(minus);
        b1 = new JButton("1");
        b1.setFont(font2);
        b1.setBackground(Color.LIGHT_GRAY);
        panel2.add(b1);
        b2 = new JButton("2");
        b2.setFont(font2);
        b2.setBackground(Color.LIGHT_GRAY);
        panel2.add(b2);
        b3 = new JButton("3");
        b3.setFont(font2);
        b3.setBackground(Color.LIGHT_GRAY);
        panel2.add(b3);

        plus = new JButton("+");plus.setFont(font2);plus.setBackground(Color.LIGHT_GRAY);panel2.add(plus);
        zero = new JButton("0");zero.setFont(font2);zero.setBackground(Color.LIGHT_GRAY);panel2.add(zero);
        dot = new JButton(".");dot.setFont(font2);dot.setBackground(Color.LIGHT_GRAY);panel2.add(dot);
        equal = new JButton("=");
        equal.setFont(font2);
        equal.setBackground(Color.LIGHT_GRAY);
        panel2.add(equal);
        clear = new JButton("AC");
        clear.setFont(font2);
        clear.setBackground(Color.green);
        panel2.add(clear);

        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);
        b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);
        b9.addActionListener(this);plus.addActionListener(this);minus.addActionListener(this);div.addActionListener(this);
        mul.addActionListener(this);zero.addActionListener(this);dot.addActionListener(this);equal.addActionListener(this);
        clear.addActionListener(this);pow.addActionListener(this);pow3.addActionListener(this);sqrt.addActionListener(this);
        sin.addActionListener(this);cos.addActionListener(this);tan.addActionListener(this);log.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sin) {
            textField.setText("");
            flag = 5;
        }

        else if (e.getSource() == cos) {

            textField.setText("");
            flag = 6;
        }

        else if (e.getSource() == tan) {
            
            textField.setText("");
            flag = 7;
        }

        else if (e.getSource() == log) {
            
            textField.setText("");
            flag = 8;
        }

        else if (e.getSource() == sqrt) {
            textField.setText("");
            flag = 9;
        }
        
        else if (e.getSource() == pow) {
            
            String s = textField.getText();
            a = Double.parseDouble(s);
            textField.setText("");
            flag =10;
        }
        
        else if (e.getSource() == pow3) {
            String s = textField.getText();
            a = Double.parseDouble(s);
            textField.setText("");
            flag =11;
        }
        
        else if (e.getSource() == div) {
            String s = textField.getText();
            a = Double.parseDouble(s);
            textField.setText("");
            flag = 4;
        }

        else if (e.getSource() == b7) {
            textField.setText(textField.getText() + "7");
        }
        else if (e.getSource() == b8) {
            textField.setText(textField.getText() + "8");
        }
        else if (e.getSource() == b9) {
            textField.setText(textField.getText() + "9");
        }

        else if (e.getSource() == mul) {
            String s = textField.getText();
            a = Double.parseDouble(s);
            textField.setText("");
            flag = 3;
        }

        else if (e.getSource() == b4) {
            textField.setText(textField.getText() + "4");
        }
        else if (e.getSource() == b5) {
            textField.setText(textField.getText() + "5");
        }
        else if (e.getSource() == b6) {
            textField.setText(textField.getText() + "6");
        }

        else if (e.getSource() == minus) {
            String s = textField.getText();
            a = Double.parseDouble(s);
            textField.setText("");
            flag = 2;
        }

        else if (e.getSource() == b3) {
            textField.setText(textField.getText() + "3");
        }
        else if (e.getSource() == b2) {
            textField.setText(textField.getText() + "2");
        }

       else if (e.getSource() == b1) {
            textField.setText(textField.getText() + "1");
        }

       else if (e.getSource() == plus) {

            String s = textField.getText();
            a = Double.parseDouble(s);
            textField.setText("");
            flag = 1;
        }

       else if (e.getSource() == zero) {
            textField.setText(textField.getText() + "0");
        }

       else if (e.getSource() == dot) {
            String s = textField.getText();
            if(!s.contains(".")){
                textField.setText(s+".");
            }else{
                textField.setText(s);
            }
        } 
       
       
       
       else if (e.getSource() == equal) {

            if (flag == 1) {
                String s2 = textField.getText();
                b = Double.parseDouble(s2);
                c = a + b;
                textField.setText(Double.toString(c));
            } 
            else if (flag == 2) {

                String s2 = textField.getText();
                b = Double.parseDouble(s2);
                c = a - b;
                textField.setText(Double.toString(c));
            } 
            else if (flag == 3) {

                String s2 = textField.getText();
                b = Double.parseDouble(s2);
                c = a * b;
                textField.setText(Double.toString(c));
            }
            else if (flag == 4) {

                String s2 = textField.getText();
                b = Double.parseDouble(s2);
                c = a / b;
                textField.setText(Double.toString(c));
            }
            else if (flag == 5) {

             String s2 = textField.getText();
            b = Math.sin(Double.parseDouble(s2));
            textField.setText(textField.getText()+ b);
             textField.setText(Double.toString(b));
            }
            else if (flag == 6) {

             String s2 = textField.getText();
             b = Math.cos(Double.parseDouble(s2));
             textField.setText(textField.getText()+ b);
             textField.setText(Double.toString(b));
            }
            else if (flag == 7) {

             String s2 = textField.getText();
             b = Math.tan(Double.parseDouble(s2));
             textField.setText(textField.getText()+ b);
             textField.setText(Double.toString(b));
            }
            else if (flag == 8) {

             String s2 = textField.getText();
             b = Math.log(Double.parseDouble(s2));
             textField.setText(textField.getText()+ b);
             textField.setText(Double.toString(b));
            }
            else if (flag == 9) {

             String s2 = textField.getText();
             b = Math.sqrt(Double.parseDouble(s2));
             textField.setText(textField.getText()+ b);
             textField.setText(Double.toString(b));
            }
            else if (flag == 10) {

             b = Math.pow(a,2);
             textField.setText(textField.getText()+ b);
             textField.setText(Double.toString(b));
            }
              else if (flag == 11) {
             b = Math.pow(a,3);
             textField.setText(textField.getText()+ b);
             textField.setText(Double.toString(b));
            } 
             

        }

       else if (e.getSource() == clear) {
            textField.setText("");
        }

    }

    public static void main(String[] args) {

        cal frame = new cal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 400, 500);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        frame.setVisible(true);

    }
}
