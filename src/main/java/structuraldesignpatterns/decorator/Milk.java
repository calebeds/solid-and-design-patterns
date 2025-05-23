package structuraldesignpatterns.decorator;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        // we sum up the costs
        return super.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Milk";
    }
}
