/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employeee;
import java.lang.*;
import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ForgetSearch implements ActionListener
{
    JFrame f;
    JTextField t,t2,t3,t4;
    JLabel l,l1,l2,l3,l4,l5;
    JButton b,b1,b2;
    String phoneN = null ;

    ForgetSearch(String s)
    {
        phoneN = s;
        f=new JFrame("Forget");


        f.getContentPane().setBackground(Color.gray);
        f.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,500,500);
        l5.setLayout(null);
        ImageIcon img=new ImageIcon("5.jpg");
        l5.setIcon(img);
        f.add(l5);

        l=new JLabel("RESTORE PASSWORD");
        l.setVisible(true);
        l.setBounds(135,90,500,30);
        l.setForeground(Color.green);
        Font F1=new Font("serif",Font.BOLD,20);
        l.setFont(F1);
        l5.add(l);





        l2=new JLabel("New Password");
        l2.setBounds(50,180,200,30);
        l2.setForeground(Color.black);
        Font F3=new Font("serif",Font.BOLD,20);
        l2.setFont(F3);

        l5.add(l2);


        l3=new JLabel("Confirm Password");
        l3.setBounds(50,250,250,30);
        l3.setForeground(Color.black);
        Font F4=new Font("serif",Font.BOLD,20);
        l3.setFont(F4);

        l5.add(l3);





        t2=new JTextField();
        t2.setBounds(250,180,150,30);

        l5.add(t2);

        t3=new JTextField();
        t3.setBounds(250,250,150,30);

        l5.add(t3);






        b1=new JButton("Submit");
        b1.setBounds(120,370,100,30);
        b1.setForeground(Color.black);
        b1.setBackground(Color.orange);
        b1.addActionListener(this);
        l5.add(b1);


        b2=new JButton("Cancel");
        b2.setBounds(260,370,100,30);
        b2.setForeground(Color.white);
        b2.setBackground(Color.red);
        b2.addActionListener(this);
        l5.add(b2);


        f.setSize(500,500);
        f.setLocation(300,50);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae)
    {
/* if(ae.getSource() == b){
  try{
   conn c = new conn();
   String user = t2.getText();
   String pass = t3.getText();
   String q = "update login set username ='" + "'"
  }
 }*/

        if(ae.getSource()==b2)
        {
            f.setVisible(false);
            login l=new login();
        }

        try{
        if(ae.getSource()== b1)
        {
            conn c = new conn();
            String pass = t2.getText();
            String conpass = t3.getText();

            String q = "update login set password ='"+pass +"' where phone = '" + phoneN + "'";
            c.s.executeUpdate(q);

            JOptionPane.showMessageDialog(null,"successfully updated");
            f.setVisible(false);
            new login();
        }}catch(Exception e){
        e.printStackTrace();
    }

    }





    public static void main(String[]ar)
    {
        ForgetSearch f = new ForgetSearch("0770161989");
    }
}