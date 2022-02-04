package Employeee;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class Update_Employee extends Add_Employee implements ActionListener{

    JFrame f;
    JLabel id,name,country,address,mobile,email,education,job,text,employeeId,label;
    JTextField t,name_text,country_t,address_t,mobile_t,email_t,education_t,job_t,t8,employeeId_t;
    JButton update,cancel;
    String id_emp;

    Update_Employee(String idaa){
        super(0);
        f=new JFrame("Update Employee details");



        id_emp=idaa;    
        label=new JLabel();
        label.setBounds(0,0,900,500);
        label.setLayout(null);
       /* ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/add_employee.jpg"));
        label.setIcon(img);*/

        text = new JLabel("Update Employee Detail:");
        text.setBounds(50,10,500,50);
        text.setFont(new Font("serif",Font.ITALIC,40));
        text.setForeground(Color.orange);
        label.add(text);
        f.add(label);


        name = new JLabel("Name:");  
        name.setBounds(50,100,100,30);
        name.setFont(new Font("serif",Font.BOLD,20));
        name.setForeground(Color.black);
        label.add(name);

        name_text=new JTextField();
        name_text.setBounds(200,100,150,30);
        label.add(name_text);

        country = new JLabel("Country:");
        country.setBounds(400,100,200,30);
        country.setFont(new Font("serif",Font.BOLD,20));
        country.setForeground(Color.black);
        label.add(country);

        country_t=new JTextField();
        country_t.setBounds(600,100,150,30);
        label.add(country_t);

        address= new JLabel("Address:");
        address.setBounds(50,150,100,30);
        address.setFont(new Font("serif",Font.BOLD,20));
        address.setForeground(Color.black);
        label.add(address);

        address_t=new JTextField();
        address_t.setBounds(200,150,150,30);
        label.add(address_t);

        mobile= new JLabel("Mobile No:");
        mobile.setBounds(400,150,100,30);
        mobile.setFont(new Font("serif",Font.BOLD,20));
        mobile.setForeground(Color.black);
        label.add(mobile);

        mobile_t=new JTextField();
        mobile_t.setBounds(600,150,150,30);   
        label.add(mobile_t);

        email= new JLabel("Email Id:");
        email.setBounds(50,200,100,30);
        email.setFont(new Font("serif",Font.BOLD,20));
        email.setForeground(Color.black);
        label.add(email);

        email_t=new JTextField();
        email_t.setBounds(200,200,150,30);
        label.add(email_t);

        education= new JLabel("Education:");
        education.setBounds(400,200,100,30);
        education.setFont(new Font("serif",Font.BOLD,20));
        education.setForeground(Color.black);
        label.add(education);

        education_t=new JTextField();
        education_t.setBounds(600,200,150,30);
        label.add(education_t);

        employeeId= new JLabel("EmployeeId:");
        employeeId.setBounds(400,250,100,30);
        employeeId.setFont(new Font("serif",Font.BOLD,20));
        employeeId.setForeground(Color.black);
        label.add(employeeId);
        f.setVisible(false);

        employeeId_t=new JTextField();
        employeeId_t.setBounds(600,250,150,30);
        label.add(employeeId_t);


        job= new JLabel("Job Post:");
        job.setBounds(50,250,100,30);
        job.setFont(new Font("serif",Font.BOLD,20));
        job.setForeground(Color.black);
        label.add(job);

        job_t=new JTextField();
        job_t.setBounds(200,250,150,30);
        label.add(job_t);


        update=new JButton("Update");
        update.setBounds(250,400,100,30);
        update.addActionListener(this);
        update.setBackground(Color.orange);
        update.setForeground(Color.black);
        label.add(update);

        cancel=new JButton("Cancel");
        cancel.setBounds(450,400,100,30);
        cancel.addActionListener(this);
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.black);
        label.add(cancel);

        f.setSize(900,500);
        f.setLocation(450,250);
        f.getContentPane().setBackground(Color.gray);
        f.setLayout(null);
        f.setVisible(true);
        showData(idaa);
    }




    void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from add_employee where employeeId = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()) {
                f.setVisible(true);


                name_text.setText(rs.getString(1));
                country_t.setText(rs.getString(9));
                address_t.setText(rs.getString(4));
                mobile_t.setText(rs.getString(5));
                email_t.setText(rs.getString(6));
                education_t.setText(rs.getString(7));
                job_t.setText(rs.getString(8));
                employeeId_t.setText(rs.getString(10));

            }else {
                JOptionPane.showMessageDialog(null, "Id not found");
                f.setVisible(false);
                new details();
            }}catch(Exception ex){ ex.getStackTrace();}


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==update){
            try{
                conn con = new conn();
                String str = "update add_employee set name='"+name_text.getText()+"',country='"+country_t.getText()+"',address='"+address_t.getText()+"',phone ='"+mobile_t.getText()+"',email='"+email_t.getText()+"',education='"+education_t.getText()+"',job='"+job_t.getText()+"',employeeId='"+employeeId_t.getText()+"' where employeeId='"+id_emp+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new details();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==cancel){
            f.setVisible(false);
            details d =new details();
        }
    }

    public static void main(String[] arg){
        new Update_Employee("1");
    }
}

