/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeslokeritera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
                String url;
                url="jdbc:mysql://localhost:3306/tubeslokeritera";
                String username="root";
                String password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,username,password);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Connection Error");
            }
        }return koneksi;
    }static Object getConnection(){
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
