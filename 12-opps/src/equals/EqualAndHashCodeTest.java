package equals;

public class EqualAndHashCodeTest {
    public static void main(String[] args) {
        person person1 = new person("nardev", 23, "003");
        person person2 = new person("nardev", 23, "003");

        if (person1.equals(person2)) {
            System.out.println("equals");
        }else {
            System.out.println("Not equal");
        }
    }
}
