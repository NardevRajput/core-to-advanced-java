public class constructorChaining {
        String name;
        int age;
        String course;

        // Constructor 1 (Default)
        public constructorChaining() {
            this("Unknown", 0, "Not Assigned");  // calling Constructor 3
            System.out.println("Default constructor called");
        }

        // Constructor 2 (Two parameters)
        public constructorChaining(String name, int age) {
            this(name, age, "Computer Science");  // calling Constructor 3
            System.out.println("2-arg constructor called");
        }

        // Constructor 3 (Three parameters)
        public constructorChaining(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
            System.out.println("3-arg constructor called");
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        }

        public static void main(String[] args) {
            constructorChaining s1 = new constructorChaining();
            s1.display();

            System.out.println(" ");

            constructorChaining s2 = new constructorChaining("Nardev", 21);
            s2.display();
        }

}
