package July3rd_polymorphism.July3rd_methodOverriding;

public class Lab_engineStart {

    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle();
        vehicle.start();
        Bike bike=new Bike();
        bike.start();
        Car car=new Car();
        car.start();
    }
}
class Vehicle
{
    void start(){
        System.out.println("Vehicle should start before used...");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Kick Start the Bike..");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Turn the key to start the car");
    }
}
