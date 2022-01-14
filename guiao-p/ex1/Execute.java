import java.util.*;

public class Execute extends StrLangBaseVisitor<String> {

   Map<String, String> variables = new HashMap<>();
   Scanner sc = new Scanner(System.in);

   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
      String s = visit(ctx.string());
      System.out.println(s);
      return s;
   }

   @Override public String visitAssignment(StrLangParser.AssignmentContext ctx) {
      variables.put(ctx.ID().getText(), visit(ctx.string()));
      return null;
   }

   @Override public String visitTextRem(StrLangParser.TextRemContext ctx) {
      String original = visit(ctx.s1);
      return original.replace(visit(ctx.s2), "");
   }

   @Override public String visitInput(StrLangParser.InputContext ctx) {
      System.out.print(ctx.STRING().getText().substring(1, (ctx.STRING().getText()).length() - 1));
      String res;
      if(sc.hasNextLine()){
         res = sc.nextLine();
         return res;
      } else { 
         System.err.println("ERROR!!!!");
         return null;
      }
   }

   @Override public String visitReplace(StrLangParser.ReplaceContext ctx) {
      return visit(ctx.s1).replace(visit(ctx.s2), visit(ctx.s3));
   }

   @Override public String visitVariable(StrLangParser.VariableContext ctx) {
      if(!variables.containsKey(ctx.ID().getText())){
         System.err.println("erro");
         return null;
      } else{ return variables.get(ctx.ID().getText()); }
   }

   @Override public String visitConcat(StrLangParser.ConcatContext ctx) {
      return visit(ctx.s1) + visit(ctx.s2);
   }

   @Override public String visitWsRem(StrLangParser.WsRemContext ctx) {
      return visit(ctx.string()).trim();
   }

   @Override public String visitPriority(StrLangParser.PriorityContext ctx) {
      return visit(ctx.string());
   }

   @Override public String visitLiteral(StrLangParser.LiteralContext ctx) {
      return ctx.STRING().getText().substring(1, (ctx.STRING().getText()).length() - 1);
   }
}
