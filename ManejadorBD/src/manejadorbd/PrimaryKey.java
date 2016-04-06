/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import java.util.ArrayList;

/**
 *
 * @author Álvaro
 */
public class PrimaryKey {
    private String nombre; 
    private ArrayList <String> idref;

    public PrimaryKey(String nombre, ArrayList<String> idref) {
        this.nombre = nombre;
        this.idref = idref;
    }

    public PrimaryKey() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIdref() {
        return idref;
    }

    public void setIdref(ArrayList<String> idref) {
        this.idref = idref;
    }

   
    

}
