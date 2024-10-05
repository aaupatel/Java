public class Q68_SpecialNumberUsingMethods_1to100_ {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isSpecialNumber(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original || isFactorial(original);
    }

    public static boolean isFactorial(int num) {
        int fact = 1;
        int i = 1;
        while (fact <= num) {
            if (fact == num) {
                return true;
            }
            i++;
            fact *= i;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Special Number from 1 - 100");
        for (int i = 1; i <= 100; i++) {
            if (isSpecialNumber(i))
                System.out.println(i + " is Special No");
        }
    }

}
