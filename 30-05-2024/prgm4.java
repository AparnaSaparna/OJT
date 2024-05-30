// 4.	Create a Person class with attributes name and age. Write a program that creates an array of Person objects, 
// initializes them with user input, and then prints out the details of each Person.

import java.util.Scanner;
class Person{
    String name;
    int age;
   public Person(String name,int age){
    this.name= name;
    this.age =age;

   }
   public void display(){
    System.out.println("Name: "+name+" Age "+age);
   }
   
   } 

public class prgm4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and age:");
        String name = sc.nextLine();
      
        int age = sc.nextInt();
        Person per = new Person(name,age);
        per.display();

       
    
}
}