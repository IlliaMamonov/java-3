abstract class ShapeDecoratorBase implements Shape{
    protected String color;
    protected Shape shape;
    public ShapeDecoratorBase(Shape shape){
        this.shape = shape;
    }
    public abstract void information();
    public abstract String getColor();
}
