class Circle implements Shape {
    public int radius = 10;

    public Circle() {}

    @Override
    public void information(){
        System.out.println("I am a regular Circle");
    }
}
