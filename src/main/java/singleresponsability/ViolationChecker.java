package singleresponsability;

public class ViolationChecker {
    // we have to return true if the pair components are numbers
    // otherwise we return false
    public static boolean isValid(Pair pair) {
        final String first = pair.getFirst();
        final String second = pair.getSecond();

        try {
            Integer.parseInt(first);
        } catch (NumberFormatException ex) {
            return false;
        }

        try {
            Integer.parseInt(second);
        } catch (NumberFormatException ex) {
            return false;
        }

        return true;
    }
}
