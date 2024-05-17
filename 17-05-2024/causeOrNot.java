import java.util.Scanner;

public class causeOrNot {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.print("Do you have any medical cause to sit? (Y/N)");
            String response = scanner.nextLine();

            if (response.equals("Y")){
                System.out.print("You are allowed");
            }
            else if (response.equals("N")) {
                System.out.print("You are not allowed");
            }
    }
}