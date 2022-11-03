public class BlackColorShapeDecoratorBase extends ShapeDecoratorBase {
    public BlackColorShapeDecoratorBase(Shape shape) {
        super(shape);
        this.color = "Black";
    }


    @Override
    public void information() {
        System.out.println("I am " + shape.getClass().getSimpleName() + " with color " + this.color);
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
