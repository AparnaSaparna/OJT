public class uppercaseOrLowercase {

    public static void main(String[] args){
        char str='h';
        if(str>=65 && str<=90){
            System.out.print("Uppercase");
        }
        else if(str>=97 && str<=122){
            System.out.print("lowercase");
        }
        else{
            System.out.print("Invalid");
        }
    } 
}