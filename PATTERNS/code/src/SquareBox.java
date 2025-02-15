
class SquareBox {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println(); // Move to the next line
        // System.out.println();
        for(int j=0;j<n-2;j++){
            System.out.print("*");
            for(int i=0;i<n-2;i++){
                System.out.print(" ");
            }
            System.out.println("*");
        }




        // System.out.println();
        for(int i=0;i<n;i++){
            System.out.print("*");
        }

    }
}


// class Pattern6 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }






7️⃣ Hollow Diamond Pattern
        markdown
Copy
        Edit
    *
            * *
            *   *
            *     *
            *       *
            *     *
            *   *
            * *
            *
Java Code:
java
        Copy
Edit
class Main {
    public static void main(String[] args) {
        int n = 5;

        // Upper Hollow Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower Hollow Pyramid
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
8️⃣ Number Pyramid
markdown
        Copy
Edit
    1
            121
            12321
            1234321
            123454321
Java Code:
java
        Copy
Edit
class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}