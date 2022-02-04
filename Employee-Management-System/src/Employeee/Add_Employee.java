package Employeee;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


class Add_Employee implements ActionListener{

    JFrame f;
    JLabel label,name,age,date,address,phone,email,text,education,job,country,employeeId;
    JTextField t,name_text,age_text,date_text,address_text,phone_text,email_text,education_text,job_text,country_text,employeeId_text;
    JButton b,b1,b2,b3;

    Add_Employee(int i){}
    
    Add_Employee(){
        f = new JFrame("Add Employee");
        f.setBackground(Color.black);
        f.setLayout(null);

        label=new JLabel();
        label.setBounds(0,0,900,700);
        label.setLayout(null);
      /*  ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/add_employe.jfif"));
        name5.setIcon(img);*/

        text = new JLabel("New Employee Details");
        text.setBounds(320,40,500,50);
        text.setFont(new Font("serif",Font.BOLD,25));
        text.setForeground(Color.orange);
        label.add(text);
        f.add(label);

 
        name = new JLabel("Name");
        name.setBounds(50,150,100,30);
        name.setFont(new Font("serif",Font.BOLD,20));
        name.setForeground(Color.black);
        label.add(name);

        name_text =new JTextField();
        name_text.setBounds(200,150,150,30);
        label.add(name_text);

        employeeId= new JLabel("Employee Id");
        employeeId.setBounds(400,150,150,30);
        employeeId.setFont(new Font("serif",Font.BOLD,20));
        employeeId.setForeground(Color.black);
        label.add(employeeId);

        employeeId_text=new JTextField();
        employeeId_text.setBounds(600,150,150,30);
        label.add(employeeId_text);

        age = new JLabel("Age");
        age.setBounds(50,200,100,30);
        age.setFont(new Font("serif",Font.BOLD,20));
        age.setForeground(Color.black);
        label.add(age);

        age_text=new JTextField();
        age_text.setBounds(200,200,150,30);
        label.add(age_text);

        date= new JLabel("Date Of Birth");
        date.setBounds(400,200,200,30);
        date.setFont(new Font("serif",Font.BOLD,20));
        date.setForeground(Color.black);
        label.add(date);

        date_text=new JTextField();
        date_text.setBounds(600,200,150,30);
        label.add(date_text);

        address= new JLabel("Address");
        address.setBounds(50,250,100,30);
        address.setFont(new Font("serif",Font.BOLD,20));
        address.setForeground(Color.black);
        label.add(address);

        address_text=new JTextField();
        address_text.setBounds(200,250,150,30);
        label.add(address_text);

        phone= new JLabel("Phone");
        phone.setBounds(400,250,100,30);
        phone.setFont(new Font("serif",Font.BOLD,20));
        phone.setForeground(Color.black);
        label.add(phone);

        phone_text=new JTextField();
        phone_text.setBounds(600,250,150,30);
        label.add(phone_text);

        email= new JLabel("Email Id");
        email.setBounds(50,300,100,30);
        email.setFont(new Font("serif",Font.BOLD,20));
        email.setForeground(Color.black);
        label.add(email);

        email_text=new JTextField();
        email_text.setBounds(200,300,150,30);
        label.add(email_text);

        education= new JLabel("Education");
        education.setBounds(400,300,100,30);
        education.setFont(new Font("serif",Font.BOLD,20));
        education.setForeground(Color.black);
        label.add(education);

        education_text=new JTextField();
        education_text.setBounds(600,300,150,30);
        label.add(education_text);

        job= new JLabel("Job Post");
        job.setBounds(50,350,100,30);
        job.setFont(new Font("serif",Font.BOLD,20));
        job.setForeground(Color.black);
        label.add(job);

        job_text=new JTextField();
        job_text.setBounds(200,350,150,30);
        label.add(job_text);


        country= new JLabel("Country:");
        country.setBounds(400,350,100,30);
        country.setFont(new Font("serif",Font.BOLD,20));
        country.setForeground(Color.black);
        label.add(country);

        country_text=new JTextField();
        country_text.setBounds(600,350,150,30);
        label.add(country_text);


        b = new JButton("Submit");
        b.setBackground(Color.ORANGE);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);

        label.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.red);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);

        label.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        f.getContentPane().setBackground(Color.gray);
        f.setSize(900,700);
        f.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){
        

        String name = name_text.getText();
        String age = age_text.getText();
        String date = date_text.getText();
        String address = address_text.getText();
        String phone = phone_text.getText();
        String email = email_text.getText();
        String education = education_text.getText();
        String job = job_text.getText();
        String country = country_text.getText();
        String employeeId = employeeId_text.getText();

        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q ="insert into add_employee values('"+name+"','"+age+"','"+ date + "','"+ address+"','"+phone+"','"+ email+"','"+education + "','"+ job + "','"+ country + "','"+employeeId+"')";
                cc.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                f.setVisible(false);
                new details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new details();
        }
    }
    public static void main(String[ ] arg){
        new Add_Employee();
    }
}
