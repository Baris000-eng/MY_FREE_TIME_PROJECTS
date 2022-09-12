/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author barissss
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("Weight Converter Application");
        frame.setSize(500,400);
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel label1 = new JLabel("From: ");
        label1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        JComboBox backgroundColors = new JComboBox();
        backgroundColors.addItem("Black");
        backgroundColors.addItem("Blue");
        backgroundColors.addItem("Red");
        backgroundColors.addItem("Yellow");
        backgroundColors.addItem("Cyan");
        backgroundColors.addItem("Green");
        backgroundColors.addItem("Orange");
        backgroundColors.addItem("Gray");
        backgroundColors.setBounds(225,250,100,25);
        
        JLabel label2 = new JLabel("To: ");
        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        
        JLabel appTitle = new JLabel("WEIGHT CONVERTER APP");
        
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(225,300,75,25);
        
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setDefaultCloseOperation(1);
                frame.dispose();
            }
            
        });
        
        appTitle.setBounds(105, 0, 400,50);
        appTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
        appTitle.setForeground(Color.GREEN);
        
        JTextField field = new JTextField(15);
        field.setBounds(100,50,100,20);
        JTextField field2 = new JTextField(15);
        field2.setBounds(270,50,100,20);
        
        label1.setBounds(65,45,80,30);
        label2.setBounds(245,45,80,30);

        JComboBox fromComboBox = new JComboBox();
        fromComboBox.addItem("kilogram");
        fromComboBox.addItem("gram");
        fromComboBox.addItem("centigram");
        fromComboBox.addItem("decigram");
        fromComboBox.addItem("miligram");
       
        fromComboBox.setBounds(100,100,150,50);
        
        JComboBox toComboBox = new JComboBox();
        toComboBox.addItem("kilogram");
        toComboBox.addItem("gram");
        toComboBox.addItem("centigram");
        toComboBox.addItem("decigram");
        toComboBox.addItem("miligram");
       
        toComboBox.setBounds(270,100,150,50);
        
        panel.setLayout(null);
        panel.add(field);
        panel.add(fromComboBox);
        panel.add(toComboBox);
        panel.add(field2);
        panel.add(label1);
        panel.add(label2);
        panel.add(appTitle);
        panel.add(closeButton);
        panel.add(backgroundColors);
        
        backgroundColors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int colorIndex = backgroundColors.getSelectedIndex();
                switch (colorIndex) {
                    case 0:
                        panel.setBackground(Color.BLACK);
                        label1.setForeground(Color.WHITE);
                        label2.setForeground(Color.WHITE);
                        appTitle.setForeground(Color.WHITE);
                        break;
                    case 1:
                        panel.setBackground(Color.BLUE);
                        appTitle.setForeground(Color.BLACK);
                        break;
                    case 2:
                        panel.setBackground(Color.RED);
                        appTitle.setForeground(Color.BLACK);
                        break;
                    case 3:
                        panel.setBackground(Color.YELLOW);
                        appTitle.setForeground(Color.BLACK);
                        break;
                    case 4:
                        panel.setBackground(Color.CYAN);
                        appTitle.setForeground(Color.BLACK);
                        break;
                    case 5:
                        panel.setBackground(Color.GREEN);
                        appTitle.setForeground(Color.BLUE);
                        break;
                    case 6:
                        panel.setBackground(Color.ORANGE);
                        appTitle.setForeground(Color.BLACK);
                        break;
                    case 7:
                        panel.setBackground(Color.GRAY);
                        appTitle.setForeground(Color.BLACK);
                        break; 
                    default:
                        break;
                }
            }
            
        });
        
        frame.setVisible(true);
        
         field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               convert(field,fromComboBox,field2,toComboBox);
            }
        } 
        );
        
       
    }
    
    
    
    
    
    public static void convert(JTextField jtf1, JComboBox com1, JTextField jtf2, JComboBox com2) {
        if(com1.getSelectedIndex() == 0 && com2.getSelectedIndex() == 0) {
            jtf2.setText(jtf1.getText());
        } else if(com1.getSelectedIndex() == 0 && com2.getSelectedIndex() == 1) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = parse * 1000;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 0 && com2.getSelectedIndex() == 2) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = parse * 100000;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 0 && com2.getSelectedIndex() == 3) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = parse * 10000;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 0 && com2.getSelectedIndex() == 4) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = parse * 1000000;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 1 && com2.getSelectedIndex() == 0) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = (parse / 1000.0);
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 1 && com2.getSelectedIndex() == 1) {
            jtf2.setText(jtf1.getText());
        } else if(com1.getSelectedIndex() == 1 && com2.getSelectedIndex() == 2) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = (parse * 100);
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 1 && com2.getSelectedIndex() == 3) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = (parse * 10);
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 1 && com2.getSelectedIndex() == 4) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = parse * 1000;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 2 && com2.getSelectedIndex() == 0) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = parse / 100000.0;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 2 && com2.getSelectedIndex() == 1) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = parse / 100.0;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 2 && com2.getSelectedIndex() == 2) {
            jtf2.setText(jtf1.getText());
        } else if(com1.getSelectedIndex() == 2 && com2.getSelectedIndex() == 3) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = parse / 10.0;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 2 && com2.getSelectedIndex() == 4) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = (parse * 10);
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 3 && com2.getSelectedIndex() == 0) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = parse / 10000.0;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 3 && com2.getSelectedIndex() == 1) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = parse / 10.0;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 3 && com2.getSelectedIndex() == 2) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = parse * 10;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 3 && com2.getSelectedIndex() == 3) {
            jtf2.setText(jtf1.getText());
        } else if(com1.getSelectedIndex() == 3 && com2.getSelectedIndex() == 4) {
            int parse = Integer.parseInt(jtf1.getText());
            parse = parse * 100;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 4 && com2.getSelectedIndex() == 0) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = parse / 1000000.0;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 4 && com2.getSelectedIndex() == 1) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = parse / 1000.0;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 4 && com2.getSelectedIndex() == 2) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = parse / 10.0;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 4 && com2.getSelectedIndex() == 3) {
            double parse = Double.parseDouble(jtf1.getText());
            parse = parse / 100.0;
            String converted = String.valueOf(parse);
            jtf2.setText(converted);
        } else if(com1.getSelectedIndex() == 4 && com2.getSelectedIndex() == 4) {
            jtf2.setText(jtf1.getText());
        } 
    }
    
    
    
    
    
    
    
}

