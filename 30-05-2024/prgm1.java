// 1.	Write a program that reads a series of integers from the user and prints the sum of the numbers.
// The program should stop reading numbers when the user enters a negative number. 
// Use the break statement to exit the loop.

import java.util.Scanner;

public class prgm1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int sum=0;
        while(true){
            int num=sc.nextInt();
            if(num<0){
                break;
                
                }
                sum+=num;
                }
                System.out.println("Sum"+sum);

    }
}
