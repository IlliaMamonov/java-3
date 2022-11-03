class Circle implements Shape {
    private int radius;

    public Circle() {
        radius = 10;
    }

    public int getRadius(){
        return this.radius;
    }

    @Override
    public void information(){
        System.out.println("I am a regular Circle");
    }
}
