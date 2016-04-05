/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import java.io.IOException;
import java.util.Scanner;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.sqlBaseListener;
import parser.sqlLexer;
import parser.sqlParser;
import parser.sqlParser.DatabaseContext;

        
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;

/**
 *
 * @author Álvaro
 */
public class ManejadorBD {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws IOException {
      JTextPane textPane = new JTextPane();
      JScrollPane scrollPane = new JScrollPane(textPane);
      TextLineNumber tln = new TextLineNumber(textPane);
      scrollPane.setRowHeaderView( tln );
      
    }
}
        /*
        // TODO code application logic here
        sqlLexer lexer = new sqlLexer( new ANTLRFileStream("C:\\Users\\Álvaro\\Documents\\NetBeansProjects\\ManejadorBD\\ManejadorBD\\src\\manejadorbd\\test.txt"));        
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        sqlParser parser = new sqlParser( tokens );
        sqlParser.ExpContext context = parser.exp();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new AntlrSqlListener(), context );
        */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String text = "create database hola;";
        ManejadorBD m = new ManejadorBD();
        sqlLexer lexer = new sqlLexer(new ANTLRInputStream(text));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        sqlParser parser = new sqlParser( tokens );
        //ParseTree tree = parser.r();
        sqlParser.ExpContext context = parser.exp();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new AntlrSqlListener(), context );
        
        
       // m.printSQL(text);
       */ 


/**
 *  This class will display line numbers for a related text component. The text
 *  component must use the same line height for each line. TextLineNumber
 *  supports wrapped lines and will highlight the line number of the current
 *  line in the text component.
 *
 *  This class was designed to be used as a component added to the row header
 *  of a JScrollPane.
 */
