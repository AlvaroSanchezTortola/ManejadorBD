/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
/**
 *
 * @author olgac
 */

public class AbrirArchivo extends JFrame {
    private JButton botonFile;
    private String path;

    public AbrirArchivo() {
    }
   
    public void Abrir() {
        JFileChooser elegir = new JFileChooser();
        int opcion = elegir.showOpenDialog(botonFile);

        //Si presionamos el boton ABRIR en pathArchivo obtenemos el path del archivo
        if (opcion == JFileChooser.APPROVE_OPTION) {
            path = elegir.getSelectedFile().getPath(); //Obtiene path del archivo
            String nombrthArchivo = elegir.getSelectedFile().getPath(); //Obtiene path del archivo
            String nombre = elegir.getSelectedFile().getName(); //obtiene nombre del archivo
            String path = elegir.getSelectedFile().getPath();
            System.out.println("El nombre del archivo es: "+ nombre);
            System.out.println("El path del archivo es: "+ path);
        }
        
    }

    public String getPath() {
        return path;
    }
}
