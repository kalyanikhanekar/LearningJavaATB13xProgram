package july4th_SuperThis;

public class Lab_ParentConstructorUsingSuper {
    public static void main(String[] args) {

        Cat cat=new Cat("Domastic");
        Tiger tiger=new Tiger("wild animals");

    }
}

class Animal{

    String type;
    Animal(){
        System.out.println("Animal Default...");
    }
    Animal(String type){
        System.out.println(type);

    }
}
class Cat extends Animal{
   Cat(){
       System.out.println("Cat default....");
   }
   Cat(String type){
       super("Domastic");
   }
}
class Tiger extends Animal{
    Tiger(String type){
        super(type);
    }
}