/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dinesh;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


/**
 *
 * @author gdhin
 */
public class Dinesh {
    Connection con;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dinesh jd = new Dinesh();
        jd.createConnection();
        
    }
    public void createConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            System.out.println("Dinesh.Dinesh.createConnection()");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT*FROM users");
            while(rs.next()){
                String name = rs.getString("name");
                int age = rs.getInt(2);
                System.out.println(name + " " +age);
            }
            rs.close();
            stmt.close();
            System.out.println("connection successfull");
        }catch(SQLException ex){
            Logger.getLogger(Dinesh.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
