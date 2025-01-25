import java.util.Scanner;

public class Main{

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                count1++;
            } else {
                count2++;
            }
        }
        int r=count1-count2;
        System.out.println(r);
    }

}