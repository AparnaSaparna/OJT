import java.util.Scanner;

public class leapyear {

    public static void main (String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        if(year%4==0 || year%100==0 && year%400==0){
            System.out.print("Year is leapyear");
        }
        else{
            System.out.print("Not a leap year");
        }
    }
}