package solid.liskovsubstitutionprinciple;

public class ElectricCar extends Vehicle {
    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void slowDown() {
        System.out.println("Electric Car is slowing down...");
    }

    @Override
    protected void speedUp() {
        System.out.println("Electric Car is speeding up...");
    }

    @Override
    protected void fuel() {
        System.out.println("Electric cars is being charged");
    }
}
