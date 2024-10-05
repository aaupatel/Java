public class Q67_StrongNumberUsingMethods {

    public static int fact(int n) {
        int fact = 1;
        while (n != 0) {
            fact = fact * n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += fact(rem);
            n = n/10;
        }
        System.out.println(sum == temp ? "Strong No" : "Not a Strong No");
    }
}
