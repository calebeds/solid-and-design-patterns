package solid.interfacesegregationprinciple;

public class InterfaceSegregationPrincipleExample {
    public static void main(String[] args) {
        RotationTree tree = new BalancedTree();

        tree.insert();
        tree.delete();
        tree.traverse();
        tree.leftRotation();
        tree.rightRotation();
    }
}
