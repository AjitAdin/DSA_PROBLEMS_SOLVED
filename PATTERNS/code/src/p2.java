class p2 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            // Printing spaces (decreasing)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("#");
            }
            // Printing stars (increasing)
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
