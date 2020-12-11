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
import proyecto_cine.Cine;
import proyecto_cine.Cliente;

/**
 *
 * @author jafigueroa
 */
public class ClienteDBA {
    
    public int crear(Cliente cliente){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Cliente (Nombre,Apellido,Direccion,FechaNacimiento,Telefono,Email) values (?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, cliente.getNombre());
                pst.setString(2, cliente.getApellido());
                pst.setString(3, cliente.getDireccion());
                pst.setDate(4, cliente.getFechaNacimiento());
                pst.setString(5, cliente.getTelefono());
                pst.setString(6, cliente.getEmail());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Cliente cliente){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Cliente set Nombre = ?,Apellido = ?,Direccion = ?,FechaNacimiento = ?,Telefono = ?,Email = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, cliente.getNombre());
                pst.setString(2, cliente.getApellido());
                pst.setString(3, cliente.getDireccion());
                pst.setDate(4, cliente.getFechaNacimiento());
                pst.setString(5, cliente.getTelefono());
                pst.setString(6, cliente.getEmail());
                pst.setInt(7, cliente.getId());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
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
                String sql = "delete from Cliente where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public ArrayList<Cliente> obtenerTodos(){
        try
            {
                ArrayList<Cliente> clientes = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Cliente";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    clientes.add(new Cliente(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6)));
                }
                dba.desconectar();
                return clientes;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Cliente obtenerPorId(int id){
        try
            {
                Cliente cliente = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Cliente where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    cliente = new Cliente(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6));
                }
                dba.desconectar();
                return cliente;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    }
    
}
