public class StringMethod {
    public static void main(String[] args) {
        String name = "Nardev";

        System.out.println("Original: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Char at index 2: " + name.charAt(2));
        System.out.println("Contains 'dev': " + name.contains("dev"));
    }
}
