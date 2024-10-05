import java.util.Scanner;

public class Q73_CheckStringPalindromicOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev.equals(s) ? "Palindrome " : "Not Palindrome");
    }
}
