/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author arace
 */
public class Conexion {
        Connection cn;
        Statement st;   
        PreparedStatement  pps= null;
        ResultSet rs= null;

        
        
        public Connection conectar() {
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/creperia", "root","iaz141994");
           // JOptionPane.showMessageDialog(null,"Conexión exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error en la conexión " + e);
        }
    return cn;

}
        
    public void actualizarCmb(javax.swing.JComboBox combo)
   {
        String SQL = "SELECT nombre FROM empleados";

        try{     
           pps= cn.prepareStatement(SQL);
           rs=pps.executeQuery();
           while(rs.next())
           {
               String nombres = rs.getString (1);
               combo.addItem(nombres);
           }
        }
        catch(SQLException err){
           System.out.println(err);
        }   
   }
    
    public void actualizarCmb2(javax.swing.JComboBox combo)
   {
        String SQL = "SELECT descripcion FROM puestos";

        try{     
           pps= cn.prepareStatement(SQL);
           rs=pps.executeQuery();
           while(rs.next())
           {
               String nombres = rs.getString (1);
               combo.addItem(nombres);
           }
        }
        catch(SQLException err){
           System.out.println(err);
        }   
   }
    
   
        
}

