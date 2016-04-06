/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Álvaro
 */
public class DataBase {
    private String nombre; 

    private List <Tabla> tablas; 

    public DataBase(String nombre) {
        this.nombre = nombre;
        tablas=new ArrayList() ;
    }

    public DataBase() {
    	
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<Tabla> getTablas() {
         return tablas;
    }

    public void setTabla(Tabla ta) {
        tablas.add(ta);
    }

    public void setTablas(List<Tabla> tablas) {
        this.tablas = tablas;
    }
    
    
}
