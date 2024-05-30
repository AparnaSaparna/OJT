// Write a program that finds and prints the first prime number greater than a given number N.
// Use the break statement to exit the loop once the first prime number is found

import java.util.Scanner;

public class prgm5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        scanner.close();

        int nextPrime = N + 1;
        while (!isPrime(nextPrime)) {
            nextPrime++;
        }

        System.out.println("The first prime number greater than " + N + " is " + nextPrime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
