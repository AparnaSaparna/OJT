public class Palindrome {
    public static void main(String[] args){
        String value="ammu";
        String rev= new StringBuilder(value).reverse().toString();
        if(value.equals(rev)) {
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }
        }
}
