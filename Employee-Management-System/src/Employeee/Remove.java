package Employeee;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Remove implements ActionListener {
    JFrame f;
    JLabel id8, name, aname, phone, aphone, email, aemail, label;
    String name2, phone2, email2;
    JButton remove, cancel;
     String input_text ;
    Remove(String e_id) {
         input_text =e_id;
        try {
            conn con = new conn();
            String str = "select * from add_employee where employeeId = '" + e_id + "'";
            ResultSet rs = con.s.executeQuery(str);

            while (rs.next()) {

                name2 = rs.getString("name");
                phone2 = rs.getString("phone");
                email2 = rs.getString("email");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        f = new JFrame("Remove Employee");
        f.setVisible(true);
        f.setSize(450, 450);
        f.setLocation(450, 200);
        f.getContentPane().setBackground(Color.gray);

        f.setLayout(null);


        label = new JLabel();
        label.setBounds(50, 0, 595, 642);
        label.setLayout(null);


        id8 = new JLabel("Employee Details");
        id8.setBounds(80, 10, 250, 30);
        f.add(id8);
        id8.setFont(new Font("serif", Font.BOLD, 25));
        id8.setForeground(Color.orange);
        label.add(id8);
        f.add(label);


        name = new JLabel("Name:");
        name.setBounds(20, 80, 100, 30);
        name.setFont(new Font("serif", Font.BOLD, 20));
        name.setForeground(Color.green);
        label.add(name);

        aname = new JLabel(name2);
        aname.setBounds(150, 80, 300, 30);
        aname.setFont(new Font("serif", Font.BOLD, 20));
        aname.setForeground(Color.black);
        label.add(aname);


        phone = new JLabel("Mobile No:");
        phone.setBounds(20, 130, 100, 30);
        phone.setFont(new Font("serif", Font.BOLD, 20));
        phone.setForeground(Color.green);
        label.add(phone);

        aphone = new JLabel(phone2);
        aphone.setBounds(150, 130, 300, 30);
        aphone.setFont(new Font("serif", Font.BOLD, 20));
        aphone.setForeground(Color.black);
        label.add(aphone);


        email = new JLabel("Email:");
        email.setBounds(20, 180, 100, 30);
        email.setFont(new Font("serif", Font.BOLD, 20));
        email.setForeground(Color.green);
        label.add(email);

        aemail = new JLabel(email2);
        aemail.setBounds(150, 180, 300, 30);
        aemail.setFont(new Font("serif", Font.BOLD, 20));
        aemail.setForeground(Color.black);
        label.add(aemail);


        remove = new JButton("Remove");
        remove.setBackground(Color.orange);
        remove.setForeground(Color.black);
        remove.setBounds(20, 300, 100, 30);
        remove.addActionListener(this);
        label.add(remove);

        cancel = new JButton("cancel");
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.black);
        cancel.setBounds(200, 300, 100, 30);
        cancel.addActionListener(this);
        label.add(cancel);

    }

    public void actionPerformed(ActionEvent ae) {


        if (ae.getSource() == remove) {
            try {
                conn con = new conn();
                String str = "delete from add_employee where employeeId = '" + input_text+ "'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "deleted successfully");
                name.setVisible(false);
                email.setVisible(false);
                phone.setVisible(false);
                aname.setVisible(false);
                aemail.setVisible(false);
                aphone.setVisible(false);
                remove.setVisible(false);
                cancel.setVisible(false);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Exception occured while delting record " + ex);
            }
        }
        if (ae.getSource() == cancel) {
            f.setVisible(false);
            new View_Employee(); }
    }

public static void main(String[] args){
        new Remove("8");
    }
}

