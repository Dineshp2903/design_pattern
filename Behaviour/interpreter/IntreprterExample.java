package interpreter;

public class IntreprterExample {


    public static Expression parseContext(Context context)
    {
        String[] d = context.context.split(" ");
        Integer l = Integer.parseInt(d[1]);
        Integer r = Integer.parseInt(d[3]);
        if("add".equals(d[0]))
        {
            return new AddExpression(new NumericalExpression(l),new NumericalExpression(r));
        }
        else if("sub".equals(d[0]))
        {
            return new SubExpression(new NumericalExpression(l),new NumericalExpression(r));
        }
        return null;
    }

    public static void main(String[] args)
    {
        Context context = new Context("add 5 and 2");
        Expression expression = parseContext(context);
        int result = expression.interpret(context);
        System.out.println(result);

         context = new Context("sub 5 and 2");
         expression = parseContext(context);
         result = expression.interpret(context);
        System.out.println(result);
    }
    
}
