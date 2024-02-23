class Rectangle extends GraphicObject {
    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle at (" + getX() + ", " + getY() + ") with width " + width + ", height " + height + " and color " + getColor());
    }

    private int getWidth() {
        return width;
    }

    private int getHeight() {
        return height;
    }
}