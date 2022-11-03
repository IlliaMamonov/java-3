public class WhiteFactory implements BaseFactory {
    @Override
    public Shape getCircle() {
        return new WhiteColorShapeDecoratorBase(
                new Circle()
        );
    }

    @Override
    public Shape getTriangle() {
        return new WhiteColorShapeDecoratorBase(
                new Triangle()
        );
    }
}