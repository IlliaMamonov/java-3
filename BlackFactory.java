public class BlackFactory implements BaseFactory {
    @Override
    public Shape getCircle() {
        return new BlackColorShapeDecoratorBase(
                new Circle()
        );
    }

    @Override
    public Shape getTriangle() {
        return new BlackColorShapeDecoratorBase(
                new Triangle()
        );
    }
}
