/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import parser.sqlBaseListener;
import parser.sqlParser;

/**
 *
 * @author Álvaro
 */
    public class AntlrSqlListener extends sqlBaseListener { 
    @Override
    public void enterSql2003Parser(sqlParser.Sql2003ParserContext ctx) {
        //System.out.println(ctx.getText());
        System.out.println( "Entering R : " + ctx.getText() );
        
    }
    @Override
    public void exitSql2003Parser(sqlParser.Sql2003ParserContext ctx) {
        //System.out.println(ctx.getText());
        System.out.println( "Exiting R" );
    }
    
 
}