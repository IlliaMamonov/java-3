public class WhiteFactory implements BaseFactory {
    @Override
    public Shape getCircle() {
        return new WhiteColorShapeDecorator(
                new Circle()
        );
    }

    @Override
    public Shape getTriangle() {
        return new WhiteColorShapeDecorator(
                new Triangle()
        );
    }
}