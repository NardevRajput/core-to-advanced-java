public class bitMaskOR {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        if ((bitMask | n) == 1) {
            System.out.println("bit was one");
        } else {
            System.out.println("bit was zero");
        }
        int number = bitMask | n;
        System.out.println(number);
    }
}
