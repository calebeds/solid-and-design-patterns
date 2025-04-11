package behavioraldesignpatterns.visitorpattern;

public interface ShoppingItem {
    double accept(ShoppingCartVisitor visitor);
}
