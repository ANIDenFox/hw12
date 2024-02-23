abstract class GraphicObject {
    private int x;
    private int y;
    private String color;

    public GraphicObject(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw();

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }
}