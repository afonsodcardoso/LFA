public class VInterpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double res = null;
      if(ctx.expr() != null){
         res = (Double)visit(ctx.expr());
         if(res != null){
            System.out.println("RESULT: " + res);
         }
      }
      return res;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double e1 = visit(ctx.expr(0));
      Double e2 = visit(ctx.expr(1));
      Double resultado = null;
      if(e1 != null && e2 != null){
         switch(ctx.op.getText()){
            case "*":
               resultado = e1 * e2;
               break;
            
            case "+":
               resultado = e1 + e2;
               break;
            
            case "-":
               resultado = e1 - e2;
               break;
            
            case "/":
               if(e2 == 0){
                  System.out.println("DIVISAO POR ZERO");
               } else{
                  resultado = e1 / e2;
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
