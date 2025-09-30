package src;

public class if_else {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Bob";

        System.out.println("Before it");
        if (isMale) {
            System.out.println("Mr. " + name);
        }else {
            System.out.println("Ms. " + name);
        }
        System.out.println("after it");
    }
}
