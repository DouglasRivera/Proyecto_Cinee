/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cine;

import java.sql.Date;



/**
 *
 * @author jafigueroa
 */
public class Cliente {
    int Id;
    String Nombre;
    String Apellido;
    String Direccion;
    Date FechaNacimiento;
    String Telefono;
    String Email;

    public Cliente() {
    }

    public Cliente(String Nombre, String Apellido, String Direccion, Date FechaNacimiento, String Telefono, String Email) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public Cliente(int Id, String Nombre, String Apellido, String Direccion, Date FechaNacimiento, String Telefono, String Email) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
    
}
