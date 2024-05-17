import java.util.Scanner;

public class Employee {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age= scanner.nextInt();

        System.out.println("M or F:");
        String sex= scanner.nextLine();
    if(sex.equals("F")){
      System.out.print("She will work only urban Areas");
    }
    else if(sex.equals("M")) 
    {
        if(age>=20 && age<=40){
            System.out.print("He may work anywhere");
        }
        else if(age>=40 && age<=60)
        {
            System.out.println("He will work urban Areas only");
        }
    }
    else{
        System.out.println("Error");
    }

    }
}
