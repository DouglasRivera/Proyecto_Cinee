/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cine;

import java.util.ArrayList;

/**
 *
 * @author ARLES MACIAS
 */
public class Cine {
    String Mision;
    String Vision;
    String Logo;
    String Ciudad;
    String Ubicacion;
    ArrayList <Sala> Salas = new ArrayList();

    public Cine() {
    }

    
    
    public Cine(String Mision, String Vision, String Logo, String Ciudad, String Ubicacion) {
        this.Mision = Mision;
        this.Vision = Vision;
        this.Logo = Logo;
        this.Ciudad = Ciudad;
        this.Ubicacion = Ubicacion;
    }

    public String getMision() {
        return Mision;
    }

    public void setMision(String Mision) {
        this.Mision = Mision;
    }

    public String getVision() {
        return Vision;
    }

    public void setVision(String Vision) {
        this.Vision = Vision;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public ArrayList<Sala> getSalas() {
        return Salas;
    }

    public void setSalas(ArrayList<Sala> Salas) {
        this.Salas = Salas;
    }
    
    
    
    

}
