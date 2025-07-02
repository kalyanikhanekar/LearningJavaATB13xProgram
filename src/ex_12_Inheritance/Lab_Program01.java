package ex_12_Inheritance;

class Animal{
    void makeSound(){
        System.out.println("Animal sound..........");
    }
}
class Cat extends Animal{

    void meow(){
        System.out.println("Meow............");
    }

}

public class Lab_Program01 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Animal animal=new Animal();
        cat.makeSound();
        cat.meow();
    }
}
