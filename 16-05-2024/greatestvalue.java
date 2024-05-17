import java.util.Scanner;

public class greatestvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first integer
        System.out.print("Enter the first integer: ");
        int firstInt = scanner.nextInt();

        // Input second integer
        System.out.print("Enter the second integer: ");
        int secondInt = scanner.nextInt();

        // Find the greatest integer
        int greatestInt = Math.max(firstInt, secondInt);

        // Print the result
        System.out.println("The greatest integer is: " + greatestInt);

        // Close the scanner
        scanner.close();
    }
}