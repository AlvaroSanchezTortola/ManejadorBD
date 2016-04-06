/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadorBD;

import parser.SqlBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author Álvaro
 */
public class Context extends SqlBaseListener {
    @Override
    public void enterEveryRule(ParserRuleContext ctx){
        System.out.println(ctx.toString());
    }
}
