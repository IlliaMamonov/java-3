abstract class ShapeDecorator implements Shape{
    protected String color;
    protected Shape shape;
    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    public abstract void information();
    public abstract String getColor();
}
