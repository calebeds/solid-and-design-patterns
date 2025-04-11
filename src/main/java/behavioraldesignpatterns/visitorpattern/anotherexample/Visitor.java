package behavioraldesignpatterns.visitorpattern.anotherexample;

public interface Visitor {
    void visitCircle(Circle circle);
    void visitTriangle(Triangle triangle);
    void visitRectangle(Rectangle rectangle);
}
