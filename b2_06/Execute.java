import java.util.HashMap;

public class Execute extends CalculatorBaseVisitor<Integer> {

   static HashMap<String, Integer> consts = new HashMap<String, Integer>();

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      Integer res = null;
      if(ctx.expr() != null){
         res =  visit(ctx.expr());
         if(res != null){
            System.out.println("RESULT: " + res);
         }
      }
      return visitChildren(ctx);
   }

   @Override public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {
      String key = ctx.ID().getText();
      Integer number = visit(ctx.expr());
      consts.put(key,number);
      return 0;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer resultado = null;
      Integer e1 = visit(ctx.expr(0));
      Integer e2 = visit(ctx.expr(1));
      
      if(e1 != null && e2 != null){
         switch(ctx.op.getText()){
            case "+":
               resultado = e1 + e2;
               break;
            case "-":
               resultado = e1 - e2;
               break;
            default:
               System.exit(0);
               break;
            }
         }
      return resultado;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Integer resultado = null;
      Integer number = visit(ctx.expr());
      if(number != null){
         resultado = number;
      }
      return resultado;
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.Integer().getText());
   }

   @Override public Integer visitExprID(CalculatorParser.ExprIDContext ctx) {
      String key = ctx.ID().getText();
      Integer number = consts.get(key);
      return number;
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Integer resultado = null;
      Integer e1 = visit(ctx.expr(0));
      Integer e2 = visit(ctx.expr(1));
      
      if(e1 != null && e2 != null){
         switch(ctx.op.getText()){
            case "*":
               resultado = e1 * e2;
               break;
            case "/":
               if(e2 == 0){
                  System.out.println("DIVISAO POR ZERO");
               } else{ 
                  resultado = e1 / e2;
               }
               break;
            case "%":
               if(e2 == 0){
                  System.out.println("DIVISAO POR ZERO");
               } else {
                  resultado = e1 % e2;
               }
               break;
            default:
               System.exit(0);
               break;
            }
         }
      return resultado;
   }
}
