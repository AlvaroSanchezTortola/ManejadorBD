/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadorBD;

import Parser.SQLLexer;
import Parser.SQLParser;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

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
        
        String text = "CREATE DATABASE hola ";
        CharStream input = new ANTLRInputStream(text);
        SQLLexer lexer = new SQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(tokens);
        parser.removeErrorListeners();
        ContextListener errorListener = new ContextListener();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.todo();
        String t =tree.toStringTree(parser);
        //System.out.print(t);
        System.out.println(tree.toStringTree(parser));
        
        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
        parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
    
}
