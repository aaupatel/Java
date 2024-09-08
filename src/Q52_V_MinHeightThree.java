import java.util.Scanner;

public class Q52_V_MinHeightThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 2 * (n - i) - 3; j > 0; j--) {
                System.out.print(" ");
            }
            if (i != n - 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
