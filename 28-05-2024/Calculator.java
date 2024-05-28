public class Calculator {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero is not allowed.");
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(12, 12));      
        System.out.println(subtract(12, 2));  
        System.out.println(multiply(12, 2));  
        System.out.println(divide(12, 2));  

        try {
            divide(10.5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
