package liskovsubstitutionprinciple;

public class LiskovSubstitutionPrincipleExample {
    public static void main(String[] args) {
        Vehicle v = new ElectricCar("Tesla", 12);

        v.slowDown();
        v.speedUp();
        v.fuel();
    }
}
