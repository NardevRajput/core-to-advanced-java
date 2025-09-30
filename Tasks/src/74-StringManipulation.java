class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Nardev";
        String lastName = "Rajput";
        String FullName = firstName + lastName;
        System.out.println(FullName);

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}
