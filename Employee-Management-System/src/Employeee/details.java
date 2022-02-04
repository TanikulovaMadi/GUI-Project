package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class details  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,cancel;

    details(){
        f=new JFrame("Employee Detail");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(30,0,700,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/add_employee2.jfif"));
        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1.setIcon(i3);
        f.add(l1);

        l2 = new JLabel("Employee Details");
        l2.setBounds(130,30,200,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setBackground(Color.white);
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Add");
        b1.setBounds(480,50,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.orange);
        b1.setForeground(Color.black);
        l1.add(b1);

        b4=new JButton("Update");
        b4.setBounds(480,140,100,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.setBackground(Color.orange);
        b4.addActionListener(this);
        l1.add(b4);

        b2=new JButton("View");
        b2.setBounds(480,230,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.orange);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(480,310,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.setBackground(Color.orange);
        b3.addActionListener(this);
        l1.add(b3);

        cancel=new JButton("Cancel");
        cancel.setBounds(460,400,140,30);
        cancel.setFont(new Font("serif",Font.BOLD,15));
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.red);
        cancel.addActionListener(this);
        l1.add(cancel);



        f.setVisible(true);
        f.getContentPane().setBackground(Color.gray);
        f.setSize(700,500);
        f.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Search_Employee();
        }
        if(ae.getSource()== cancel){
            f.setVisible(false);
            new login();
        }
    }

    public static void main(String[ ] arg){
        details d = new details();
    }
}
