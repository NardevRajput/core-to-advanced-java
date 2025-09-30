import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueChar {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your String: ");
        String userString = input.next();

        for (char ch : userString.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("Your string has %d unique characters", unique.size());
    }
}
