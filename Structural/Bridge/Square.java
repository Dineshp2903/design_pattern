package BridgePattern;

public class Square extends Shape {

    public Square(DrawingTool drawingTool){
        super(drawingTool);
    }

    public void draw()
    {
        System.out.println("Square");
        drawingTool.draw();
    }
}
