package structuraldesignpatterns.facade;

public class FacadeExample {
    public static void main(String[] args) {
        SortingManager manager = new SortingManager();
        manager.doBubbleSort();
        manager.doMergeSort();
    }
}
