import java.util.Random;

class AbstractFactory {
    public static BaseFactory getWhiteFactory(){
        return new WhiteFactory();
    }

    public static BaseFactory getBlackFactory(){
        return new BlackFactory();
    }

    public static BaseFactory getRandomFactory(){
        return new Random().nextInt(0, 2) == 1?
                new WhiteFactory():
                new BlackFactory();
    }
}
