package Employeee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener{
    JFrame f; 
    JLabel id,l1;
    JButton b;


    Front_Page(){
 
        f=new JFrame("Welcome to Adriano coffee!");
        f.setBackground(Color.black);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/font2.jfif"));
        Image i2 = i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(250,120,500,530);
        f.add(l1);



        b = new JButton("COME IN");
        b.setBackground(Color.orange);
        b.setForeground(Color.WHITE);
        b.setBounds(350,500,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("Employment Managment System");
        lid.setBounds(30,30,950,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.orange);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.gray);

        f.setVisible(true);
        f.setSize(1000,750);
        f.setLocation(200,100);

      /*  while(true){
            lid.setVisible(false); // lid =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){} 
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
        */
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }

    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
}
