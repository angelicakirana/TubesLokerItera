/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeslokeritera;


import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class TubesLokerItera {

    /**
     * @param args the command line arguments
     */
    Connection konek ;
public Connection getConnection (){
    try {
        konek= DriverManager.getConnection("jdbc:mysql://localhost:3306/tubeslokeritera","root",""); 
    }catch (SQLException e){
        System.out.println("Tidak dapat menyambung database");
    }
    return konek;
}
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        TubesLokerItera konek = new TubesLokerItera();
        Connection konek1 = konek.getConnection();
        Statement stat = konek1.createStatement();
    
    }
}
