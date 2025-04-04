package interfacesegregationprinciple;

public class BinarySearchTree implements Tree {
    @Override
    public void insert() {
        System.out.println("Inserting a new Item");
    }

    @Override
    public void delete() {
        System.out.println("Removing a given Item");
    }

    @Override
    public void traverse() {
        System.out.println("In-order traversal in O(N)...");
    }
}
