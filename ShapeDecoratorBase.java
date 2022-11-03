abstract class ShapeDecoratorBase implements Shape{
    protected String color;
    protected Shape shape;
    public ShapeDecoratorBase(Shape shape){
        this.shape = shape;
    }
    @Override
    public void information() {
        System.out.println("I am " + shape.getClass().getSimpleName() + " with color " + this.color);
    }
    public String getColor(){
        return this.color;
    }
}
