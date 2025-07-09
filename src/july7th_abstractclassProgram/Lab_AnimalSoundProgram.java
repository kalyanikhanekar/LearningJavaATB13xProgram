package july7th_abstractclassProgram;

public class Lab_AnimalSoundProgram {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.makeSound();
        Cat cat=new Cat();
        cat.makeSound();
    }

}
abstract class Animal{
    abstract void makeSound();

}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}