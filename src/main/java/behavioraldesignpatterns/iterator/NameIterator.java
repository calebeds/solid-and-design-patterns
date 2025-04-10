package behavioraldesignpatterns.iterator;

public class NameIterator implements Iterator {

    private final String[] names;

    private int index = 0;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if(hasNext()) {
            return names[index++];
        }

        return null;
    }
}
