public class mathFun {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.07));

        System.out.println(Math.random());

        for (int i = 0; i < 10; i++) {
            double random = Math.round(Math.random() * 10);
            System.out.println(random);
        }
    }
}
