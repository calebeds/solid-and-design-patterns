package solid.singleresponsability;

public class ExampleSingleResponsability {
    public static void main(String[] args) {
        System.out.println("Welcome to the application");

        // we can get the values here
        final Pair pair = InputProcessor.process();

        // check whether the inputs are fine or not
        if(!ViolationChecker.isValid(pair)) {
            System.out.println("One of the input is invalid...");
            return;
        }

        final int firstInteger = Integer.parseInt(pair.getFirst());
        final int secondInteger = Integer.parseInt(pair.getSecond());

        // do the mathematical operation
        final int result = Operation.execute(firstInteger, secondInteger);

        System.out.println("The result is: " + result);
        System.out.println("End of the application!");
    }




}
