package interpreter;

public class SubExpression  implements Expression{
    private Expression lExpression;
    private Expression rExpression;

    @Override
    public int interpret(Context context) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'interpret'");
        return lExpression.interpret(context) - rExpression.interpret(context);
    }

    public SubExpression(Expression leftExpression,Expression rightExpression){
        this.lExpression = leftExpression;
        this.rExpression = rightExpression;
    }
    
}
