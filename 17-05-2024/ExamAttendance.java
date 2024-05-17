import java.util.Scanner;

public class ExamAttendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter classes held and attended (separated by space): ");
        int totalClasses = scanner.nextInt();
        int attendedClasses = scanner.nextInt();

        double attendancePercentage = attendedClasses * 100.0 / totalClasses;

        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        System.out.println(attendancePercentage >= 75 ? "You are allowed to sit in the exam." : "You are not allowed to sit in the exam.");

        scanner.close();
    }
}
