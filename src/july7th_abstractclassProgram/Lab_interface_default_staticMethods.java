package july7th_abstractclassProgram;

public class Lab_interface_default_staticMethods {
    public static void main(String[] args) {

        Car car=new Car();
      //  car.start();
        car.fuelType();
        Vehicle.fuelType();
    }
}
interface Vehicle{
    static void fuelType(){
        System.out.println("Fuel type is Petrol");
    }
    default void start(){
        System.out.println("Vehicle started");
    }

}
class Car implements Vehicle{
    static void fuelType(){
        System.out.println("Fuel type is cng");
    }

}
