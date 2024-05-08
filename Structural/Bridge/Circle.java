package BridgePattern;

public class Circle extends Shape {
    
    public Circle(DrawingTool drawingTool)
    {
        super(drawingTool);
    }

    public void draw()
    {
        System.out.println("Circle ...");
        drawingTool.draw();
    }
}
