package creationalpatterns.builderpattern;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Person person = new Person.Builder("Kevin", "kevin@gmail.com").setAge(15).setAddress("Hudson Street").build();
        System.out.println(person);
    }
}
