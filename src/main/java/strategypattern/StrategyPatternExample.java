package strategypattern;

public class StrategyPatternExample {
    public static void main(String[] args) {
        OperationManager manager = new OperationManager();
        manager.setStrategy(new Subtraction());
        manager.execute(10, 5);
    }
}
