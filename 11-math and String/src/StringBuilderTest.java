public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("first");
        sb.append("..second..");
        sb.append("third.");
        sb.append(45);
        System.out.println(sb);
    }
}
