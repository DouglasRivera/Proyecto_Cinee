/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import proyecto_cine.Sala;

/**
 *
 * @author jafigueroa
 */
public class SalaBDA {
   /*jjnnnbbb  public int crear(Sala sala){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Cines (Nombre, sillas, butacas, sonido) values (?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, sala.getNombre());
                pst.setInt(2, sala.getSillas());
                pst.setString(3, sala.getButacas());
                pst.setBoolean(4, sala.isSonido());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                return 0;
            }
    }
    
    public int actualizar(Sala cine){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Cines set Mision = ?, Vision = ?, Logo = ?, Ciudad = ?, Ubicacion = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, cine.getMision());
                pst.setString(2, cine.getVision());
                pst.setString(3, cine.getLogo());
                pst.setString(4, cine.getCiudad());
                pst.setString(5, cine.getUbicacion());
 
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                return 0;
            }
    }
    
    public int eliminar(int id){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "delete from Cines where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                return 0;
            }
    }
    
    public ArrayList<Cine> obtenerTodos(){
        try
            {
                ArrayList<Cine> cines = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Cines";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    cines.add(new Cine(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
                }
                dba.desconectar();
                return cines;
            } catch (SQLException | HeadlessException e)
            {
                return new ArrayList<>();
            }
    }
    
    public Cine obtenerPorId(int id){
        try
            {
                Cine cine = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Cines where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    cine = new Cine(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                }
                dba.desconectar();
                return cine;
            } catch (SQLException | HeadlessException e)
            {
                return null;
            }*/
}