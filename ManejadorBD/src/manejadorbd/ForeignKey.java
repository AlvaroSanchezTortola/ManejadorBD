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
public class ForeignKey {
    private String nombre; 
    private ArrayList <String>  id1;
    private ArrayList <String>  id2; 

    public ForeignKey() {
    }

    public ForeignKey(String nombre, ArrayList<String> id1, ArrayList<String> id2) {
        this.nombre = nombre;
        this.id1 = id1;
        this.id2 = id2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getId1() {
        return id1;
    }

    public void setId1(ArrayList<String> id1) {
        this.id1 = id1;
    }

    public ArrayList<String> getId2() {
        return id2;
    }

    public void setId2(ArrayList<String> id2) {
        this.id2 = id2;
    }


}
