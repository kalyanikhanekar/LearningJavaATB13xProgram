package july7th_abstractclassProgram;

public class Lab_AbstractClass_ConcreteMethod {
    public static void main(String[] args) {
        Child child=new Child();
        child.show();
        child.display();
    }
}
abstract class Parent{
    abstract void show();
    void display(){
        System.out.println("Abstract class concrete method calling...");
    }
}
class Child extends Parent{
  void  show(){

      System.out.println("Show() abstract method from child class...");
    }
}