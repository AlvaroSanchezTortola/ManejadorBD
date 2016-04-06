/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadorBD;

import Parser.SQLLexer;
import Parser.SQLParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Álvaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String progra = "CREATE DATABASE hola ";
        CharStream input = new ANTLRInputStream(progra);
        SQLLexer lexer = new SQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(tokens);
        parser.removeErrorListeners();
        ContextListener errorListener = new ContextListener();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.todo();
        String t =tree.toStringTree(parser);
        System.out.print(t);
    }
    
}
