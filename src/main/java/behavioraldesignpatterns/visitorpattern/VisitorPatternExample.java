package behavioraldesignpatterns.visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternExample {
    public static void main(String[] args) {
        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Table("desk", 20));
        items.add(new Chair("chair1", 30));
        items.add(new Chair("chair2", 25));

        double sum = 0;
        ShoppingCartVisitor shoppingCart = new ShoppingCart();

        for(ShoppingItem shoppingItem: items) {
            sum += shoppingItem.accept(shoppingCart);
        }

        System.out.println(sum);
    }
}
