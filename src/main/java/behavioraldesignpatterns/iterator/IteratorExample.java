package behavioraldesignpatterns.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class IteratorExample {
    public static void main(String[] args) {
//        NameRepository repository = new NameRepository();
//
//        for(Iterator it = repository.getIterator(); it.hasNext();) {
//            String name = (String) it.next();
//            System.out.println(name);
//        }

        // how it works in Java
        List<String> names = Arrays.asList("Adam", "Daniel", "Ana");

        Stack<String> stack = new Stack<>();
        stack.push("10");
        stack.push("20");
        stack.push("30");

        Iterator<String> iterator = stack.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
