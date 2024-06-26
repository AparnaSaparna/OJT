public class factorial {
    public static void main(String[] args) {
        int number = 1;
        int factorial = factorial(number);
        System.out.println("Factorial of " + number + " (Recursive): " + factorial);
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}