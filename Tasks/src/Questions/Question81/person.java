package Questions.Question81;

import java.util.Objects;

public class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        person person1 = new person("Nardev", 23);
        person person2 = new person("Nardev", 23);

        if (person1.equals(person2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
