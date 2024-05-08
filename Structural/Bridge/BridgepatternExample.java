package BridgePattern;

public class BridgepatternExample {

    public static void main(String[] args)
    {
        Shape circle = new Circle(new Pencil());
        circle.draw();
        Shape square = new Square(new Pen());
        square.draw();
    }
    
}
