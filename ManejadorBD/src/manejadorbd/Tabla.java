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
class Tabla {
    private String nombre; 
    private ArrayList <Columna> columnas; 
    private ArrayList <PrimaryKey> primaryk; 
    private ArrayList <ForeignKey> foreignk; 
    private ArrayList <Check> check; 
    

    public Tabla(String nombre) {
        this.nombre = nombre;
        columnas= new ArrayList();
        primaryk= new ArrayList();
        foreignk= new ArrayList();
        check= new ArrayList();
    }

    public Tabla() {
    }

    public void agregarPK(PrimaryKey p){
        primaryk.add(p);
    }
    public void agregarFK(ForeignKey f){
        foreignk.add(f);
    }
     public void agregarCheck(Check c) {
         check.add(c);
    }
     public void agregarColumna(Columna c) {
        columnas.add(c);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Columna> getColumnas() {
        return columnas;
    }

    public void setColumnas(ArrayList<Columna> columnas) {
        this.columnas = columnas;
    }

    public ArrayList<PrimaryKey> getPrimaryk() {
        return primaryk;
    }

    public void setPrimaryk(ArrayList<PrimaryKey> primaryk) {
        this.primaryk = primaryk;
    }

    public ArrayList<ForeignKey> getForeignk() {
        return foreignk;
    }

    public void setForeignk(ArrayList<ForeignKey> foreignk) {
        this.foreignk = foreignk;
    }

    public ArrayList<Check> getCheck() {
        return check;
    }

    public void setCheck(ArrayList<Check> check) {
        this.check = check;
    }
    

}
