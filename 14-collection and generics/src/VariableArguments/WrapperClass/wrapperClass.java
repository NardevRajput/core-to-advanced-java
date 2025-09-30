package VariableArguments.WrapperClass;

public class wrapperClass {
    public static void main(String[] args) {
        Integer first = Integer.valueOf(55);
        Integer second = Integer.valueOf("55");
        Integer third = 55;

        System.out.println(first + second + third);

        System.out.println(first);
        int fourth = first;

    }
}
