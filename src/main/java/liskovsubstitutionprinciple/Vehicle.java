package liskovsubstitutionprinciple;

public abstract class Vehicle {
    protected String type;
    protected int age;

    public Vehicle(String type, int age) {
        this.type = type;
        this.age = age;
    }

    protected void slowDown() {
        System.out.println("Vehicle is slowing down...");
    }

    protected void speedUp() {
        System.out.println("Vehicle is speeding up...");
    }

    protected abstract void fuel();
}
