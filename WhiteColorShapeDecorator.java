public class WhiteColorShapeDecorator extends ShapeDecorator {
    public WhiteColorShapeDecorator(Shape shape) {
        super(shape);
        this.color = "White";
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
