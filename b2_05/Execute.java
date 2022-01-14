import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;

public class Execute extends NumbersBaseListener {

   static HashMap<String,Integer> assocs = new HashMap<String,Integer>();
   
   public boolean contains(String key){
      return assocs.containsKey(key);
   }

   //public Integer value(String key){
     // if(contains(key)){
       //  return assocs.get(key);
      //}
      //else return null;
   //}

   @Override public void exitExpr(NumbersParser.ExprContext ctx) {
      String key = ctx.Word().getText();
      Integer value = Integer.parseInt(ctx.Number().getText());

      if(contains(key)){
         System.out.println("!!Number repeated!!");
         System.exit(1);
      }
      assocs.put(key,value);
   }

   @Override public void exitEveryRule(ParserRuleContext ctx) {
   }

   @Override public void visitTerminal(TerminalNode node) {
   }

   @Override public void visitErrorNode(ErrorNode node) {
   }
}
