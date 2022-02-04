package Employeee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Forget_Password implements ActionListener {

 JFrame f;
 JTextField t;
 JLabel l, l5;
 JButton search, cancel;

 Forget_Password() {
  //new Search_Employee();
  f = new JFrame("Forget_Password");
  f.setBackground(Color.green);
  f.setLayout(null);

  l5 = new JLabel();
  l5.setBounds(0, 20, 500, 200);
  l5.setLayout(null);
  ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/search.jfif"));
  l5.setIcon(img);


  l = new JLabel("Enter Phone Number:");
  l.setVisible(true);
  l.setBounds(280, 15, 250, 30);
  l.setForeground(Color.orange);
  Font F1 = new Font("serif", Font.BOLD, 25);
  l.setFont(F1);
  l5.add(l);
  f.add(l5);

  t = new JTextField();
  t.setBounds(285, 80, 200, 30);
  l5.add(t);

  search = new JButton("Search");
  search.setBounds(285, 150, 90, 30);
  search.addActionListener(this);
  search.setBackground(Color.orange);
  l5.add(search);


  cancel = new JButton("Cancel");
  cancel.setBounds(420, 150, 90, 30);
  cancel.addActionListener(this);
  cancel.setBackground(Color.red);
  l5.add(cancel);

  f.setSize(550, 270);
  f.setLocation(450, 250);
  f.getContentPane().setBackground(Color.gray);
  f.setVisible(true);

 }

 public void actionPerformed(ActionEvent ae) {

  if (ae.getSource() == cancel) {
   f.setVisible(false);
   login l = new login();
  }
  if (ae.getSource() == search) {
   f.setVisible(false);
   ForgetSearch f = new ForgetSearch(t.getText());
  }

 }

 public static void main(String[] ar) {
  Forget_Password f = new Forget_Password();
 }
}
