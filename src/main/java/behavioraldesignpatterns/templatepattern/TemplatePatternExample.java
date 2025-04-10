package behavioraldesignpatterns.templatepattern;

public class TemplatePatternExample {
    public static void main(String[] args) {
        final int[] nums = {1, 5, 3, -2, 10, 12, 8, 6};
        Algorithm sorting = new BubbleSort(nums);
        sorting.sort();

    }
}
