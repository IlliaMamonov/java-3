public class Main {
    public static void main(String[] args){
        var factory = AbstractFactory.getRandomFactory();
        var circle = factory.getCircle();
        var triangle = factory.getTriangle();

        circle.information();
        triangle.information();
    }
}
