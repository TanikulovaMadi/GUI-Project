package Employeee;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;


public class jdfd  {
    public static void main(String[] args){
        JFrame f;
        JLabel l;
        JTextField text;
        f = new JFrame("Adriano coffee");
        f.setBackground(Color.yellow);
        f.setSize(500,500);
        f.setVisible(true);


        /*l = new JLabel();
        l.setText("Welcome to Adriano coffee");
        l.setBackground(Color.green);
        l.setOpaque(true);*/

        JLabel l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);

        f.add(l1);







    }

}
