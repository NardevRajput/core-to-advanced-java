class solidRectanglePattern11 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            System.out.println("* * * * *");
        }
        System.out.println();
        int n = 4;
        int m = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
