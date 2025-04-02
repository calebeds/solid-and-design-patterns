package singleresponsability;

import java.util.Scanner;

public class InputProcessor {
    public static Pair process() {
        // ask the user for any input
        final Scanner scanner = new Scanner(System.in);

        // get the given values
        System.out.println("Enter the first number: ");
        final String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number: ");
        final String secondNumber = scanner.nextLine();

        scanner.close();

        return new Pair(firstNumber, secondNumber);
    }
}
