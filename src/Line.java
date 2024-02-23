class Line extends GraphicObject {
    private int length;

    public Line(int x, int y, String color, int length) {
        super(x, y, color);
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Line at (" + getX() + ", " + getY() + ") with length " + length + " and color " + getColor());
    }

    private int getLength() {
        return length;
    }
}
