package Employeee;

import java.sql.*; //- JDBC API

public class conn{
    
    public Connection c; // create object of class Connection
    public Statement s;  //
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","mad5ina9217" );
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
}}}