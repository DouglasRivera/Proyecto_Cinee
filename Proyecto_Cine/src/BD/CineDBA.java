/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyecto_cine.Cine;

/**
 *
 * @author jafigueroa
 */
public class CineDBA {
    
    public int insertar(Cine cine){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into proveedores (Mision,Vision, Logo, Ciudad,Ubicacion) values (?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, cine.getMision());
                pst.setString(2, cine.getVision());
                pst.setString(3, cine.getLogo());
                pst.setString(4, cine.getCiudad());
                 pst.setString(4, cine.getUbicacion());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                return 0;
            }
    }
    
}
