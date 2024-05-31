public class MethodOverLoading {

    public void add(int a)
    {
        System.out.println("hello "+a);
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        MethodOverLoading myobjt = new MethodOverLoading();
        myobjt.add(10);
        myobjt.add(10, 12);
        myobjt.add(10, 12, 14);
    }
    
}