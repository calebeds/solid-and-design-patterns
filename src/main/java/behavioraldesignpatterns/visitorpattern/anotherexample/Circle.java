package behavioraldesignpatterns.visitorpattern.anotherexample;

public class Circle implements Shape {


    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
