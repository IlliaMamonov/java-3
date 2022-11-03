public class BlackFactory implements BaseFactory {
    @Override
    public Shape getCircle() {
        return new BlackColorShapeDecorator(
                new Circle()
        );
    }

    @Override
    public Shape getTriangle() {
        return new BlackColorShapeDecorator(
                new Triangle()
        );
    }
}
