package July3rd_polymorphism;

public class Lab_userlogin {
    public static void main(String[] args) {

        Greeter user=new Greeter();
        user.greet();
        user.greet("Kalyani");
    }
}
class Greeter{

    void greet(){
        System.out.println("Welcome.....");
    }
    void greet(String name){
        System.out.println("Welcome "+name);
    }
}