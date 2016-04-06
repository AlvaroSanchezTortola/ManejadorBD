/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Carlos Barrios
 */
public class manejadorJson {
    
    public static void crearArchivo (JSONObject obj, String useDb)
    {
        try (FileWriter file = new FileWriter("backup.txt")) {
            file.write(obj.toJSONString());
            System.out.println("El archivo se genero correctamente.");
            System.out.println("\nJSON Object: " + obj);
	} catch (IOException ex) {
            System.out.println("El archivo no se genero correctamente.");
        }
    }
    
    public static JSONObject leerArchivo ()
    {
       JSONParser parser = new JSONParser();
       try {
 
            Object obj = parser.parse(new FileReader("backup.txt"));
            JSONObject jsonObject = (JSONObject) obj;
            return jsonObject;
 
        } catch (Exception e) 
        {
            return new JSONObject();
        }
       
    }
    
}
