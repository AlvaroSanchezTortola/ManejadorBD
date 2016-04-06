/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import java.io.File;
import java.util.ArrayList;


/**
 *
 * @author Álvaro
 */


public class Motor {
    private ArrayList Datos;
    
    public Motor(){
    Datos = new ArrayList();
}
    
    public void CrearBase(String nombre){
        DataBase baseDatos =  new DataBase();
        
        try{
                    File directorio = new File("C:\\Users\\Álvaro\\Documents\\NetBeansProjects\\ManejadorBD\\ManejadorBD"+baseDatos.getNombre());
                    if(directorio.mkdir()==false){
                        //Error.add("No se pudo crear Base de Datos :"+nombre + ", compruebe que ese nombre no exista.");
                    }
                    //log.add("Base de Datos creada: "+nombre);
        
         }catch(Exception e) {
               //Error.add("No se pudo crear Bases de Datos :"+nombre + ", compruebe que ese nombre no exista.");
         }
    }
   
    
}
