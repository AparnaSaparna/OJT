// Write a program that reads a comma-separated string of numbers 
// from the user and converts it into an array of integers. Then, print the array.

import java.util.Scanner;
import java.util.Arrays;

public class prgm3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers");
        String myStr = scanner.nextLine();
        char[] myArray = myStr.toCharArray();
          System.out.println(Arrays.toString(myArray));   
}
}