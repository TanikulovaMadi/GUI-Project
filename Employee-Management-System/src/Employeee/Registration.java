package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Registration  implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3,l4,phone;
    JTextField t1,phonetext;
    JPasswordField t2;
    JButton b1,b2;

    Registration(){

        f=new JFrame("Registration");

        f.setBackground(Color.ORANGE);
        f.setLayout(null);
/*
        ImageIcon image2 = new ImageIcon("adriano/adriano_coffee.jpg"); // Создаем значок изображения(create an ImageIcon)
        f.setIconImage(image2.getImage());

*/

        l1 = new JLabel("Username:");
        l1.setBounds(100,85,200,30);
        f.add(l1);

        l2 = new JLabel("Password:");
        l2.setBounds(100,150,100,30);
        f.add(l2);

        phone = new JLabel("Phone:");
        phone.setBounds(100,215,100,30);
        f.add(phone);

        phonetext=new JTextField();
        phonetext.setBounds(200,215,150,30);
        f.add(phonetext);
      /*  l3 = new JLabel("Welcome!");
        l3.setBounds(580,10,100,30);
        l3.setForeground(Color.black);
        f.add(l3);
*/
        l4 = new JLabel("Registration");
        l4.setBounds(200,30,100,30);
        l4.setForeground(Color.orange);
        l4.setBackground(Color.white);
        f.add(l4);

        t1=new JTextField();
        t1.setBounds(200,85,150,30);
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(200,150,150,30);
        f.add(t2);

     /*   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/login2.jpg"));
        JLabel l3 = new JLabel(i1);
        l3.setBounds(0,0, 480,400);
        f.add(l3);
*/



        b1 = new JButton("Create account");
        b1.setBounds(30,290,180,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.green);
        b1.setForeground(Color.white);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(280,290,180,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.red);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        f.add(b2);






        f.setVisible(true);
        f.setSize(500,400);
        f.setLocation(200,300);
        f.getContentPane().setBackground(Color.gray);


    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == b1) {
            try {
                conn c1 = new conn();

                String u = t1.getText();
                String v = t2.getText();
                String p = phonetext.getText();

                String q = "insert into login values('" + u + "','" + v +"','" + p + "')";
                //  String q = "insert into login values ('"+u+"','"+v+"')";
                c1.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Registration was successful");
                new login().f.setVisible(true);
                    f.setVisible(false);
                }catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (ae.getSource() == b2){
              f.setVisible(false);
              new login();
        }

    }
    public static void main(String[] arg){
       Registration r = new Registration();
    }
}