import java.util.Scanner;

public class OldestAndYoungest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of person " + (i+1) + ": ");
            int age = scanner.nextInt();
            
            oldest = Math.max(oldest, age);
            youngest = Math.min(youngest, age);
        }
        
        System.out.println("The oldest person is " + oldest + " years old.");
        System.out.println("The youngest person is " + youngest + " years old.");
        
        scanner.close();
    }
}
