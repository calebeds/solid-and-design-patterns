package structuraldesignpatterns.adapter;

public class BicycleAdapter implements Vehicle {

    private final Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.go();
    }
}
