import static java.lang.System.*;
import java.util.*;

public class Execute extends FracLangBaseVisitor<Fraction> {

   private Map<String, Fraction> variables = new HashMap<>();

   @Override public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      Fraction res = visit(ctx.expr());
      if(res != null){
         System.out.println(res);
      }
      return res;
   }

   @Override public Fraction visitAssignment(FracLangParser.AssignmentContext ctx) {
      Fraction res = visit(ctx.expr());
      String key = ctx.ID().getText();
      if(res != null){
         variables.put(key, res);
      }
      return res;
   }

   @Override public Fraction visitExprMultDiv(FracLangParser.ExprMultDivContext ctx) {
      Fraction res = null;
      Fraction e1 = visit(ctx.expr(0));
      Fraction e2 = visit(ctx.expr(1));
      if( e1 != null && e2 != null){
         switch(ctx.op.getText()){
            case "*":
            res = e1.mult(e2);
            break;

            case ":":
            res = e1.div(e2);
            break;
         }
      }
      return res;
   }

   @Override public Fraction visitExprAddSub(FracLangParser.ExprAddSubContext ctx) {
      Fraction res = null;
      Fraction e1 = visit(ctx.expr(0));
      Fraction e2 = visit(ctx.expr(1));
      if( e1 != null && e2 != null){
         switch(ctx.op.getText()){
            case "+":
            res = e1.add(e2);
            break;

            case "-":
            res = e1.sub(e2);
            break;
         }
      }
      return res;
   }

   @Override public Fraction visitExprFractionNumDen(FracLangParser.ExprFractionNumDenContext ctx) {
      Fraction res = null;
      try{
         long num = Long.parseLong(ctx.NUM(0).getText());
         long den = Long.parseLong(ctx.NUM(1).getText());
         res = new Fraction(num, den);
      }
      catch(NumberFormatException e){
         err.println("error!!!");
      }
      return res;
   }

   @Override public Fraction visitExprParent(FracLangParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      Fraction res = null;
      if(variables.containsKey(ctx.ID().getText())){
         res = variables.get(ctx.ID().getText());
      }
      return res;
   }

   @Override public Fraction visitExprUnary(FracLangParser.ExprUnaryContext ctx) {
      Fraction res = visit(ctx.expr());
      switch(ctx.op.getText()){
         case "-":
            res = new Fraction(-res.num(), res.den());
            break;
      }
      return res;
   }

   @Override public Fraction visitExprFractionNum(FracLangParser.ExprFractionNumContext ctx) {
      Fraction res = null;
      try{
         long num = Long.parseLong(ctx.NUM().getText());
         res = new Fraction(num, 1);
      }
      catch(NumberFormatException e){
         err.println("error!!!");
      }
      return res;
   }
}
