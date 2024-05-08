package BridgePattern;

abstract class  Shape {
    protected DrawingTool drawingTool;
    protected Shape(DrawingTool drawingTool)
    {
        this.drawingTool = drawingTool;
    }

    public abstract void draw();
}
