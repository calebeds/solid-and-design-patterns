package structuraldesignpatterns.flyweight;

public class Rectangle implements Shape {
    private int x;
    private int y;
    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a %s rectangle | x = %s | y = %s%n", color, x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
