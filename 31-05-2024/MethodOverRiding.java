public class MethodOverRiding {
    public static void main(String[] args){
        Animal myobject = new Animal();
        myobject.sound();
        cat mydog = new cat();
        mydog.sound();

    }
}
class Animal
{
   public void sound(){
    System.out.println("Animal is making a sound");
   }
}
class cat extends Animal{
    public void sound(){
        System.out.println("Dog is barking");
}
}