// Write a program that uses the Scanner class to read a line of text and 
// then counts the number of words in the line. 
// Assume words are separated by spaces.


import java.util.Scanner;

public class prgm2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.println("Number of words: " + words.length);
        }
        }