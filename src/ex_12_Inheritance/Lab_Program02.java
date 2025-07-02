package ex_12_Inheritance;

class Vehicle{

    Vehicle(){
        System.out.println("Vehicle is ready..............");
    }

}
class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready..................");
    }
}
public class Lab_Program02 {
    public static void main(String[] args) {
        Bike bk=new Bike();
    }
    }

