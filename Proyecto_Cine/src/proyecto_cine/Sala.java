/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cine;

/**
 *
 * @author ARLES MACIAS
 */
public class Sala {
    String Nombre;
    int sillas;
    String butacas;
    boolean sonido;

    public Sala() {
    }

    public Sala(String Nombre, int sillas, String butacas, boolean sonido) {
        this.Nombre = Nombre;
        this.sillas = sillas;
        this.butacas = butacas;
        this.sonido = sonido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public String getButacas() {
        return butacas;
    }

    public void setButacas(String butacas) {
        this.butacas = butacas;
    }

    public boolean isSonido() {
        return sonido;
    }

    public void setSonido(boolean sonido) {
        this.sonido = sonido;
    }

}
