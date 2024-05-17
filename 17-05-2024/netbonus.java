import java.util.Scanner;

public class netbonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = yearsOfService > 5 ? salary * 0.05 : 0;

        System.out.println("Your bonus amount is: " + bonus);

        scanner.close();
    }
}
