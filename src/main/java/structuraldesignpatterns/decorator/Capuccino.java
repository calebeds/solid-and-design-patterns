package structuraldesignpatterns.decorator;

public class Capuccino extends BeverageDecorator {
    public Capuccino(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        // we sum up the costs
        return super.getCost() + 6;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Capuccino";
    }
}
