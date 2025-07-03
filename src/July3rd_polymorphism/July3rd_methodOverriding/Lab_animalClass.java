package July3rd_polymorphism.July3rd_methodOverriding;

public class Lab_animalClass {
    public static void main(String[] args) {

        Animal animal=new Animal();
        animal.sound();
        Animal a1=new Dog();
        a1.sound();
        Cat cat=new Cat();
        System.out.println("Cat sound() calling.....");
        cat.sound();
        Dog dog=new Dog();
        System.out.println("Dog sound() calling.....");
        dog.sound();
        Cow cow=new Cow();
        System.out.println("Cow sound() calling.....");
        cow.sound();

    }
}

class Animal{
        void sound(){
            System.out.println("Animal parent calss sound method calling");

        }
}

class Cat extends Animal{
        void sound(){
            System.out.println("Meow.....Meow...........Meow...........");
        }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark.....Bark...........Bark...........");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("Moo.....Moo...........Moo...........");
    }
}