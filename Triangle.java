class Triangle implements Shape{
    private int area;

    public Triangle() {
        area = 133;
    }

    public int getArea(){
        return this.area;
    }

    @Override
    public void information() {
        System.out.println("I am a regular Triangle");
    }
}
