package creationalpatterns.builderpattern;

public class Student {
    private String name;
    private String university;
    private int age;

    public Student(Builder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;
    }

    private static class Builder {
        private final String name;
        private final String university;
        private int age;

        public Builder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        private Builder setAge(int age) {
            this.age = age;
            return this;
        }

        private Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                '}';
    }
}
