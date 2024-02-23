class Circle extends GraphicObject {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at (" + getX() + ", " + getY() + ") with radius " + radius + " and color " + getColor());
    }

    private int getRadius() {
        return radius;
    }
}