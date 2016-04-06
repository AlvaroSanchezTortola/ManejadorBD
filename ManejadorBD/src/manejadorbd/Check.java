/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

/**
 *
 * @author Álvaro
 */
public class Check {
    private String nombre; 
    private String exp; 

    public Check(String nombre, String exp) {
        this.nombre = nombre;
        this.exp = exp;
    }

    public Check() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}
