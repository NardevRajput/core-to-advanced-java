public class forEachLoop {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Nardev";
        names[1] = "Rajput";
        names[2] = "Java";
        names[3] = "Coder";
        names[4] = "Developer";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
