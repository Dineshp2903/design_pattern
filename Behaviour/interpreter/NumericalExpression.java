package interpreter;

public class NumericalExpression implements Expression {

    private int number;
    public NumericalExpression(int number)
    {
        this.number = number;
    }

    @Override
    public int interpret(Context context)
    {
        return number;
    }
    
}
