/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import parser.SqlBaseVisitor;
import parser.SqlParser;

/**
 *
 * @author Álvaro
 */
public class ExpVisitor <T> extends SqlBaseVisitor<Object>{
    Motor motor = new Motor();
    
    public Motor getControlador() {
        return motor;
    }

        public void setControlador(Motor motor) {
            this.motor = motor;
        }
    
    //funciones
    @Override
    public T visitProgram(SqlParser.ProgramContext ctx){        
        for (int i = 0;i<ctx.getChildCount();i++){
			visit(ctx.getChild(i));
                        System.out.print("nop");
                        
                        //System.out.print(ctx.getChild(i).getText());
	            }  
        return (T)"";
    }
    
    @Override
    public T visitOracion(SqlParser.OracionContext ctx){        
        for (int i = 0;i<ctx.getChildCount();i++){
			visit(ctx.getChild(i));
                        System.out.print("aqui");
                        
                        //System.out.print(ctx.getChild(i).getText());
	            }  
        return (T)"";
    }
    
   
    
    @Override
    public T visitCreateDB( SQLParser.CreateDBContext ctx) { 
                
		motor.CrearBase(ctx.getChild(2).getText());
             
		return (T)"";	
	}
    
}
