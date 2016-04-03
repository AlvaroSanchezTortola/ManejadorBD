/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import parser.sqlBaseListener;

/**
 *
 * @author Álvaro
 */
public class ManejadorBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public class AntlrDrinkListener extends sqlBaseListener {
 
    @Override
    public void enterDrink(sqlContext ctx) {
        System.out.println(ctx.getText());
    }
 
}
}
