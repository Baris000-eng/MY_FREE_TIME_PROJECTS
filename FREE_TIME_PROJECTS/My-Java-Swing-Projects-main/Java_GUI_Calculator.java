import java.awt.EventQueue;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
public class Java_GUI_Calculator {
    public static JFrame fr;
    public static JTextField textF;

    public static final int FRAME_WIDTH = 450;

    public static final int FRAME_HEIGHT = 650;

    public static JButton button0;

    public  static JButton button1;
    public static JButton button2;
    public static JButton button3;
    public static JButton button4;
    public static JButton button5;
    public static JButton button6;
    public static JButton button7;
    public static JButton button8;

    public static JButton button9;
    public static JButton buttonC;
    public static JButton buttonEqual;
    public static JButton dot;
    public static JButton buttonDivide;
    public static JButton buttonRemainder;
    public static JButton buttonMinus;
    public static JButton buttonPlus;

    public static JButton buttonMult;
    public static String op;
    public static double f;
    public static double s;
    public static double r;

    public static JCheckBox checkBox;
    private static Font font = new Font("Times New Roman", Font.BOLD, 25);

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    initializeGUIComponents();
                    fr.setVisible(true);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
    }
    private static void initializeGUIComponents() {
        fr = new JFrame("");
        fr.setTitle(" - Java GUI Calculator by using Java Swing - ");
        fr.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.getContentPane().setLayout(null);
        fr.setResizable(false);

        textF = new JTextField();
        textF.setFont(font);
        textF.setBounds(14, 14, 345, 85);
        fr.getContentPane().add(textF);

        checkBox = new JCheckBox();
        checkBox.setBounds(14, 90, 125, 50);
        checkBox.setText("English");
        fr.getContentPane().add(checkBox);

        JComboBox comboBox = new JComboBox<String>();
        comboBox.addItem("Colored Mode");
        comboBox.addItem("Black Background Mode");
        comboBox.addItem("Default Mode");
        comboBox.setBounds(14, 113, 175, 75);
        fr.getContentPane().add(comboBox);

            buttonC = new JButton("");
            buttonC.setText("C");
            buttonC.setFont(font);
            buttonC.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textF.setText(null);
                }
            });
            buttonC.setBounds(188, 108, 85, 69);
            fr.getContentPane().add(buttonC);
            buttonPlus = new JButton("");
            buttonPlus.setText("+");
            buttonPlus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String text = textF.getText();
                        f = Double.parseDouble(text);
                        textF.setText("");
                        op = "+";
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
            buttonPlus.setFont(font);
            buttonPlus.setBounds(275, 108, 85, 69);
            fr.getContentPane().add(buttonPlus);

            button7 = new JButton("");
            button7.setText("7");
            button7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String t = textF.getText();
                    String u = button7.getText();
                    String numOutput = t + u;
                    textF.setText(numOutput);
                }
            });
            button7.setFont(font);
            button7.setBounds(13, 191, 85, 75);
            fr.getContentPane().add(button7);


            button8 = new JButton();
            button8.setText("8");
            button8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String w = textF.getText();
                    String q = button8.getText();
                    String number = w + q;
                    textF.setText(number);
                }
            });
            button8.setFont(font);
            button8.setBounds(109, 191, 85, 75);
            fr.getContentPane().add(button8);


            button9 = new JButton("");
            button9.setText("9");
            button9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String num = textF.getText() + button9.getText();
                    textF.setText(num);
                }
            });
            button9.setFont(font);
            button9.setBounds(206, 190, 85, 75);
            fr.getContentPane().add(button9);


            buttonMinus = new JButton("");
            buttonMinus.setText("-");
            buttonMinus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String str = textF.getText();
                        f = Double.parseDouble(str);
                        textF.setText("");
                        op = "-";
                    } catch (Exception excp) {
                        excp.printStackTrace();
                    }
                }
            });
            buttonMinus.setFont(font);
            buttonMinus.setBounds(297, 190, 63, 75);
            fr.getContentPane().add(buttonMinus);

            button4 = new JButton("");
            button4.setText("4");
            button4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String num = textF.getText() + button4.getText();
                    textF.setText(num);
                }
            });
            button4.setFont(font);
            button4.setBounds(12, 278, 85, 75);
            fr.getContentPane().add(button4);


            button5 = new JButton("");
            button5.setText("5");
            button5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String textFieldInput = textF.getText();
                    String buttonInput = button5.getText();
                    String outputNum = textFieldInput + buttonInput;
                    textF.setText(outputNum);
                }
            });
            button5.setFont(font);
            button5.setBounds(109, 278, 85, 75);
            fr.getContentPane().add(button5);


            button6 = new JButton("");
            button6.setText("6");
            button6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String firstText = textF.getText();
                    String secondText = button6.getText();
                    String outputNumber = firstText + secondText;
                    textF.setText(outputNumber);
                }
            });
            button6.setFont(font);
            button6.setBounds(206, 278, 85, 75);
            fr.getContentPane().add(button6);


            buttonMult = new JButton("");
            buttonMult.setText("x");
            buttonMult.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String textContent = textF.getText();
                        f = Double.parseDouble(textContent);
                        textF.setText("");
                        op = "x";
                    } catch (Exception exp) {
                         exp.printStackTrace();
                    }
                }
            });
            buttonMult.setFont(font);
            buttonMult.setBounds(297, 278, 63, 75);
            fr.getContentPane().add(buttonMult);

            button1 = new JButton("");
            button1.setText("1");
            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String a = textF.getText();
                    String b = button1.getText();
                    String number = a + b;
                    textF.setText(number);
                }
            });
            button1.setFont(font);
            button1.setBounds(12, 366, 85, 75);
            fr.getContentPane().add(button1);


            button2 = new JButton("");
            button2.setText("2");
            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String c = textF.getText();
                    String d = button2.getText();
                    String numString = c + d;
                    textF.setText(numString);
                }
            });
            button2.setFont(font);
            button2.setBounds(108, 366, 85, 75);
            fr.getContentPane().add(button2);

            button3 = new JButton("");
            button3.setText("3");
            button3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String first = textF.getText();
                    String second = button3.getText();
                    String num = first + second;
                    textF.setText(num);
                }
            });
            button3.setFont(font);
            button3.setBounds(205, 366, 85, 75);
            fr.getContentPane().add(button3);

            buttonDivide = new JButton("");
            buttonDivide.setText("/");
            buttonDivide.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    try {
                        String w = textF.getText();
                        f = Double.parseDouble(w);
                        textF.setText("");
                        op = "/";
                    } catch (Exception e1) {

                    }
                }
            });
            buttonDivide.setFont(font);
            buttonDivide.setBounds(297, 366, 63, 75);
            fr.getContentPane().add(buttonDivide);

            button0 = new JButton("");
            button0.setText("0");
            button0.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String g = textF.getText();
                    String h = button0.getText();
                    String string = g + h;
                    textF.setText(string);

                }
            });
            button0.setFont(font);
            button0.setBounds(12, 454, 85, 75);
            fr.getContentPane().add(button0);

            buttonRemainder = new JButton("");
            buttonRemainder.setText("%");
            buttonRemainder.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String txt = textF.getText();
                        f = Double.parseDouble(txt);
                        textF.setText("");
                        op = "%";
                    } catch (Exception e1) {
                    }
                }
            });
            buttonRemainder.setFont(font);
            buttonRemainder.setBounds(172, 454, 74, 75);
            fr.getContentPane().add(buttonRemainder);


            JButton dot = new JButton(".");
            dot.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String fText = textF.getText();
                        String sText = dot.getText();
                        String number = fText + sText;
                        textF.setText(number);

                    } catch (Exception e1) {
                    }
                }
            });
            dot.setFont(font);
            dot.setBounds(100, 454, 60, 75);
            fr.getContentPane().add(dot);
            buttonEqual = new JButton("");
            buttonEqual.setText("=");
            buttonEqual.setFont(font);
            buttonEqual.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String myText = textF.getText();
                        s = Double.parseDouble(myText);
                        switch (op) {
                            case "+":
                                if(checkBox.isSelected() == true ) {
                                    textF.setText(String.format("%.3f", f + s).replace(",", "."));
                                } else {
                                    textF.setText(String.format("%.3f", f + s));
                                }
                                break;
                            case "-":
                                if(checkBox.isSelected() == true) {
                                    textF.setText(String.format("%.3f", f-s).replace(",","."));
                                } else {
                                    textF.setText(String.format("%.3f", f-s));
                                }
                                break;
                            case "x":
                                if(checkBox.isSelected() == true ) {
                                    textF.setText(String.format("%.3f", f*s).replace(",","."));
                                } else {
                                    textF.setText(String.format("%.3f", f*s));
                                }
                                break;
                            case "/":
                                if(checkBox.isSelected() == true) {
                                    textF.setText(String.format("%.3f", f/s).replace(",","."));
                                } else {
                                    textF.setText(String.format("%.3f", f/s));
                                }
                                break;
                            case "%":
                                if(checkBox.isSelected() == true) {
                                    textF.setText(String.format("%.3f", f%s).replace(",","."));
                                } else {
                                    textF.setText(String.format("%.3f", f%s));
                                }
                                break;
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                }
            });

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choice = comboBox.getSelectedItem().toString();
                if(choice.contentEquals("Black Background Mode")) {
                    button0.setBackground(Color.BLACK);
                    button0.setForeground(Color.WHITE);
                    button0.setOpaque(true);
                    button0.setBorderPainted(false);
                    button1.setBackground(Color.BLACK);
                    button1.setForeground(Color.WHITE);
                    button1.setOpaque(true);
                    button1.setBorderPainted(false);
                    button2.setBackground(Color.BLACK);
                    button2.setForeground(Color.WHITE);
                    button2.setOpaque(true);
                    button2.setBorderPainted(false);
                    button3.setBackground(Color.BLACK);
                    button3.setForeground(Color.WHITE);
                    button3.setOpaque(true);
                    button3.setBorderPainted(false);
                    button4.setBackground(Color.BLACK);
                    button4.setForeground(Color.WHITE);
                    button4.setOpaque(true);
                    button4.setBorderPainted(false);
                    button5.setBackground(Color.BLACK);
                    button5.setForeground(Color.WHITE);
                    button5.setOpaque(true);
                    button5.setBorderPainted(false);
                    button6.setBackground(Color.BLACK);
                    button6.setForeground(Color.WHITE);
                    button6.setOpaque(true);
                    button6.setBorderPainted(false);
                    button7.setBackground(Color.BLACK);
                    button7.setForeground(Color.WHITE);
                    button7.setOpaque(true);
                    button7.setBorderPainted(false);
                    button8.setBackground(Color.BLACK);
                    button8.setForeground(Color.WHITE);
                    button8.setOpaque(true);
                    button8.setBorderPainted(false);
                    button9.setBackground(Color.BLACK);
                    button9.setForeground(Color.WHITE);
                    button9.setOpaque(true);
                    button9.setBorderPainted(false);
                    buttonEqual.setBackground(Color.BLACK);
                    buttonEqual.setForeground(Color.WHITE);
                    buttonEqual.setOpaque(true);
                    buttonEqual.setBorderPainted(false);
                    buttonDivide.setBackground(Color.BLACK);
                    buttonDivide.setForeground(Color.WHITE);
                    buttonDivide.setOpaque(true);
                    buttonDivide.setBorderPainted(false);
                    buttonMult.setBackground(Color.BLACK);
                    buttonMult.setForeground(Color.WHITE);
                    buttonMult.setOpaque(true);
                    buttonMult.setBorderPainted(false);
                    buttonC.setBackground(Color.BLACK);
                    buttonC.setForeground(Color.WHITE);
                    buttonC.setOpaque(true);
                    buttonC.setBorderPainted(false);
                    dot.setBackground(Color.BLACK);
                    dot.setForeground(Color.WHITE);
                    dot.setOpaque(true);
                    dot.setBorderPainted(false);
                    buttonPlus.setBackground(Color.BLACK);
                    buttonPlus.setForeground(Color.WHITE);
                    buttonPlus.setOpaque(true);
                    buttonPlus.setBorderPainted(false);
                    buttonMinus.setBackground(Color.BLACK);
                    buttonMinus.setForeground(Color.WHITE);
                    buttonMinus.setOpaque(true);
                    buttonMinus.setBorderPainted(false);
                    buttonRemainder.setBackground(Color.BLACK);
                    buttonRemainder.setForeground(Color.WHITE);
                    buttonRemainder.setOpaque(true);
                    buttonRemainder.setBorderPainted(false);
                } else if(choice.contentEquals("Default Mode")) {
                    button0.setBackground(Color.WHITE);
                    button0.setForeground(Color.black);
                    button0.setOpaque(true);
                    button0.setBorderPainted(false);
                    button1.setBackground(Color.WHITE);
                    button1.setForeground(Color.BLACK);
                    button1.setOpaque(true);
                    button1.setBorderPainted(false);
                    button2.setBackground(Color.WHITE);
                    button2.setForeground(Color.BLACK);
                    button2.setOpaque(true);
                    button2.setBorderPainted(false);
                    button3.setBackground(Color.WHITE);
                    button3.setForeground(Color.BLACK);
                    button3.setOpaque(true);
                    button3.setBorderPainted(false);
                    button4.setBackground(Color.WHITE);
                    button4.setForeground(Color.BLACK);
                    button4.setOpaque(true);
                    button4.setBorderPainted(false);
                    button5.setBackground(Color.WHITE);
                    button5.setForeground(Color.BLACK);
                    button5.setOpaque(true);
                    button5.setBorderPainted(false);
                    button6.setBackground(Color.WHITE);
                    button6.setForeground(Color.BLACK);
                    button6.setOpaque(true);
                    button6.setBorderPainted(false);
                    button7.setBackground(Color.WHITE);
                    button7.setForeground(Color.BLACK);
                    button7.setOpaque(true);
                    button7.setBorderPainted(false);
                    button8.setBackground(Color.WHITE);
                    button8.setForeground(Color.BLACK);
                    button8.setOpaque(true);
                    button8.setBorderPainted(false);
                    button9.setBackground(Color.WHITE);
                    button9.setForeground(Color.BLACK);
                    button9.setOpaque(true);
                    button9.setBorderPainted(false);
                    buttonEqual.setBackground(Color.WHITE);
                    buttonEqual.setForeground(Color.BLACK);
                    buttonEqual.setOpaque(true);
                    buttonEqual.setBorderPainted(false);
                    buttonDivide.setBackground(Color.WHITE);
                    buttonDivide.setForeground(Color.BLACK);
                    buttonDivide.setOpaque(true);
                    buttonDivide.setBorderPainted(false);
                    buttonMult.setBackground(Color.WHITE);
                    buttonMult.setForeground(Color.BLACK);
                    buttonMult.setOpaque(true);
                    buttonMult.setBorderPainted(false);
                    buttonC.setBackground(Color.WHITE);
                    buttonC.setForeground(Color.BLACK);
                    buttonC.setOpaque(true);
                    buttonC.setBorderPainted(false);
                    dot.setBackground(Color.WHITE);
                    dot.setForeground(Color.BLACK);
                    dot.setOpaque(true);
                    dot.setBorderPainted(false);
                    buttonPlus.setBackground(Color.WHITE);
                    buttonPlus.setForeground(Color.BLACK);
                    buttonPlus.setOpaque(true);
                    buttonPlus.setBorderPainted(false);
                    buttonMinus.setBackground(Color.WHITE);
                    buttonMinus.setForeground(Color.BLACK);
                    buttonMinus.setOpaque(true);
                    buttonMinus.setBorderPainted(false);
                    buttonRemainder.setBackground(Color.WHITE);
                    buttonRemainder.setForeground(Color.BLACK);
                    buttonRemainder.setOpaque(true);
                    buttonRemainder.setBorderPainted(false);
                } else if(choice.contentEquals("Colored Mode")) {
                    button0.setBackground(Color.BLUE);
                    button0.setForeground(Color.YELLOW);
                    button0.setOpaque(true);
                    button0.setBorderPainted(false);
                    button1.setBackground(Color.BLUE);
                    button1.setForeground(Color.YELLOW);
                    button1.setOpaque(true);
                    button1.setBorderPainted(false);
                    button2.setBackground(Color.BLUE);
                    button2.setForeground(Color.YELLOW);
                    button2.setOpaque(true);
                    button2.setBorderPainted(false);
                    button3.setBackground(Color.BLUE);
                    button3.setForeground(Color.YELLOW);
                    button3.setOpaque(true);
                    button3.setBorderPainted(false);
                    button4.setBackground(Color.BLUE);
                    button4.setForeground(Color.YELLOW);
                    button4.setOpaque(true);
                    button4.setBorderPainted(false);
                    button5.setBackground(Color.BLUE);
                    button5.setForeground(Color.YELLOW);
                    button5.setOpaque(true);
                    button5.setBorderPainted(false);
                    button6.setBackground(Color.BLUE);
                    button6.setForeground(Color.YELLOW);
                    button6.setOpaque(true);
                    button6.setBorderPainted(false);
                    button7.setBackground(Color.BLUE);
                    button7.setForeground(Color.YELLOW);
                    button7.setOpaque(true);
                    button7.setBorderPainted(false);
                    button8.setBackground(Color.BLUE);
                    button8.setForeground(Color.YELLOW);
                    button8.setOpaque(true);
                    button8.setBorderPainted(false);
                    button9.setBackground(Color.BLUE);
                    button9.setForeground(Color.YELLOW);
                    button9.setOpaque(true);
                    button9.setBorderPainted(false);
                    buttonEqual.setBackground(Color.BLUE);
                    buttonEqual.setForeground(Color.YELLOW);
                    buttonEqual.setOpaque(true);
                    buttonEqual.setBorderPainted(false);
                    buttonDivide.setBackground(Color.BLUE);
                    buttonDivide.setForeground(Color.YELLOW);
                    buttonDivide.setOpaque(true);
                    buttonDivide.setBorderPainted(false);
                    buttonMult.setBackground(Color.BLUE);
                    buttonMult.setForeground(Color.YELLOW);
                    buttonMult.setOpaque(true);
                    buttonMult.setBorderPainted(false);
                    buttonC.setBackground(Color.BLUE);
                    buttonC.setForeground(Color.YELLOW);
                    buttonC.setOpaque(true);
                    buttonC.setBorderPainted(false);
                    dot.setBackground(Color.BLUE);
                    dot.setForeground(Color.YELLOW);
                    dot.setOpaque(true);
                    dot.setBorderPainted(false);
                    buttonPlus.setBackground(Color.BLUE);
                    buttonPlus.setForeground(Color.YELLOW);
                    buttonPlus.setOpaque(true);
                    buttonPlus.setBorderPainted(false);
                    buttonMinus.setBackground(Color.BLUE);
                    buttonMinus.setForeground(Color.YELLOW);
                    buttonMinus.setOpaque(true);
                    buttonMinus.setBorderPainted(false);
                    buttonRemainder.setBackground(Color.BLUE);
                    buttonRemainder.setForeground(Color.YELLOW);
                    buttonRemainder.setOpaque(true);
                    buttonRemainder.setBorderPainted(false);
                }
            }
        });
            buttonEqual.setBounds(266, 455, 92, 75);
            fr.getContentPane().add(buttonEqual);
    }
}
