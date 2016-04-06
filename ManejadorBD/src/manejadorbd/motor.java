/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import manejadorbd.manejadorJson;

/**
 *
 * @author Carlos Barrios
 */
public class motor {
    //Estructura de las nuevas db
    JSONArray newTable = new JSONArray();
    JSONObject newTableSchema = new JSONObject();
    JSONObject newTableData = new JSONObject();
    JSONObject newTableRelation = new JSONObject();
    String useDb;
    String newDb;
    String newTable;
    //variables
    JSONObject JsonObjSchema;
    JSONArray JsonArrayDb;
    
    public motor()
    {
        JsonObjSchema = manejadorJson.leerArchivo();
    }
    
    /**
    *Metodo para crear una db
    *@param nombre db
    */
    public void createdb (String nombredb)
    {       
        leerDb();
        JsonArrayDb.add("db: "+ nombredb);
        JsonObjSchema.put("backup", JsonArrayDb);
        
        newDb
 
    }
    
    /**Metodo para renombrar una db
    *@param nombre actual la db
    *@param nuevo nombre de la db 
    */
    public void renamedb (String actualNombre, String nuevoNombre)
    {       
        JSONObject JsonObj;
        for (int i=0; i<JsonArrayDb.size(); i++)
        {
            
                
                
        }    
       
    }
    
    /**
    Metodo para leer de la .txt y cargarlo en el JsonArrayDb
    */
    public void leerDb()
    {
        JsonArrayDb = (JSONArray) JsonObjSchema.get("backup");

        if (JsonArrayDb == null)
        {
            JsonArrayDb = new JSONArray();
        }
    }
    
    /**
    *Metodo para guardar en txt 
    */
    public void commit ()
    {
        manejadorJson.crearArchivo(JsonObjSchema);
    }
}
