package liskovsubstitutionprinciple;

public class PetrolCar extends Vehicle {
    public PetrolCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void slowDown() {
        System.out.println("Petrol Car is slowing down...");
    }

    @Override
    protected void speedUp() {
        System.out.println("Petrol Car is speeding up...");
    }

    @Override
    protected void fuel() {
        System.out.println("We can use petrol without any problem");
    }
}
