public class instanceVariablesAndMethods {
    // Instance variables
    String name;
    int age;

    public void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        instanceVariablesAndMethods person1 = new instanceVariablesAndMethods();
        person1.setDetails("Nardev", 21);
        person1.displayDetails();

        System.out.println("      2" +
                "3");

        instanceVariablesAndMethods person2 = new instanceVariablesAndMethods();
        person2.setDetails("Rahul", 25);
        person2.displayDetails();
    }
}
