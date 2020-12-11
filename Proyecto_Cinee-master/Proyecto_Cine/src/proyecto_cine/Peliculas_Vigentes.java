/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cine;

import java.util.Date;

/**
 *
 * @author ARLES MACIAS
 */
public class Peliculas_Vigentes {
    String Nombre;
    String Edades;
    String Descripcion;
    String Formato;
    String Duracion;
    String Genero;
    String Idioma;
    String Trailer;
    Date Fecha;
    String Horario;
    double PrecioNiño;
    double PrecioAdulto;
    double Precio3raEdad;

    public Peliculas_Vigentes() {
    }

    public Peliculas_Vigentes(String Nombre, String Edades, String Descripcion, String Formato, String Duracion, String Genero, String Idioma, String Trailer, Date Fecha, String Horario, double PrecioNiño, double PrecioAdulto, double Precio3raEdad) {
        this.Nombre = Nombre;
        this.Edades = Edades;
        this.Descripcion = Descripcion;
        this.Formato = Formato;
        this.Duracion = Duracion;
        this.Genero = Genero;
        this.Idioma = Idioma;
        this.Trailer = Trailer;
        this.Fecha = Fecha;
        this.Horario = Horario;
        this.PrecioNiño = PrecioNiño;
        this.PrecioAdulto = PrecioAdulto;
        this.Precio3raEdad = Precio3raEdad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdades() {
        return Edades;
    }

    public void setEdades(String Edades) {
        this.Edades = Edades;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getTrailer() {
        return Trailer;
    }

    public void setTrailer(String Trailer) {
        this.Trailer = Trailer;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public double getPrecioNiño() {
        return PrecioNiño;
    }

    public void setPrecioNiño(double PrecioNiño) {
        this.PrecioNiño = PrecioNiño;
    }

    public double getPrecioAdulto() {
        return PrecioAdulto;
    }

    public void setPrecioAdulto(double PrecioAdulto) {
        this.PrecioAdulto = PrecioAdulto;
    }

    public double getPrecio3raEdad() {
        return Precio3raEdad;
    }

    public void setPrecio3raEdad(double Precio3raEdad) {
        this.Precio3raEdad = Precio3raEdad;
    }
    
}
