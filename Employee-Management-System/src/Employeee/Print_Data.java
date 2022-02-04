package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Print_Data implements ActionListener{
    JFrame f;
    JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,label;
    String emp_id,name,father,address,phone,email,education,post,age,job;
    JButton b1,b2;


    Print_Data(String e_id){
        try{
            conn con = new conn();
            String str = "select * from add_employee where employeeId = '"+e_id+"'";
            ResultSet rs= con.s.executeQuery(str);

            if(rs.next()){


                emp_id = rs.getString("employeeId");
                name = rs.getString("name");
                address = rs.getString("address");
                phone = rs.getString("phone");
                email = rs.getString("email");
                education = rs.getString("education");
                job = rs.getString("job");

            }else {

                JOptionPane.showMessageDialog(null, "Id not found");
                f.setVisible(false);
                new details();

            }
        }catch(Exception e){
            e.getStackTrace();
        }

 
        f=new JFrame("Print Data");
        f.setLayout(null);
        f.getContentPane().setBackground(Color.gray);



        label=new JLabel();
        label.setBounds(50,0,595,642);
        label.setLayout(null);


        id8 = new JLabel("Employee Details");
        id8.setBounds(180,10,250,30);
        f.add(id8);
        id8.setFont(new Font("serif",Font.BOLD,25));
        id8.setForeground(Color.orange);
        label.add(id8);
        f.add(label);

        id = new JLabel("Employee Id:");
        id.setBounds(50,70,120,30);
        id.setFont(new Font("serif",Font.BOLD,20));
        id.setForeground(Color.green);
        label.add(id);

        aid = new JLabel(emp_id);
        aid.setBounds(200,70,200,30);
        aid.setFont(new Font("serif",Font.BOLD,20));
        aid.setForeground(Color.black);
        label.add(aid);

        id1 = new JLabel("Name:");
        id1.setBounds(50,120,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setForeground(Color.green);
        label.add(id1);

        aid1 = new JLabel(name);
        aid1.setBounds(200,120,300,30);
        aid1.setFont(new Font("serif",Font.BOLD,20));
        aid1.setForeground(Color.black);
        label.add(aid1);


        id3= new JLabel("Address:");
        id3.setBounds(50,170,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id3.setForeground(Color.green);
        label.add(id3);

        aid3= new JLabel(address);
        aid3.setBounds(200,170,300,30);
        aid3.setFont(new Font("serif",Font.BOLD,20));
        aid3.setForeground(Color.black);
        label.add(aid3);


        id4= new JLabel("Mobile No:");  
        id4.setBounds(50,220,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id4.setForeground(Color.green);
        label.add(id4);

        aid4= new JLabel(phone);
        aid4.setBounds(200,220,300,30);
        aid4.setFont(new Font("serif",Font.BOLD,20));
        aid4.setForeground(Color.black);
        label.add(aid4);

        
        id5= new JLabel("Email Id:");
        id5.setBounds(50,270,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id5.setForeground(Color.green);
        label.add(id5);

        aid5= new JLabel(email);
        aid5.setBounds(200,270,300,30);
        aid5.setFont(new Font("serif",Font.BOLD,20));
        aid5.setForeground(Color.black);
        label.add(aid5);

        
        id6= new JLabel("Education:");
        id6.setBounds(50,320,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id6.setForeground(Color.green);
        label.add(id6);

        aid6= new JLabel(education);
        aid6.setBounds(200,320,300,30);
        aid6.setFont(new Font("serif",Font.BOLD,20));
        aid6.setForeground(Color.black);
        label.add(aid6);


        id7= new JLabel("Job Post:");
        id7.setBounds(50,370,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id7.setForeground(Color.green);
        label.add(id7);

        aid7= new JLabel(job);
        aid7.setBounds(200,370,300,30);
        aid7.setFont(new Font("serif",Font.BOLD,20));
        aid7.setForeground(Color.black);
        label.add(aid7);

        
        b1=new JButton("Print");
        b1.setBackground(Color.orange);
        b1.setForeground(Color.black);
        b1.setBounds(100,520,100,30);
        b1.addActionListener(this);
        label.add(b1);

        b2=new JButton("cancel");
        b2.setBackground(Color.red);
        b2.setForeground(Color.black);
        b2.setBounds(300,520,100,30);
        b2.addActionListener(this);
        label.add(b2);

        f.setVisible(true);
        f.setSize(595,642);
        f.setLocation(450,200);






    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null,"printed successfully");
            f.setVisible(false);
            details d =new details();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new details();
        }
    }
    public static void main(String[] args){
        new Print_Data("8");
    }

}
