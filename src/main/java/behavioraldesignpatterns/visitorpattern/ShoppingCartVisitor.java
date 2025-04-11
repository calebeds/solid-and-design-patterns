package behavioraldesignpatterns.visitorpattern;

public interface ShoppingCartVisitor {
    double visit(Table table);
    double visit(Chair chair);
}
