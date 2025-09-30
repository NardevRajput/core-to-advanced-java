class DataTypesExample {

    public static void main(String[] args) {

        // Primitive Data Types

        byte byteVar = 100;
        short shortVar = 10000;
        int intVar = 122112789;
        long longVar = 19999890123L;
        float floatVar = 12.34f;
        double doubleVar = 178.25689;
        char charVar = 'A';
        boolean boolVar = true;

        // Printing Primitive Data Types


        System.out.println("Primitive Data Types");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);

        // Non-Primitive Data Types

        int[] arrayVar = {1, 2, 3, 4, 5};

        // Printing Non-Primitive Data Types
        System.out.println("Non-Primitive Data Types");
        System.out.print("Array: ");
        for (int i : arrayVar) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
