package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class login  implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,registr,forget;

    login(){

        f=new JFrame("Login");

        f.setBackground(Color.ORANGE);
        f.setLayout(null);

        l1 = new JLabel("Username:");
        l1.setBounds(450,85,200,30);
        f.add(l1);
        
        l2 = new JLabel("Password:");
        l2.setBounds(450,150,100,30);
        f.add(l2);

      /*  l3 = new JLabel("Welcome!");
        l3.setBounds(580,10,100,30);
        l3.setForeground(Color.black);
        f.add(l3);
*/
        l4 = new JLabel("LOG IN");
        l4.setBounds(590,30,100,30);
        l4.setForeground(Color.orange);
        l4.setBackground(Color.white);
        f.add(l4);
 
        t1=new JTextField();
        t1.setBounds(560,85,150,30);
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(560,150,150,30);
        f.add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/login2.jpg"));
        /*Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);*/
        JLabel l3 = new JLabel(i1);

        l3.setBounds(0,0, 400,370);


        f.add(l3);


        b1 = new JButton("Sign in");
        b1.setBounds(450,220,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.green);
        b1.setForeground(Color.white);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(650,220,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.red);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        f.add(b2);

        registr = new JButton("Registration");
        registr.setBounds(420,300,180,30);
        registr.setBackground(Color.orange);
        registr.setForeground(Color.black);
        registr.setFont(new Font("serif",Font.BOLD,15));
        registr.addActionListener(this);
        f.add(registr);

        forget = new JButton("Forget password ?");
        forget.setBounds(630,300,180,30);
        forget.setBackground(Color.black);
        forget.setForeground(Color.white);
        forget.setFont(new Font("serif",Font.BOLD,15));
        forget.addActionListener(this);
        f.add(forget);


        ImageIcon image2 = new ImageIcon("adriano/adriano_coffee.jpg"); // Создаем значок изображения(create an ImageIcon)
        f.setIconImage(image2.getImage());
        f.getContentPane().setBackground(Color.gray);

        f.setVisible(true);
        f.setSize(850,400);
        f.setLocation(400,300);


    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            try {
                conn c1 = new conn();
                String u = t1.getText();
                String v = t2.getText();
                String q = "select * from login where username='" + u + "' and password='" + v + "'";
                ResultSet rs = c1.s.executeQuery(q);

                if(rs.next()) {
                    f.setVisible(false);
                    new details();
                }else {
                    JOptionPane.showMessageDialog(null, "Login invalid");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(ae.getSource() == b2){
            f.setVisible(false);
            new Front_Page();
        }
        if(ae.getSource() == registr){
            f.setVisible(false);
            new Registration();
        }
        if(ae.getSource() == forget){
            f.setVisible(false);
            new Forget_Password();
        }






    }
    public static void main(String[] arg){
        login l=new login();
    }
}