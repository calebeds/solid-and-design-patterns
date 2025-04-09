package creationalpatterns.abstractfactory;

public class PetrolFord implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an petrol ford");
    }
}
