class array_To_String {
    public static void main(String[] args) {
        String[] arr = new String[] {
                "i", "am", "student", "of", "hindustan", "college"
        };
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
