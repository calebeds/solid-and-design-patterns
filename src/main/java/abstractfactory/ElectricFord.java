package abstractfactory;

public class ElectricFord implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an electric ford");
    }
}
